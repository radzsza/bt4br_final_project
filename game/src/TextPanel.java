/**
 * Extends JPanel. Allows to create panels with background image.
 * Used mainly for displaying plot-related panels, such as the email one.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextPanel extends JPanel {

    /**
     * Class constructor, makes centered single column text panel
     * @param contentPane - as in MainMenu
     * @param filename - file to display its content
     */
    public TextPanel(JPanel contentPane, String filename) {

        String filePath = "resources/textfiles/" + filename + ".txt";

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        setBackground(Color.WHITE);

        // content
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(100, 5, 15, 15);
        JTextArea fileContent = new JTextArea(TextfileReader.getContents(filePath));
        fileContent.setEditable(false);
        fileContent.setFont(new Font("Monocraft", Font.BOLD, 20));
        add(fileContent, c);


        // next button - goes to plots tutorial
        c.gridy = 1;
        c.weighty = 1;
        c.weightx = 1;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        c.insets = new Insets(30, 5, 15, 15);
        add(getNextButton(contentPane), c);

    }

    /**
     * class constructor, makes two-column panel with optional plot graphics
     * @param contentPane - see MainMenu
     * @param filename1 - text file for the first column to display
     * @param filename2 - text file for the second column to display
     * @param plotType1 - plot type for the first column
     * @param plotType2 - plot type for the second column
     */
    public TextPanel(JPanel contentPane, String filename1, String filename2, String plotType1, String plotType2) {
        String filePath1 = "resources/textfiles/" + filename1 + ".txt";
        String filePath2 = "resources/textfiles/" + filename2 + ".txt";

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        setBackground(Color.WHITE);

        // content 1
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(100, 15, 15, 15);
        JTextArea filecontent1 = new JTextArea(TextfileReader.getContents(filePath1));
        filecontent1.setEditable(false);
        filecontent1.setLineWrap(true);
        filecontent1.setColumns(50);
        filecontent1.setFont(new Font("Monocraft", Font.BOLD, 20));
        add(filecontent1, c);

        c.gridx = 2;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(30, 15, 15, 15);
        JTextArea filecontent2 = new JTextArea(TextfileReader.getContents(filePath2));
        filecontent2.setEditable(false);
        filecontent2.setLineWrap(true);
        filecontent2.setColumns(50);
        filecontent2.setFont(new Font("Monocraft", Font.BOLD, 20));
        add(filecontent2, c);

        // if plotType1 is not empty, generate plots
        if (!plotType1.isEmpty()) {
            c.gridwidth = 1;
            c.gridy = 1;
            c.gridx = 0;
            c.anchor = GridBagConstraints.CENTER;
            c.insets = new Insets(30, 15, 15, 15);
            JLabel plot1_good = new JLabel(new ImageIcon("resources/img/plot_images/" + plotType1 + "_good.png"));
            add(plot1_good, c);

            c.gridx = 1;
            c.anchor = GridBagConstraints.CENTER;
            c.insets = new Insets(30, 15, 15, 15);
            JLabel plot1_bad = new JLabel(new ImageIcon("resources/img/plot_images/" + plotType1 + "_bad.png"));
            add(plot1_bad, c);
        }

        // if plotType2 is not empty, generate plots
        if (!plotType2.isEmpty()) {
            System.out.println("plotType2: " + plotType2);
            c.weightx = 1;
            c.gridx = 2;
            c.anchor = GridBagConstraints.LINE_END;
            c.insets = new Insets(30, 15, 15, 15);
            JLabel plot2_good = new JLabel(new ImageIcon("resources/img/plot_images/" + plotType2 + "_good.png"));
            add(plot2_good, c);

            c.gridx = 3;
            c.anchor = GridBagConstraints.LINE_END;
            c.insets = new Insets(30, 15, 15, 15);
            JLabel plot2_bad = new JLabel(new ImageIcon("resources/img/plot_images/" + plotType2 + "_good.png"));
            add(plot2_bad, c);
        }

        // NEXT BUTTON
        c.gridy = 2;
        c.gridx = 3;
        c.weighty = 1;
        c.weightx = 1;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        c.insets = new Insets(0, 0, 15, 15);
        add(getNextButton(contentPane), c);
    }

    /**
     * @param contentPane the same content pane
     * @return - Button with "NEXT" as text, switching to the next panel
     */
    private Button getNextButton (JPanel contentPane) {
        Button nextButton = new Button("NEXT", new Dimension(200, 80), 20);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.next(contentPane);
            }
        });
        return nextButton;
    }
}

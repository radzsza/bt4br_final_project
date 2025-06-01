import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlotCreator extends JPanel {
    final private String[] monocolorOptions = {"BLACK", "WHITE", "RED", "BLUE", "GREEN", "YELLOW", "PINK"};
    final private String[] conditionBasedOptions = {"VIRIDIS", "MAGMA", "PLASMA", "INFERNO"};
    final private String[] themeOptions = {"MINIMAL", "d", "e", "f", "g", "h", "i", "j"};

    public PlotCreator(JPanel contentPane, String plotTypeName, int plotNumber) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.insets = new Insets(30, 30, 30, 30);
        JLabel plotTypeLabel = new Label(plotTypeName, 40, Color.BLACK);
        //plotTypeLabel.setFont(new Font("Monocraft", Font.BOLD, 40));
        add(plotTypeLabel, c);

        // PLOT
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 8;
        //c.weightx = 1;
        c.insets = new Insets(30, 50, 30, 30);
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        ImageIcon plot = getPlot("points");
        JLabel plotLabel = new JLabel(plot);
        plotLabel.setBackground(Color.BLACK);
        plotLabel.setOpaque(true);
        add(plotLabel, c);

        c.gridx = 0;
        c.gridy = 1;
        c.gridheight = 1;
        c.insets = new Insets(0, 30, 10, 10);
        c.anchor = GridBagConstraints.LINE_START;
        JLabel label1 = new Label("Theme:", 20, Color.GRAY);
        add(label1, c);

        c.gridy = 2;
        c.insets = new Insets(0, 30, 10, 10);
        c.anchor = GridBagConstraints.LINE_START;
        JComboBox<String> themeComboBox = new ComboBox(themeOptions);
        add(themeComboBox, c);

        c.gridy = 6;
        c.insets = new Insets(30, 30, 10, 10);
        c.anchor = GridBagConstraints.LINE_START;
        JLabel colorLabel = new Label("Palette:", 20, Color.GRAY);
        add(colorLabel, c);

        c.gridy = 7;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 10);
        JComboBox<String> colorChoice = new ComboBox(monocolorOptions);
        // needs debugging

        add(colorChoice, c);

        ButtonGroup rbg = new ButtonGroup();
        c.gridy = 3;
        c.insets = new Insets(30, 30, 10, 10);
        JLabel coloringMethodLabel = new Label("Coloring method:", 20, Color.GRAY);
        add(coloringMethodLabel, c);

        c.gridy = 4;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 10);
        JRadioButton monocolorRadioButton = new RadioButton("MONOCOLOR", rbg, colorChoice, monocolorOptions);
        monocolorRadioButton.setSelected(true);

        add(monocolorRadioButton, c);

        c.gridy = 5;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 10);
        JRadioButton conditionBasedRadioButton = new RadioButton("CONDITION BASED", rbg, colorChoice, conditionBasedOptions);
        add(conditionBasedRadioButton, c);

        c.gridy = 8;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(30, 30, 10, 10);
        Button applyButton = new Button("APPLY", new Dimension(220, 70), 20);
        applyButton.setPlotCreatorAesthetics();
        add(applyButton, c);

        c.gridx = 1;
        c.gridy = 9;
        c.weighty = 1;
        c.weightx = 1;
        c.insets = new Insets(10, 10, 10, 10);
        c.anchor = GridBagConstraints.LAST_LINE_END;
        Button nextButton = new Button("NEXT", new Dimension(220, 70), 20);
        nextButton.setPlotCreatorAesthetics();
        if (plotNumber == 2) {
            nextButton.setText("SAVE");
        }
        add(nextButton, c);


    }

    private ImageIcon getPlot(String filename){
        return new ImageIcon("img/" + filename + ".png");
    }
}

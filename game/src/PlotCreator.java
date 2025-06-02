import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlotCreator extends JPanel {
    final private String[] monocolorOptions = {"BLACK", "WHITE", "RED", "GREEN", "BLUE", "YELLOW", "ORANGE", "TURQUOISE"};
    final private String[] conditionBasedOptions = {"RED-GREEN", "YELLOW-BLUE", "ORANGE-TURQUOISE"};
    final private String[] themeOptions = {"MINIMAL", "DARK", "BLACK-WHITE", "f", "g", "h", "i", "j"};

    private ComboBox monoPaletteBox;
    private ComboBox conditionPaletteBox;

    public PlotCreator(JPanel contentPane, String plotTypeName, int plotNumber) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Big label with plot type, upper left corner
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.insets = new Insets(50, 50, 30, 30);
        JLabel plotTypeLabel = new Label(plotTypeName, 40, Color.BLACK);
        add(plotTypeLabel, c);

        // plot - default is minimal, red-green color palette
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 9;
        c.weightx = 1;
        c.insets = new Insets(30, 50, 30, 30);
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        c.insets = new Insets(50, 50, 50, 30);
        PlotLabel plotLabel = new PlotLabel(themeOptions[0].toLowerCase(), conditionBasedOptions[0].toLowerCase(), plotNumber);
        add(plotLabel, c);

        c.gridheight = 1;
        // theme option chose through a combo box
        // label
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 30);
        Label themeLabel = new Label("Theme:", 20, Color.GRAY);
        add(themeLabel, c);

        // combo box
        c.gridy = 2;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 30, 30);
        ComboBox themeBox = new ComboBox(themeOptions);
        themeBox.setSelectedIndex(0);

        // action listener, so the combo box affects the plot
        themeBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                plotLabel.setTheme(themeBox.getSelectedItem().toString().toLowerCase());
                } catch (NullPointerException ex) {
                    plotLabel.setTheme(themeOptions[0]);
                }
            }
        });

        add(themeBox, c);

        // Coloring options - monocolor or condition based - 2 radio buttons
        // button group - ensuring only one button is selected at the time
        ButtonGroup rbg = new ButtonGroup();

        // label
        c.gridy = 3;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 30);
        JLabel coloringLabel = new Label("Coloring:", 20, Color.GRAY);
        add(coloringLabel, c);

        // radio button 1 - monocolor
        c.gridy = 4;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 30);
        RadioButton monoRadioButton = new RadioButton("MONOCOLOR", rbg);
        monoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monoPaletteBox.setVisible(true);
                conditionPaletteBox.setVisible(false);
                plotLabel.setMonoBackground(MyColor.getColor(monocolorOptions[0]));
            }
        });
        add(monoRadioButton, c);

        //radio button 2 - condition based coloring
        c.gridy = 5;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 30, 30);
        RadioButton conditionRadioButton = new RadioButton("CONDITION BASED", rbg);
        conditionRadioButton.setSelected(true);
        conditionRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monoPaletteBox.setVisible(false);
                conditionPaletteBox.setVisible(true);
                plotLabel.setConditionBasedBackground(conditionBasedOptions[0].toLowerCase());
            }
        });
        add(conditionRadioButton, c);

        // color palette (mono or condition based) - dynamic combo box
        // label
        c.gridy = 6;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 30);
        Label paletteLabel = new Label("Color palette:", 20, Color.GRAY);
        add(paletteLabel, c);

        // combo boxes - 2 combo boxes for both coloring methods
        // changing visibility depending on the coloring method
        // combo box for monocolor palette
        c.gridy = 7;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 30, 30);
        monoPaletteBox = new ComboBox(monocolorOptions);
        monoPaletteBox.setSelectedIndex(0);
        monoPaletteBox.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   plotLabel.setMonoBackground(MyColor.getColor(monoPaletteBox.getSelectedItem().toString()));
               } catch (NullPointerException ex) {
                   plotLabel.setMonoBackground(MyColor.getColor(monocolorOptions[0]));
               }
           }
        });
        add(monoPaletteBox, c);
        monoPaletteBox.setVisible(false);

        // combo box for condition based palette
        conditionPaletteBox = new ComboBox(conditionBasedOptions);
        conditionPaletteBox.setSelectedIndex(0);
        conditionPaletteBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    plotLabel.setConditionBasedBackground(conditionPaletteBox.getSelectedItem().toString().toLowerCase());
                } catch (NullPointerException ex) {
                    conditionPaletteBox.setSelectedIndex(0);
                }
            }
        });
        add(conditionPaletteBox, c);
        conditionPaletteBox.setVisible(true);

        c.gridy = 9;
        c.gridx = 1;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        c.weighty = 1;
        c.weightx = 1;
        c.insets = new Insets(0, 50, 30, 50);
        Button nextButton = new Button("NEXT", new Dimension(200, 80), 20);
        if (plotNumber == 2){
            nextButton.setText("SAVE AND SEND");
            nextButton.setPreferredSize(new Dimension(250, 80));
            nextButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO add panel after the last plot
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    //cardLayout.show(contentPane, );
                }
            });
        } else {
            nextButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nextName = "plot " + (plotNumber + 1);
                    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                    cardLayout.show(contentPane, nextName);
                }
            });
        }
        add(nextButton, c);
    }

}

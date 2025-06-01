import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlotCreator extends JPanel {
    final private String[] monocolorOptions = {"BLACK", "WHITE", "RED", "BLUE", "GREEN", "YELLOW", "PINK"};
    final private String[] conditionBasedOptions = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    final private String[] themeOptions = {"c", "d", "e", "f", "g", "h", "i", "j"};

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

        c.gridy = 1;
        c.insets = new Insets(0, 30, 10, 10);
        JLabel label1 = new Label("Theme:", 20, Color.GRAY);
        add(label1, c);
        c.gridy = 2;
        c.insets = new Insets(0, 30, 10, 10);
        JComboBox<String> themeComboBox = new ComboBox(themeOptions);
        add(themeComboBox, c);

        c.gridy = 6;
        c.insets = new Insets(30, 30, 10, 10);
        JLabel colorLabel = new Label("Color:", 20, Color.GRAY);
        add(colorLabel, c);

        c.gridy = 7;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 10);
        JComboBox<String> colorChoice = new ComboBox(themeOptions);
        add(colorChoice, c);

        ButtonGroup rbg = new ButtonGroup();
        c.gridy = 3;
        c.insets = new Insets(30, 30, 10, 10);
        JLabel coloringMethodLabel = new Label("Coloring method:", 20, Color.GRAY);
        add(coloringMethodLabel, c);

        c.gridy = 4;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 10);
        JRadioButton monocolorRadioButton = new RadioButton("MONOCOLOR", rbg, colorChoice, monocolorOptions, colorLabel);
        monocolorRadioButton.setSelected(true);

        add(monocolorRadioButton, c);

        c.gridy = 5;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(0, 30, 10, 10);
        JRadioButton conditionBasedRadioButton = new RadioButton("CONDITION BASED", rbg, colorChoice, conditionBasedOptions, colorLabel);
        add(conditionBasedRadioButton, c);

        c.gridy = 8;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(30, 30, 10, 10);
        JButton applyButton = new Button("APPLY", new Dimension(250, 80), 20);
        add(applyButton, c);

        c.gridx = 1;
        c.gridy = 9;
        c.weighty = 1;
        c.weightx = 1;
        c.insets = new Insets(10, 10, 10, 10);
        c.anchor = GridBagConstraints.LAST_LINE_END;
        JButton nextButton = new Button("NEXT", new Dimension(250, 80), 20);
        if (plotNumber == 2) {
            nextButton.setText("SAVE");
        }
        add(nextButton, c);
    }
}

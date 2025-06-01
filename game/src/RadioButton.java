import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JRadioButton {

    public RadioButton(String label, ButtonGroup buttonGroup, JComboBox<String> controledJComboBox, String[] comboBoxOptions) {
        setText(label);
        setFont(new Font("Monocraft", Font.BOLD, 20));
        setFocusPainted(false);
        buttonGroup.add(this);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controledJComboBox.removeAllItems();
                for (String item : comboBoxOptions) {
                    controledJComboBox.addItem(item);
                }
            }
        });
    }
}

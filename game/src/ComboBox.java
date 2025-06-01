import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JComboBox<String> {
// JLabel plotLabel, boolean colorControl
    public ComboBox(String[] items) {
        this.setAesthetics();
        for (String item : items) {
            this.addItem(item);
        }
        /*
        if (colorControl) {
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    plotLabel.setBackground(Color.getColor(getSelectedItem().toString().toLowerCase()));
                }
            });
        } else {
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }
         */
    }

    private void setAesthetics() {
        setFont(new Font("Monocraft", Font.BOLD, 20));
        setPreferredSize(new Dimension(250, 50));
        setBackground(Color.WHITE);
    }
}

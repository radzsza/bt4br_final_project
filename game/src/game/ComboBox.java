/**
 * Class extending the JComboBox, so I don't have to set its aesthetics every time.
 */

import javax.swing.*;
import java.awt.*;

public class ComboBox extends JComboBox<String> {

    /**
     * Class constructor - sets the aesthetics and adds the items.
     * @param items - String[] (array) containing all the options to choose from in the ComboBox instance.
     */
    public ComboBox(String[] items) {
        setFont(new Font("Monocraft", Font.BOLD, 20));
        setPreferredSize(new Dimension(250, 50));
        setBackground(Color.WHITE);
        for (String item : items) {
            this.addItem(item);
        }
    }

}

/**
 * Extends JLabel. Is a JLabel with set aesthetics.
 */

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    /**
     * class constructor
     * @param text - displayed text, see JLabel text field
     * @param fontSize - text's font size
     * @param color - text's color
     */
    public Label(String text, int fontSize, Color color) {
        setText(text);
        setFont(new Font("Monocraft", Font.BOLD, fontSize));
        setForeground(color);
    }

}

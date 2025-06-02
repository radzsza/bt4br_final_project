/**
 * Class allowing to create a JRadioButton and set its aesthetics automatically,
 * so I don't have to do it in all the JRadioButtons
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JRadioButton {

    /**
     * @param label - text displayed along the RadioButton (works as in JRadioButton)
     * @param buttonGroup - ButtonGroup to which the RadioButton belongs
     */
    public RadioButton(String label, ButtonGroup buttonGroup) {
        setText(label);
        setFont(new Font("Monocraft", Font.BOLD, 20));
        setFocusPainted(false);
        buttonGroup.add(this);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends JRadioButton {

    public RadioButton(String label, ButtonGroup buttonGroup) {
        setText(label);
        setFont(new Font("Monocraft", Font.BOLD, 20));
        setFocusPainted(false);
        buttonGroup.add(this);
    }
}

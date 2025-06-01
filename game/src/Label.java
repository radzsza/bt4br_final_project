import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(String text, int fontSize, Color color) {
        setText(text);
        setFont(new Font("Monocraft", Font.BOLD, fontSize));
        setForeground(color);
    }
}

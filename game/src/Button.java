import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button(String text, Dimension size, int fontSize) {
        setText(text);
        setPreferredSize(size);
        setFont(new Font("Monocraft", Font.BOLD, fontSize));
        setBackground(Color.GRAY);
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 4));
        setFocusPainted(false);
    }
}

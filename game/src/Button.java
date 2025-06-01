import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button extends JButton {
    private int fontSize;
    private Dimension size;
    private String text;

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("img/button.png").getImage(), 0, 0, getWidth(), getHeight(), this);
        super.paintComponent(g);
    }

    public Button(String text, Dimension size, int fontSize) {
        this.text = text;
        this.fontSize = fontSize;
        this.size = size;
        setText(text);
        setFocusPainted(false);
        setPreferredSize(size);
        setDefaultAesthetics();
        // TODO add mouse listener, so the button graphically reacts to clicking and mouse movement in default aesthetics
    }

    public void setDefaultAesthetics() {
        setOpaque(true);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFont(new Font("Monocraft", Font.BOLD, fontSize));
        setForeground(Color.WHITE);
    }

    public void setPlotCreatorAesthetics() {
        setBackground(Color.GRAY);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 4));
        setFont(new Font("Monospaced", Font.PLAIN, 12));
        setBorderPainted(true);
    }
}

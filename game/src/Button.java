import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class Button extends JButton {

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("img/buttom.png").getImage(), 0, 0, getWidth(), getHeight(), this);
        super.paintComponent(g);
    }

    public Button(String text, Dimension size, int fontSize) {
        setText(text);
        setOpaque(true);
        setContentAreaFilled(false);
        setBorderPainted(false);
        // previous graphical settings (rendered purely with java colors)
        //setBackground(Color.GRAY);
        //setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 4));
        setPreferredSize(size);
        setFont(new Font("Monocraft", Font.BOLD, fontSize));
        setForeground(Color.WHITE);
        setFocusPainted(false);

        // TODO add mouse listener, so the button graphically reacts to clicking and mouse movement
    }

    ///*
    //*/
}

/**
 * Class extending JButton, mostly used to create button having the game aesthetics.
 * Overrides paintComponent() to display a custom image.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button extends JButton {
    private int fontSize;
    private Dimension size;
    private String text;

    /**
     * class constructor
     * @param text - text to be displayed on the instance, works as in JButton
     * @param size - size to set the Button to, by setPreferredSize() from JButton
     * @param fontSize - text's font size
     */
    public Button(String text, Dimension size, int fontSize) {
        this.text = text;
        this.fontSize = fontSize;
        this.size = size;
        setText(text);
        setFocusPainted(false);
        setPreferredSize(size);
        setDefaultAesthetics();
    }

    /**
     * sets default aesthetics - pixel-like button image
     */
    public void setDefaultAesthetics() {
        setOpaque(true);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFont(new Font("Monocraft", Font.BOLD, fontSize));
        setForeground(Color.WHITE);
    }

    /**
     * modifies the displayed aesthetics to plain gray body witt darker borders
     */
    public void setPlotCreatorAesthetics() {
        setContentAreaFilled(true);
        setBackground(Color.GRAY);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 4));
        setBorderPainted(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon(getClass().getResource("img/button.png")).getImage(), 0, 0, getWidth(), getHeight(), this);
        super.paintComponent(g);
    }
}

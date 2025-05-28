import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MainMenu extends JPanel {

    public MainMenu(){
        setOpaque(false);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        c.anchor = GridBagConstraints.PAGE_END;
        c.weighty = 1;
        JButton startButton = new Button("START", new Dimension(700, 250), 60);
        add(startButton, c);

        c.fill = GridBagConstraints.NONE;

        c.weightx = 0;
        c.gridx = 1;
        c.gridy = 1;
        c.ipady = 30;
        c.anchor = GridBagConstraints.LINE_START;
        JButton githubButton = new Button("GITHUB", new Dimension(200, 50), 25);
        add(githubButton, c);

        c.gridx = 2;
        c.anchor = GridBagConstraints.CENTER;

        JButton aboutButton = new Button("ABOUT", new Dimension(200, 50), 25);
        add(aboutButton, c);


        c.gridx = 3;
        c.anchor = GridBagConstraints.LINE_END;
        JButton exitButton = new Button("EXIT", new Dimension(200, 50), 25);
        add(exitButton, c);
    }

    private void setButtonAesthetics(JButton button, int fontSize, Dimension size) {
        button.setPreferredSize(size);
        button.setFont(new Font("Monocraft", Font.BOLD, fontSize));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button.setBackground(Color.GRAY);
        button.setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(new ImageIcon("img/startbutton.PNG").getImage(), 0, 0, 0, 0, null);
    }


}

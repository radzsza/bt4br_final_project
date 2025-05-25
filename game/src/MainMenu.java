import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {
    public MainMenu() {
        setOpaque(false);
        //setOpaque(false);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 2;
        c.gridy = 1;
        c.anchor = GridBagConstraints.PAGE_END;
        c.weighty = 1;
        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Serif", Font.BOLD, 40));
        startButton.setPreferredSize(new Dimension(500, 250));
        //startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);

        add(startButton, c);

        c.gridy = 2;
        c.ipady = 30;
        c.anchor = GridBagConstraints.CENTER;
        JButton exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(300, 50));
        exitButton.setFocusPainted(false);
        add(exitButton, c);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(new ImageIcon("img/startbutton.PNG").getImage(), 0, 0, 0, 0, null);
    }
}

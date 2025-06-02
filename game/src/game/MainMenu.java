/**
 * Main menu class.
 * The class overrides the paintComponent() method to display its background image.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JPanel {

    /**
     * @param contentPane - frame's contentPane with CardLayout - allows to switch JPanels with the use of JComponent's ActionListener
     */
    public MainMenu(JPanel contentPane) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // setting localization
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        c.weighty = 1;
        c.anchor = GridBagConstraints.PAGE_END;

        // creating new button
        JButton startButton = new Button("START", new Dimension(700, 250), 60);

        // adding an action listener, so it does anything
        startButton.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "username");
            }
        });

        add(startButton, c);

        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0;
        c.anchor = GridBagConstraints.LINE_START;
        JButton githubButton = new Button("GITHUB", new Dimension(200, 90), 25);
        add(githubButton, c);

        c.gridx = 2;
        c.anchor = GridBagConstraints.CENTER;

        JButton aboutButton = new Button("ABOUT", new Dimension(200, 90), 25);
        add(aboutButton, c);

        c.gridx = 3;
        c.anchor = GridBagConstraints.LINE_END;
        JButton exitButton = new Button("EXIT", new Dimension(200, 90), 25);
        add(exitButton, c);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("src/resources/img/background_images/background_meme.png").getImage(), 0, 0, getWidth(), getHeight(), this);
    }

}

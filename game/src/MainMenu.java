/**
 * Main menu class.
 * The class overrides the paintComponent() method to display its background image.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MainMenu extends JPanel {

    /**
     * @param contentPane - frame's contentPane with CardLayout - allows to switch JPanels with the use of JComponent's ActionListener
     */
    public MainMenu(JPanel contentPane) {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // setting localization
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
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
                cardLayout.show(contentPane, "background start");
            }
        });

        add(startButton, c);
        c.gridwidth = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(30, 5, 5, 5);
        JButton aboutButton = new Button("ABOUT", new Dimension(325, 90), 25);

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    try {
                        desktop.browse(new URI("https://github.com/radzsza/bt4br"));
                    } catch (IOException | URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Browse operation is not supported, to learn more about the project please go to https://github.com/radzsza/bt4br");
                }
            }
        });

        add(aboutButton, c);

        c.gridx = 1;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(30, 5, 5, 5);
        JButton exitButton = new Button("EXIT", new Dimension(325, 90), 25);
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
        g.drawImage(new ImageIcon("resources/img/background_images/background_meme.png").getImage(), 0, 0, getWidth(), getHeight(), this);
    }

}

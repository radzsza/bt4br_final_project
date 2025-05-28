import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JPanel {
    private JButton startButton;
    private JButton githubButton;
    private JButton aboutButton;
    private JButton exitButton;

    private JPanel contentPane;

    public MainMenu(){
        setOpaque(false);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        c.weighty = 1;
        c.anchor = GridBagConstraints.PAGE_END;
        startButton = new Button("START", new Dimension(700, 250), 60);
        add(startButton, c);

        startButton.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.next(contentPane);
            }
        });

        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0;
        c.anchor = GridBagConstraints.LINE_START;
        githubButton = new Button("GITHUB", new Dimension(200, 90), 25);
        add(githubButton, c);

        c.gridx = 2;
        c.anchor = GridBagConstraints.CENTER;

        aboutButton = new Button("ABOUT", new Dimension(200, 90), 25);
        add(aboutButton, c);


        c.gridx = 3;
        c.anchor = GridBagConstraints.LINE_END;
        exitButton = new Button("EXIT", new Dimension(200, 90), 25);
        add(exitButton, c);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    /**
    public MainMenu(int x){
        JLabel label = new JLabel(new ImageIcon("img/points.png"));
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
        add(label, BorderLayout.CENTER);
    }
     **/

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("img/background_meme.png").getImage(), 0, 0, getWidth(), getHeight(), this);
    }

}

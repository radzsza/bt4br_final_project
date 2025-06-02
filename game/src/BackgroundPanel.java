import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundPanel extends JPanel {
    String filename;

    public BackgroundPanel(JPanel contentPane, String filename) {
        this.filename = filename;
        setOpaque(false);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        c.insets = new Insets(0, 0, 15, 15);
        Button nextButton = new Button("NEXT", new Dimension(200,80), 20);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.next(contentPane);
            }
        });
        add(nextButton, c);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(new ImageIcon("resources/img/background_images/" + filename + ".png").getImage(), 0, 0, getWidth(), getHeight(), this);
        super.paint(g);
    }
}

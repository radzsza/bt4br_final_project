import javax.swing.*;
import java.awt.*;

public class Username extends JPanel {
    private String username;

    // TODO move buttons to the right lower corner, add components private fields
    // add a label instructing to enter their name
    // change the name of loginButton to clearButton
    // add a label greeting a player (if I have time)

    public Username(JPanel contentPane, Main main) {
        setOpaque(true);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_END;
        JTextField usernameField = new JTextField();
        usernameField.setFont(new Font("Monospaced", Font.PLAIN, 35));
        usernameField.setPreferredSize(new Dimension(450, 80));
        usernameField.setEditable(true);
        usernameField.setBackground(Color.WHITE);

        add(usernameField, c);

        c.gridx = 0;
        c.gridy = 1;
        //c.weighty = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.NONE;
        JButton loginButton = new Button("Clear", new Dimension(200, 100), 20);
        add(loginButton, c);

        c.gridy = 1;
        c.gridx = 1;
        //c.weightx = 1;
        c.weighty = 1;
        c.anchor = GridBagConstraints.LINE_END;
        JButton startButton = new Button("Start game", new Dimension(200, 100), 20);
        add(startButton, c);
    }

}

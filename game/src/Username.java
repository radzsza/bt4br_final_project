import javax.swing.*;
import java.awt.*;

public class Username extends JPanel {
    private String username;

    public Username() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        JTextField usernameField = new JTextField();
        usernameField.setEditable(true);
        usernameField.setBackground(Color.WHITE);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(usernameField, c);
    }
}

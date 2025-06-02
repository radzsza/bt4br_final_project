/**
 * Extends JPanel, creates a JPanel allowing to set username
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Username extends JPanel {
    private String username = "Student";

    // TODO add return button in the lt corner

    /**
     * class constructor
     * @param contentPane - see MainMenu contentPane
     */
    public Username(JPanel contentPane) {
        setOpaque(true);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Monocraft", Font.BOLD, 25));
        c.insets = new Insets(0, 0, 5,0);
        add(usernameLabel, c);

        c.gridy = 1;
        c.gridwidth = 3;

        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.LAST_LINE_START;
        JTextField usernameField = new JTextField();
        usernameField.setFont(new Font("Monocraft", Font.BOLD, 25));
        usernameField.setPreferredSize(new Dimension(500, 50));
        usernameField.setEditable(true);
        usernameField.setBackground(Color.WHITE);

        add(usernameField, c);

        c.fill = GridBagConstraints.NONE;

        c.gridy = 2;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(10, 10, 10, 0);
        JButton clearButton = new Button("CLEAR", new Dimension(150, 60), 20);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
            }
        });

        add(clearButton, c);

        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 0);
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        Button startButton = new Button("START", new Dimension(150, 60), 20);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usernameField.getText().isEmpty()) {
                    username = "Student";
                } else {
                    username = usernameField.getText();
                }
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.next(contentPane);
            }
        });

        add(startButton, c);
    }

    /**
     * @return username set by the user or "Student" if not set
     */
    public String getUsername() {
        return username;
    }

}

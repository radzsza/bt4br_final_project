// trying to understand java GridBagLayout (hopefully)
// to jest czysta prowizorka, pobaw się
// jeszcze nie skończyłam ofc
package java_files;

import javax.swing.*;
import java.awt.*;

public class Test {

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        SwingUtilities.invokeLater(new Runnable() { // just so it won't crash with any other possible processes
            @Override
            public void run() {
                JFrame frame = new JFrame(); // new frame (window)
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // stop if window is exited
                frame.add(new TestPane());
                frame.pack(); // ensure all elements are in their places in case of changing the window size
                frame.setVisible(true); // show the window
            }
        });
    }

    public class MyJButton extends JButton {
        public MyJButton(String text) {
            super();
            setText(text);
        }
    }

    public class TestPane extends JPanel {

        public TestPane() {
            setPreferredSize(new Dimension(500, 500)); // making it bigger size
            setLayout(new GridBagLayout()); // just set the layout manager
            GridBagConstraints gbc = new GridBagConstraints(); // kinda makes the layout working
            // setting layout size
            gbc.gridwidth = 3;
            gbc.gridheight = 3;
            //gbc.fill = GridBagConstraints.HORIZONTAL;

            JLabel label = new JLabel("Hi");
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.weightx = 0.5;
            gbc.weighty = 0.5;
            gbc.anchor = GridBagConstraints.CENTER;
            add(label, gbc);

            JButton button = new JButton("LU");
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weighty = 0;
            gbc.weightx = 0;
            gbc.anchor = GridBagConstraints.FIRST_LINE_START;
            add(button, gbc); // left upper corner

            gbc.gridx = 3;
            gbc.gridy = 0;
            gbc.weighty = 0;
            gbc.weightx = 1;
            gbc.anchor = GridBagConstraints.FIRST_LINE_END;
            button = new JButton("RU");
            add(button, gbc); // right upper corner

            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.weighty = 1;
            gbc.weightx = 0;
            gbc.anchor = GridBagConstraints.LAST_LINE_START;
            button = new JButton("LB");
            add(button, gbc); // left bottom corner

            gbc.gridx = 3;
            gbc.gridy = 3;
            gbc.weighty = 1;
            gbc.weightx = 1;
            // gbc.ipady = 40;
            gbc.anchor = GridBagConstraints.LAST_LINE_END;
            button = new JButton("RB");
            add(button, gbc); // right bottom corner

            // Będę próbowała dodać default action listenera, żeby tekst na środku się zmieniał
            //button.addActionListener(e -> {
            //   label.setText(button.getText());
            //});
        }
    }

}

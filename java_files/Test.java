// trying to understand java GridBagLayout (hopefully)
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

    public class TestPane extends JPanel {

        public TestPane() {
            setPreferredSize(new Dimension(500, 500)); // making it bigger size
            setLayout(new GridBagLayout()); // just set the layout manager
            GridBagConstraints gbc = new GridBagConstraints(); // kinda makes the layout working
            gbc.gridwidth = 3;
            gbc.gridheight = 3;
            //gbc.fill = GridBagConstraints.HORIZONTAL;

            gbc.gridx = 1;
            gbc.weighty = 0.0;
            add(new JButton("Up"), gbc);
            gbc.anchor = GridBagConstraints.PAGE_START;
            gbc.gridx = 0;
            gbc.weighty = 0.5;
            add(new JButton("Left"), gbc);
            gbc.anchor = GridBagConstraints.PAGE_END;
            gbc.gridx = 2;
            gbc.weighty = 0.5;
            add(new JButton("Right"), gbc);
            gbc.anchor = GridBagConstraints.PAGE_END;
            //gbc.insets = new Insets(10,0,0,0);
            gbc.gridx = 1;
            gbc.weighty = 1.0;
            add(new JButton("Down"), gbc);
        }

    }

}

// nawet na to nie patrz, sama średnio wiem co tu się dzieje
package java_files;

import javax.swing.*;
import java.awt.*;

public class TestGUI {

    public static void main(String[] args) {
        new TestGUI();
    }

    public TestGUI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TestGUI");
        frame.setPreferredSize(new Dimension(800, 600));
        frame.add(new TestMainPanel());
        frame.pack();
        frame.setVisible(true);
    }

    class TestMainPanel extends JPanel {
        public TestMainPanel() {
            setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            //c.fill = GridBagConstraints.BOTH;
            c.gridx = 2;
            c.gridy = 1;
            c.weighty = 10;
            c.gridwidth = 3;
            c.ipady = 100;
            c.fill = GridBagConstraints.HORIZONTAL;
            //c.anchor = GridBagConstraints.CENTER;
            JButton button = new JButton("Option 1");
            add(button, c);
            //c.anchor = GridBagConstraints.CENTER;

            c.gridx = 2;
            c.gridy = 3;
            c.weighty = 10;
            JButton button2 = new JButton("Option 2");
            add(button2, c);
        }
    }
}

// nawet na to nie patrz, sama średnio wiem co tu się dzieje
package java_files;

import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class TestGUI {

    public static void main(String[] args) {
        new TestGUI();
    }

    public TestGUI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TestGUI");
        frame.setPreferredSize(new Dimension(800, 600));
        frame.add(new TestMainPanel(1));
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

        public TestMainPanel(int x) {
            setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();

            c.gridx = 1;
            c.gridy = 0;
            c.gridwidth = 3;
            c.weighty = 1;
            c.ipady = 150;
            c.ipadx = 300;
            c.fill = GridBagConstraints.HORIZONTAL;
            JButton button = new JButton("START");
            button.setFont(new Font("Monospaced", Font.PLAIN, 50));
            add(button, c);

            c.gridx = 3;
            c.gridy = 1;
            c.weighty = 1;
            c.ipady = 20;
            c.ipadx = 0;
            JButton button2 = new JButton("Info");
            button2.setFont(new Font("Monospaced", Font.PLAIN, 25));
            add(button2, c);
        }
    }
}

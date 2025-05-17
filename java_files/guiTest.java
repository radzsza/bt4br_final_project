package java_files;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class guiTest {
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JLayeredPane lp = new JLayeredPane();
        JPanel p = new JPanel();
        p.setBackground(Color.RED);
        p.setBounds(0,0,600,600);
        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        JButton clear = new JButton("Clear");
        reset.addActionListener(e -> {tf.setText("");});
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        panel.add(clear);
        lp.add(p, JLayeredPane.DEFAULT_LAYER);
        lp.add(panel, JLayeredPane.POPUP_LAYER);

        // Text Area at the Center
        JTextArea ta = new JTextArea();
        ta.setBounds(50, 50, 100, 100);

        send.addActionListener(e -> {
            ta.append(tf.getText());
            ta.append("\n");
            tf.setText("");
        });

        clear.addActionListener(e -> {
            ta.setText("");
        });

        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    ta.append(tf.getText());
                    ta.append("\n");
                    tf.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}

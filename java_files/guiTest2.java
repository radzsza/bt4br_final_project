// This is a file where I write test code for JLayeredPane
package java_files;
import javax.swing.*;
import java.awt.*;

public class guiTest2 {
    public static void main(String[] args) {
        // Creating a new JPanel - size 200x200
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.BLACK); //set panel background color to black
        panel1.setBounds(0, 0, 500, 500); // top left corner should be in (100, 100) point
        // about 1/5th of the window in both dimensions

        // new JPanel - size 200x200
        JPanel panel2 = new JPanel();
        panel2.setBounds(100, 100, 200, 200); //left corner in (50, 50), about 1/10th
        panel2.setBackground(Color.RED); // background color red (so the whole panel)

        // creating a JButton
        JButton button = new JButton("button"); // button has the "button" text on it
        JButton button2 = new JButton("button2");
        panel2.add(button, BorderLayout.NORTH);
        panel2.add(button2, BorderLayout.SOUTH);

        // new JLayeredPane - size 500x500, takes up the whole 500x500 default window
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        // adding both panes and the button
        // I still have to figure out how layering works, but I got the basics
        // I don't know how the layering works if you set all of them in the same layer
        // In other situations hierarchy works just fine
        layeredPane.add(panel1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel2, JLayeredPane.MODAL_LAYER);

        // new JFrame, size 500x500
        JFrame frame = new JFrame();
        frame.getContentPane().add(layeredPane); // adding our JLayeredPane to it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setVisible(true); // displaying the whole frame
    }
}

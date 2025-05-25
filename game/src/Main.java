import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel mainMenu = new MainMenu();
        //frame.getContentPane().add(new Background1());
        frame.getContentPane().add(mainMenu);
        //frame.getContentPane().add(mainMenu);
        //frame.setUndecorated(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main {

    private static void setFont(){
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("/home/ola/final_project/game/font/Monocraft-Bold-05.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        setFont();
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(800, 600));
        JPanel mainMenu = new MainMenu();
        //frame.getContentPane().add(new Background1());
        frame.getContentPane().add(mainMenu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
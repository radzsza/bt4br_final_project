import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
        setFont();
        Main main = new Main();
        main.displayGUI();
        /*
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(1600, 900));


        JPanel cards = new JPanel(new CardLayout());

        //cards.add(new MainMenu(), "MainMenu");
        cards.add(new Username(), "Username");
        frame.getContentPane().add(cards);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
         */
    }

    // method to display GUI using cardLayout (allows to switch frames)
    private void displayGUI(){
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(1600, 900));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(new CardLayout());
        JPanel mainMenu = new MainMenu(contentPane, this);
        JPanel username = new Username(contentPane, this);

        contentPane.add(mainMenu, "main menu");
        contentPane.add(username, "username");

        frame.getContentPane().add(contentPane);
        frame.pack();
        frame.setVisible(true);
    }

    private static void setFont(){
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("/home/ola/final_project/game/font/Monocraft-Bold-05.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}
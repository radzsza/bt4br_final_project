import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main {

    public static void main(String[] args){
        setFont();
        Main main = new Main();
        main.displayGUI();
    }

    // method to display GUI using cardLayout (allows to switch frames)
    private void displayGUI(){
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(1600, 900));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(new CardLayout());
        JPanel mainMenu = new MainMenu(contentPane);
        JPanel username = new Username(contentPane);
        JPanel plotCreation = new PlotCreator(contentPane, "BOXPLOT", 0);

        contentPane.add(mainMenu, "main menu");
        contentPane.add(username, "username");
        contentPane.add(plotCreation, "plot creation 1");

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
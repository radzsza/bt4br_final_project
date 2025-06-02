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
        JPanel plotCreation0 = new PlotCreator(contentPane, "BOXPLOT", 0);
        JPanel plotCreation1 = new PlotCreator(contentPane, "SCATTER PLOT 1", 1);
        JPanel plotCreation2 = new PlotCreator(contentPane, "SCATTER PLOT 2", 2);

        contentPane.add(mainMenu, "main menu");
        contentPane.add(username, "username");
        contentPane.add(plotCreation0, "plot 0");
        contentPane.add(plotCreation1, "plot 1");
        contentPane.add(plotCreation2, "plot 2");

        frame.getContentPane().add(contentPane);
        frame.pack();
        frame.setVisible(true);
    }

    private static void setFont(){
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("font/Monocraft-Bold-05.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}
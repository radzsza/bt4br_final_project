/**
 * Allows to create and display games GUI.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main {
    private String user = "Student";

    public static void main(String[] args){
        setFont();
        Main main = new Main();
        main.displayGUI();
    }

    /**
     * Method used to create and display game's GUI
     */
    private void displayGUI(){
        // creating frame (the window)
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(1600, 900));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Creating all the JPanels to be displayed
        JPanel contentPane = new JPanel(new CardLayout());
        JPanel mainMenu = new MainMenu(contentPane);
        JPanel backgroundStart = new BackgroundPanel(contentPane, "without_koperta");
        JPanel backgroundMail = new BackgroundPanel(contentPane, "version_1");
        JPanel mail0 = new TextPanel(contentPane, "mail0");
        JPanel plotCreation0 = new PlotCreator(contentPane, "BOXPLOT", 0);
        JPanel plotCreation1 = new PlotCreator(contentPane, "SCATTER PLOT 1", 1);
        JPanel plotCreation2 = new PlotCreator(contentPane, "SCATTER PLOT 2", 2);
        JPanel backgroundPostPlot = new BackgroundPanel(contentPane, "without_koperta");
        JPanel backgroundPostPlot2 = new BackgroundPanel(contentPane, "version_1");
        JPanel mail1 = new TextPanel(contentPane, "mail1");
        JPanel tutorial0 = new TextPanel(contentPane, "tutorial0");
        JPanel tutorial1_2 = new TextPanel(contentPane, "tutorial1", "tutorial2", "histogram", "volcano");
        JPanel tutorial3_4 = new TextPanel(contentPane, "tutorial3", "tutorial4", "heatmap", "boxplot");
        JPanel tutorial5_6 = new TextPanel(contentPane, "tutorial5", "tutorial_summary", "barplot", "");
        JPanel defeatedBackground = new BackgroundPanel(contentPane, "defeated");
        JPanel defeatedBackground2 = new BackgroundPanel(contentPane, "press_f");

        // adding all the created JPanels
        contentPane.add(mainMenu, "main menu");
        contentPane.add(backgroundStart, "background start");
        contentPane.add(backgroundMail, "background mail");
        contentPane.add(mail0, "mail 0");
        contentPane.add(tutorial0, "tutorial 0");
        contentPane.add(tutorial1_2, "tutorial 1 and 2");
        contentPane.add(tutorial3_4, "tutorial 3 and 4");
        contentPane.add(tutorial5_6, "tutorial 5 and 6");
        contentPane.add(plotCreation0, "plot 0");
        contentPane.add(plotCreation1, "plot 1");
        contentPane.add(plotCreation2, "plot 2");
        contentPane.add(backgroundPostPlot, "background post plot");
        contentPane.add(backgroundPostPlot2, "background post plot");
        contentPane.add(mail1, "mail 1");
        contentPane.add(defeatedBackground, "defeated background");
        contentPane.add(defeatedBackground2, "defeated background");

        frame.getContentPane().add(contentPane);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Adds a custom font - Monocraft to available fonts
     */
    private static void setFont(){
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("resources/font/Monocraft-Bold-05.ttf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}
/**
 * Class extending JLabel. Creates a JLabel with plot image displayed.
 * Overrides paintComponent() to display colorPalette as a background.
 */

import javax.swing.*;
import java.awt.*;

public class PlotLabel extends JLabel {
    private String colorPalette;
    private String theme;
    private final int plotNumber;

    /**
     * class constructor
     * @param theme - current plot's theme as in R ggplot2
     * @param colorPalette - current plot's colorPalette - sets point's/boxplot's fill (not mono colored)
     * @param plotNumber - see plotNumber in PlotCreator
     */
    public PlotLabel(String theme, String colorPalette, int plotNumber) {
        this.colorPalette = colorPalette;
        this.theme = theme;
        this.plotNumber = plotNumber;
        setIcon(new ImageIcon("src/resources/img/plot_images/" + theme + plotNumber + ".png"));
        setPreferredSize(new Dimension(getIcon().getIconWidth(), getIcon().getIconHeight()));
    }

    /**
     * Sets the instance's theme.
     * @param theme - theme to be set
     */
    public void setTheme(String theme) {
        this.theme = theme;
        setIcon(new ImageIcon("src/resources/img/plot_images/" + theme + plotNumber + ".png"));
        repaint();
    }

    /**
     * Sets the background to a given mono color.
     * @param color - the background color to be set
     */
    public void setMonoBackground(Color color) {
        setBackground(color);
        setOpaque(true);
        repaint();
    }

    /**
     * Sets the colorPalette
     * @param colorPalette - colorPalette to be set
     */
    public void setConditionBasedBackground(String colorPalette) {
        this.colorPalette = colorPalette;
        setOpaque(false);
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("src/resources/img/plot_images/" + colorPalette + ".png").getImage(), 0, 0, getWidth(), getHeight(), this);
        super.paintComponent(g);
    }

}
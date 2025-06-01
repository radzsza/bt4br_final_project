import javax.swing.*;
import java.awt.*;

public class PlotLabel extends JLabel {
    private String colorPalette;
    private String theme;
    private final int plotNumber;

    /*
    public static void main(String[] args) {

        // JLayeredPane = Swing container that provides a
        //				third dimension for positioning components
        //				ex. depth, Z-index

        JLabel label1= new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(0,0,250,500);

        ImageIcon icon = new ImageIcon("img/points.png");
        JLabel label2= new JLabel(icon);
        //label2.setOpaque(true);
        //label2.setBackground(Color.GREEN);
        label2.setBounds(0,0,500,500);

        JLabel label3= new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(250,0,250,500);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        //layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("Plot Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        JLabel pl = new PlotLabel("viridis", "minimal", 0);
        //pl.setBackground(Color.BLACK);
        frame.getContentPane().add(pl);
        frame.pack();
        frame.setVisible(true);
    }
    */

    public PlotLabel(String colorPalette, String theme, int plotNumber) {
        this.colorPalette = colorPalette;
        this.theme = theme;
        this.plotNumber = plotNumber;
        setPreferredSize(new Dimension(1003, 647));
        setIcon(new ImageIcon("img/plot_images/" + theme + plotNumber + ".png"));
        //setPreferredSize(new Dimension(500, 500));
    }

    public void setColorPalette(String colorPalette) {
        this.colorPalette = colorPalette;
    }

    public void setTheme(String theme) {
        this.theme = theme;
        setIcon(new ImageIcon("img/plot_images/" + theme + plotNumber + ".png"));
    }

    public void setMonoBackground(Color color) {
        setBackground(color);
        setOpaque(false);
    }

    public void setConditionBasedBackground() {
        setOpaque(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("img/plot_images/" + colorPalette + ".png").getImage(), 0, 0, getWidth(), getHeight(), this);
        super.paintComponent(g);
    }

}
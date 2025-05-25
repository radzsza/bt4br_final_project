import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Transparent Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null); // używamy absolute positioning dla przejrzystości

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.BLUE);
        bottomPanel.setBounds(50, 50, 300, 200);

        JPanel topPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 0, 0, 128)); // półprzezroczysty czerwony
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        topPanel.setOpaque(false); // to jest kluczowe!
        topPanel.setBounds(100, 100, 200, 100);

        frame.add(bottomPanel);
        frame.add(topPanel);
        frame.setVisible(true);
    }
}
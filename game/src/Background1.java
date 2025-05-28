import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Objects;

public class Background1 extends JPanel {

     public Background1() {

     }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(new ImageIcon("img/startbutton.PNG").getImage(), 0, 0, 0, 0, null);
    }
}

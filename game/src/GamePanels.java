import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanels extends JPanel {

    public class MailPanel extends JPanel {
        public MailPanel() {
            setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();

            JLabel mail = new JLabel(); // mail to insert
            setPreferredSize(new Dimension(100, 100));
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanels extends JPanel {

    public class MailPanel extends JPanel {
        public MailPanel() {
            setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();

            JLabel mail = new JLabel(); // image of the mail or custom font?
            setPreferredSize(new Dimension(100, 100));
        }
    }
}

import javax.swing.*;
import java.awt.*;

public class ComboBox extends JComboBox<String> {
    public ComboBox() {
        this.setAesthetics();
    }

    public ComboBox(String[] items) {
        this.setAesthetics();
        for (String item : items) {
            this.addItem(item);
        }
    }

    private void setAesthetics() {
        setFont(new Font("Monocraft", Font.BOLD, 20));
        setPreferredSize(new Dimension(250, 50));
        setBackground(Color.WHITE);
    }
}

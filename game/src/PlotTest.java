import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlotTest {
    public void createAndShowPlot() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PlotLabel pl = new PlotLabel("viridis", "minimal", 0);
        frame.getContentPane().add(pl, BorderLayout.CENTER);

        Button btn = new Button("monocolor", new Dimension(200, 100), 20);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl.setMonoBackground(MyColor.getColor("TURQUOISE"));
            }
        });
        frame.getContentPane().add(btn, BorderLayout.EAST);

        Button btn2 = new Button("palette", new Dimension(200, 100), 20);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pl.setConditionBasedBackground("red-green");
            }
        });

        frame.getContentPane().add(btn2, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        PlotTest pt = new PlotTest();
        pt.createAndShowPlot();
    }
}

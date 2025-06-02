/**
 * Extends JPanel. Allows to create panels with background image.
 * Used mainly for displaying plot-related panels, such as the email one.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MailPanel extends JPanel {
    // I would have used reading textfiles, but it does not cooperate and I don't have enough time to fix it
    private String mail0 = """
            Subject: Data Visualization Task

            From: max.ruzz@university.edu
            To: you@studentmail.com

            Dear Student,

            Please find attached the dataset. It needs to be visualized. I would do it myself, but unfortunately, my last
            attempt with ggplot2 ended in a nervous breakdown and a corrupted R session. Your task is simple: produce a 
            clear and sensible plot using ggplot2, as long as it conveys something meaningful and does not involve 3D pie 
            charts. Do not overthink it. Just make it pretty. Or at least functional. I trust your plotting skills more than 
            I trust my patience.

            Best regards,
            Max Ruzz
            """;

    private String mail1 = """
            Subject: Re: Data Visualization Task

            From: max.ruzz@university.edu
            To: you@studentmail.com

            Dear Student,

            Thank you for the submission. Unfortunately, the current version of the plot does not clearly communicate the 
            data or insights. Please revise it with greater focus on clarity, readability, and overall presentation. A more 
            thoughtful approach to design and interpretation is needed. Looking forward to the improved version.

            Best regards,
            Max Ruzz
            """;

    /**
     * Class constructor
     * @param contentPane - as in MainMenu
     * @param mailNumber - determines which mail field to use
     */
    public MailPanel(JPanel contentPane, int mailNumber) {

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        setBackground(Color.WHITE);

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(100, 5, 15, 15);
        JTextArea mail = new JTextArea();
        if (mailNumber == 0) {
            mail.setText(mail0);
        } else {
            mail.setText(mail1);
        }
        mail.setEditable(false);
        mail.setFont(new Font("Monocraft", Font.BOLD, 20));
        add(mail, c);

        // next button - goes to plots tutorial
        c.gridy = 1;
        c.weighty = 1;
        c.weightx = 1;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        c.insets = new Insets(30, 5, 15, 15);
        Button nextButton = new Button("NEXT", new Dimension(200, 80), 20);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.next(contentPane);
            }
        });
        add(nextButton, c);
    }
}

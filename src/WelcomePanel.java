import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePanel extends JPanel {
    public WelcomePanel() {
        setPreferredSize(new Dimension(400, 400));

        JLabel welcome = new JLabel("Historia Sztuki - Fiszki", JLabel.CENTER);
        add(welcome);

        JButton start = new JButton("Start");
        start.setSize(100, 20);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuFrame menu = new MenuFrame();
                menu.setVisible(true);
            }
        });
        add(start);
    }
}

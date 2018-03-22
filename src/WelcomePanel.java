import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePanel extends JPanel {
    public WelcomePanel() {
        setPreferredSize(new Dimension(400, 400));

        JLabel welcome = new JLabel("Historia Sztuki - Fiszki", JLabel.CENTER); //TODO Dać dużymi literami na środku
        add(welcome);

        JButton start = new JButton("Start"); //TODO Duży przycisk trochę poniżej środka
        start.setSize(100, 20);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login dialog = new Login();
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
            }
        });
        add(start);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeFrame extends JFrame{

    public WelcomeFrame(){
        super("Historia Sztuki Fiszki - Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(600,600);

        JPanel welcomePanel = new WelcomePanel();
        add(welcomePanel);

    }

}

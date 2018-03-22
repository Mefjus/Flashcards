import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame implements ActionListener {

    public MenuFrame(){
        super("Historia Sztuki Fiszki - Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(600,600);

        JPanel menuPanel = new MenuPanel();
        add(menuPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

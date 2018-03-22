import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuPanel extends JPanel {

    public MenuPanel(){
        setPreferredSize(new Dimension(400, 400));

        JLabel menu = new JLabel("Menu", JLabel.CENTER);
        add(menu);

        JButton pierwszaOpcja = new JButton("1.Dodaj zdjęcie oraz pytanie do bazy danych");
        pierwszaOpcja.setSize(100, 20);
        pierwszaOpcja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuFrame menu = new MenuFrame();
                menu.setVisible(true);
            }
        });
        add(pierwszaOpcja);
    }
}

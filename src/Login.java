import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField username;
    private JPasswordField password;

    /**
     * Create the dialog.
     */
    public Login() {
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        {
            JLabel lblUsername = new JLabel("Username");
            lblUsername.setBounds(89, 76, 63, 20);
            contentPanel.add(lblUsername);
        }
        {
            JLabel lblPassword = new JLabel("Password");
            lblPassword.setBounds(89, 119, 63, 20);
            contentPanel.add(lblPassword);
        }

        username = new JTextField();
        username.setBounds(173, 76, 152, 20);
        contentPanel.add(username);
        username.setColumns(10);

        password = new JPasswordField();
        password.setBounds(173, 119, 152, 20);
        contentPanel.add(password);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(username.getText().equals("admin") && password.getText().equals("admin") ) {
                    JOptionPane.showMessageDialog(null, "Login Sucessful ");
                    dispose();
                    MenuFrame menu = new MenuFrame();
                    menu.setVisible(true);

                }else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Inputs", "Please Check", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        });
        btnLogin.setBounds(205, 165, 89, 23);
        contentPanel.add(btnLogin);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblLogin.setBounds(104, 23, 230, 23);
        contentPanel.add(lblLogin);
    }
}
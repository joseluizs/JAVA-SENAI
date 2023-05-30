package principal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginSystem {

	private JFrame frame;
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton loginButton, cancelButton;

    public LoginSystem() {
        frame = new JFrame("Login System");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameTextField = new JTextField();
        passwordTextField = new JPasswordField();
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = passwordTextField.getText();

                if (username.equals("admin") && password.equals("password")) {
                    frame.dispose();
                    new WelcomePage().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add components to the frame
        JPanel contentPane = new JPanel(new GridBagLayout());
        contentPane.add(usernameLabel, new GridBagConstraints());
        contentPane.add(usernameTextField, new GridBagConstraints());
        contentPane.add(passwordLabel, new GridBagConstraints());
        contentPane.add(passwordTextField, new GridBagConstraints());
        contentPane.add(loginButton, new GridBagConstraints());
        contentPane.add(cancelButton, new GridBagConstraints());

        frame.setContentPane(contentPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginSystem();
    }

    class WelcomePage extends JFrame {

        public WelcomePage() {
            setTitle("Welcome Page");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel welcomeLabel = new JLabel("Welcome to the Login System!");
            add(welcomeLabel);

            setVisible(true);
        }
    }
}

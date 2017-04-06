//Kelompok G MPPL
// Dwiky Semuel 064001600016
// M. Iqbal Hanafi 064001600005
// Niko Putra 065001600008
// Yusuf Alvino 0650016000014

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginForm extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JTextField txtUser;
    private JPasswordField pwdPass;
    private JButton btnLogin, btnExit;

    public LoginForm(){
         super ("FormLogin");
      
         Container container = getContentPane();
         container.setLayout(new FlowLayout());
      
         label1 = new JLabel ("Username : "); //output
         label2 = new JLabel ("Password : "); //output
      
         txtUser = new JTextField(20);
         txtUser.setToolTipText("Input Username");
         pwdPass = new JPasswordField(20);
      
         btnLogin = new JButton ("Login");
         btnLogin.addActionListener(this);
         btnExit = new JButton ("Exit");
         btnExit.addActionListener(this);
      
         container.add(label1);
         container.add(txtUser);
         container.add(label2);
         container.add(pwdPass);
         container.add(btnLogin);
         container.add(btnExit);
      
         setSize (300,200);
         setVisible (true);
    }

    public static void main(String[] args) {
        FormLogin test = new FormLogin();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private String user = "",pass = "";
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == btnLogin){
            user = txtUser.getText();
            pass = pwdPass.getText();
            if (user.equals("Niko") && pass.equals("niko12345")){
                JOptionPane.showMessageDialog(null, "Terima kasih anda telah berhasil login! ");
                System.exit(0);
            
            }else{
                JOptionPane.showMessageDialog(null, "Username atau password salah");
                txtUser.setText("");
                pwdPass.setText("");
                txtUser.requestFocus(true);
            }
        }else if (e.getSource() == btnExit){
            JOptionPane.showMessageDialog(null, "Anda berhasil keluar");
            System.exit(0);
            }
        }
    }

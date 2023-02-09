
package prakpbo_uas_sem2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    private String USER;
    String un = null;
    String pw = null;

    public Login() {
        Toolkit toolkit = getToolkit();
        Dimension dim = toolkit.getScreenSize();
        setLocation(dim.width/2 - 410/2, dim.height/2 - 410/2);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userName = new javax.swing.JTextField();
        registerButton = new java.awt.Button();
        loginButton = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(39, 39, 39));
        userName.setMargin(new java.awt.Insets(2, 10, 2, 2));
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 270, 40));

        registerButton.setBackground(new java.awt.Color(255, 255, 255));
        registerButton.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(153, 153, 153));
        registerButton.setLabel("Register");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 100, 40));

        loginButton.setBackground(new java.awt.Color(85, 239, 196));
        loginButton.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setLabel("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 40));

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 39, 39));
        jLabel1.setText("Hello There ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, 40));

        password.setMargin(new java.awt.Insets(2, 10, 2, 2));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 270, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iPhone X-XS-11 Pro – 1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void setUSER(String a){
        USER = a;
    }
    
    String getUSER(){
        return USER;
    }
    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        un = userName.getText();    //anggep sudah login ke "Fahrendra"
        pw = password.getText();
        
        Database db = new Database();
        if(db.loginAccount(un, pw) == true){
            UI ui = new UI();
            ui.setVisible(true);
            dispose();
            setUSER(un);
            ui.userTag.setText(USER);
        } else {
            JOptionPane.showMessageDialog(null, "User not available");
        }
        
    }//GEN-LAST:event_loginButtonMouseClicked

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        un = userName.getText();
        pw = password.getText();
        
        Database db = new Database();
        if (db.loginAccount(un, pw) == true){
            JOptionPane.showMessageDialog(null, "Account is Available");
        } else {
            db.registerAccount(un, pw);
        }
        
        userName.setText("");
        password.setText("");
    }//GEN-LAST:event_registerButtonMouseClicked

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Button loginButton;
    private javax.swing.JPasswordField password;
    private java.awt.Button registerButton;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}

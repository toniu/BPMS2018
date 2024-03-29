/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// OBJECTIVE 1: A means of accessing information through authorisation  
package badmintonSystem;

// required imports
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Neka
 */
public class badmintonLogin extends javax.swing.JFrame {
    
    // declaration of the connection
    static Connection con;
    
     // global variables
    int attemptNum = 0;
    boolean loggedIn = false;
    
     // instantiation of a message dialog
    msgDialog msgDlg = new msgDialog(new javax.swing.JFrame(),true);

    /**
     * Creates new form badmintonLogin
     */
    public badmintonLogin() {
        initComponents();
        this.setLocationRelativeTo(null);      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JToggleButton();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnCreateAcc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ClubBADMINTON");
        setBounds(new java.awt.Rectangle(0, 23, 0, 0));
        setPreferredSize(new java.awt.Dimension(699, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        usernameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("USERNAME:");

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("PASSWORD:");

        usernameField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        passwordField.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/badmintonLogoTransparent.png"))); // NOI18N

        btnExit.setBackground(new java.awt.Color(255, 0, 51));
        btnExit.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.setAlignmentY(0.0F);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 51, 0));
        btnCancel.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 153, 102));
        btnLogin.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCreateAcc.setBackground(new java.awt.Color(255, 51, 0));
        btnCreateAcc.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnCreateAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAcc.setText("CREATE ACCOUNT");
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel2.setFont(new java.awt.Font("Adobe Gothic Std", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLUB BADMINTON LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addComponent(btnExit)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel)
                    .addComponent(btnCreateAcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // procedure to open the main menu
    private void openMenu(String username) { 
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // search for logged in user's ID
            
            // query to select only records from the 'user' table where username is the username entered
            String query = "SELECT * FROM user WHERE username = ?";
            int IDFound = 0;
            String roleFound = "";
            ps = SQLConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, username);           
            rs = ps.executeQuery();
            
            // while the records are being searched, set the value of IDFound to the user ID found and roundFound to the user's roleName found
            while (rs.next()) {
                IDFound = rs.getInt("user_id");
                roleFound = rs.getString("roleName");
            }     
            
            // update Session Manager to create a new session to hold the user's logged in details
            SessionManager.startNewSession(IDFound, username, roleFound);
            
            // open the main menu
            badmintonMenu bMenu = new badmintonMenu();
            bMenu.setVisible(true);
            bMenu.pack();
            bMenu.setLocationRelativeTo(null);
            bMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            bMenu.userLoggedOn.setText(SessionManager.getUsername());
            this.dispose(); 

            //display message to welcome logged on user
            msgDlg.setMessage("WELCOME < " + SessionManager.getUsername() + " >!");
            msgDlg.setVisible(true);  
        // exception handling, catches any SQL errors and logs them to the console log    
        } catch (SQLException ex) {
            Logger.getLogger(badmintonLogin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // call procedure to close connection
            SQLConnection.closeConnection(SQLConnection.getConnection(), rs, ps, null);
        }
    }
    // event for logging in
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        // declare preparedStatement and ResultSet
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        // get the string from username text field
        String usernameInput = usernameField.getText();
        String passwordInput = String.valueOf(passwordField.getPassword()); // convert from character to string
        
        // query to only search for username and password
        String query = "SELECT username, password FROM user " +
                "WHERE username = ? AND password = ?";
        
        try {
            // prepare statement with given query
            ps = SQLConnection.getConnection().prepareStatement(query);
            
            // set the strings of the query as the inputs the user has made
            ps.setString(1, usernameInput);
            ps.setString(2, passwordInput);
            
            // execute query
            rs = ps.executeQuery();
            
            // while rows are being searched
            if (rs.next()) {
                loggedIn = true;   
            }
            else {
                // increment number of attempts if login failed
                attemptNum = attemptNum + 1;
                // if number of attempts reaches 3 then quit the system
                if (attemptNum == 3) {
                    msgDlg.setMessage("LOGIN FAILED! No attempts left");
                    msgDlg.setVisible(true);
                    // closes the connection and quits the program
                    con = SQLConnection.getConnection();
                    this.setVisible(false);
                    this.dispose();
                    try {
                        con.close();
                    }
                    // exception handling for any SQL errors
                    catch (SQLException e) {
                        msgDlg.setMessage("Could not close!" + e.getMessage());
                        msgDlg.setVisible(true);
                    }
                }
                else {
                  msgDlg.setMessage("LOGIN FAILED! Attempts made: "+ attemptNum);
                  msgDlg.setVisible(true);  
                }
            }
            // exception handling of SQL errors
        } catch (SQLException ex) {
            Logger.getLogger(badmintonLogin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {  
            // call procedure to close connection
            SQLConnection.closeConnection(con, rs, ps, null);
        }
        if (loggedIn) { // open menu if log in true
            openMenu(usernameInput);    
        }       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       // closes the connection and quits the program
        con = SQLConnection.getConnection();
        this.setVisible(false);
        this.dispose();
        try {
            con.close();
        }
        // exception handling for any SQL errors
        catch (SQLException e) {
            msgDlg.setMessage("Could not close!" + e.getMessage());
            msgDlg.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        // closes this form and opens the sign up form (form createAccount)
        createAccount caForm = new createAccount();
        caForm.setVisible(true);
        caForm.pack();
        caForm.setLocationRelativeTo(null);
        caForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCreateAccActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // call method in SessionManager to end the session
        SessionManager.endCurrentSession();
        // exits the system
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(badmintonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(badmintonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(badmintonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(badmintonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new badmintonLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateAcc;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}

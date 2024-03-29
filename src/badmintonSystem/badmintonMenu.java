/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// OBJECTIVE 2: Ease of use for users with lack of experience with IT (provide a fully-functional GUI)
package badmintonSystem;

// required imports
import javax.swing.JFrame;

/**
 *
 * @author Neka
 */

public class badmintonMenu extends javax.swing.JFrame {


    /**
     * Creates new form badmintonMenu
     */
    public badmintonMenu() {
        
        initComponents();
        // centers the JFrame on the screen
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

        jPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JToggleButton();
        btnManageUsers = new javax.swing.JButton();
        btnPlayers = new javax.swing.JButton();
        btnCompetitions = new javax.swing.JButton();
        btnBookings = new javax.swing.JButton();
        btnFixtures = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        muIcon = new javax.swing.JLabel();
        mpIcon = new javax.swing.JLabel();
        compIcon = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();
        fixtureIcon = new javax.swing.JLabel();
        bookingIcon = new javax.swing.JLabel();
        topBar = new javax.swing.JPanel();
        mainMenuLabel = new javax.swing.JLabel();
        LogLabel = new javax.swing.JLabel();
        userLoggedOn = new javax.swing.JLabel();
        bookingIcon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ClubBADMINTON");
        setName("badmintonMenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1049, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel.setBackground(new java.awt.Color(0, 51, 102));
        jPanel.setPreferredSize(new java.awt.Dimension(1070, 530));

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("LOG OUT");
        btnExit.setAlignmentY(0.0F);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnManageUsers.setBackground(new java.awt.Color(255, 51, 0));
        btnManageUsers.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnManageUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUsers.setText("MANAGE USERS");
        btnManageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUsersActionPerformed(evt);
            }
        });

        btnPlayers.setBackground(new java.awt.Color(255, 51, 0));
        btnPlayers.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnPlayers.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayers.setText("PLAYERS");
        btnPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayersActionPerformed(evt);
            }
        });

        btnCompetitions.setBackground(new java.awt.Color(255, 51, 0));
        btnCompetitions.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnCompetitions.setForeground(new java.awt.Color(255, 255, 255));
        btnCompetitions.setText("COMPETITIONS");
        btnCompetitions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompetitionsActionPerformed(evt);
            }
        });

        btnBookings.setBackground(new java.awt.Color(255, 51, 0));
        btnBookings.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnBookings.setForeground(new java.awt.Color(255, 255, 255));
        btnBookings.setText("BOOKINGS");
        btnBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingsActionPerformed(evt);
            }
        });

        btnFixtures.setBackground(new java.awt.Color(255, 51, 0));
        btnFixtures.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnFixtures.setForeground(new java.awt.Color(255, 255, 255));
        btnFixtures.setText("FIXTURES");
        btnFixtures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixturesActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(255, 51, 0));
        btnAdmin.setFont(new java.awt.Font("Adobe Gothic Std", 0, 13)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("ADMINISTRATION");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        muIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/muIcon.png"))); // NOI18N

        mpIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/mpIcon.png"))); // NOI18N

        compIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/compIcon.png"))); // NOI18N

        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/adminIcon.png"))); // NOI18N

        fixtureIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/fixtureIcon.png"))); // NOI18N

        bookingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/bookingIcon.png"))); // NOI18N

        topBar.setBackground(new java.awt.Color(255, 51, 0));

        mainMenuLabel.setFont(new java.awt.Font("Adobe Gothic Std", 0, 18)); // NOI18N
        mainMenuLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainMenuLabel.setText("CLUB BADMINTON MAIN MENU");

        LogLabel.setFont(new java.awt.Font("Adobe Gothic Std", 0, 14)); // NOI18N
        LogLabel.setForeground(new java.awt.Color(255, 255, 255));
        LogLabel.setText("LOGGED ON AS: ");

        userLoggedOn.setFont(new java.awt.Font("Adobe Gothic Std", 0, 14)); // NOI18N
        userLoggedOn.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261)
                .addComponent(LogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLoggedOn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLoggedOn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mainMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogLabel)))
                .addContainerGap())
        );

        userLoggedOn.setText(SessionManager.getUsername());

        bookingIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/systemIcons/badmintonLogoIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingIcon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(muIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(mpIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(compIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(btnFixtures, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(btnPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addComponent(btnCompetitions, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(bookingIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(fixtureIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(adminIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGap(253, 253, 253))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(muIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mpIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(compIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPlayers)
                                        .addComponent(btnManageUsers))
                                    .addComponent(btnCompetitions))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fixtureIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookingIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdmin)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFixtures)
                                        .addComponent(btnBookings)))))
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bookingIcon1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel);
        jPanel.setBounds(6, 6, 1040, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // end current login session and closes menu
        SessionManager.endCurrentSession();
        // quit menu, return back to login
        badmintonLogin loginForm = new badmintonLogin();
        loginForm.setVisible(true);
        loginForm.pack();
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnManageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUsersActionPerformed
        // opens manage users window and closes menu
        muWindow muW = new muWindow();
        muW.setVisible(true);
        muW.pack();
        muW.setLocationRelativeTo(null);
        muW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnManageUsersActionPerformed

    private void btnPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayersActionPerformed
        // opens manage players window
        mpWindow mpW = new mpWindow();
        mpW.setVisible(true);
        mpW.pack();
        mpW.setLocationRelativeTo(null);
        mpW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnPlayersActionPerformed

    private void btnCompetitionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompetitionsActionPerformed
        // opens competitions window and closes menu
        competitionsWindow cW = new competitionsWindow();
        cW.setVisible(true);
        cW.pack();
        cW.setLocationRelativeTo(null);
        cW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCompetitionsActionPerformed

    private void btnBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingsActionPerformed
        // opens bookings window and closes menu
        bookingsWindow bW = new bookingsWindow();
        bW.setVisible(true);
        bW.pack();
        bW.setLocationRelativeTo(null);
        bW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnBookingsActionPerformed

    private void btnFixturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixturesActionPerformed
        // opens fixtures window and closes menu
        fixturesWindow fW = new fixturesWindow();
        fW.setVisible(true);
        fW.pack();
        fW.setLocationRelativeTo(null);
        fW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnFixturesActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // opens administration window and closes menu
        adminWindow aW = new adminWindow();
        aW.setVisible(true);
        aW.pack();
        aW.setLocationRelativeTo(null);
        aW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(badmintonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(badmintonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(badmintonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(badmintonMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new badmintonMenu().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogLabel;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel bookingIcon;
    private javax.swing.JLabel bookingIcon1;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBookings;
    private javax.swing.JButton btnCompetitions;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JButton btnFixtures;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnPlayers;
    private javax.swing.JLabel compIcon;
    private javax.swing.JLabel fixtureIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel mainMenuLabel;
    private javax.swing.JLabel mpIcon;
    private javax.swing.JLabel muIcon;
    private javax.swing.JPanel topBar;
    public javax.swing.JLabel userLoggedOn;
    // End of variables declaration//GEN-END:variables
}

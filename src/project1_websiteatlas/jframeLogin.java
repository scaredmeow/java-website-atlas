
package project1_websiteatlas;

import java.sql.Connection;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jframeLogin extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public jframeLogin() {
        initComponents();
        setIcon();
        conn = Project1_WebsiteAtlas.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWindow = new javax.swing.JPanel();
        panelEmpty = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelEmpty1 = new javax.swing.JPanel();
        panelUsername = new javax.swing.JPanel();
        inputEmail = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        panelUserPass = new javax.swing.JPanel();
        inputPass = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        panelLogin = new javax.swing.JPanel();
        buttonLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelUserSignUp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelSignUpButton = new javax.swing.JPanel();
        buttonSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSITE ATLAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(390, 150));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        setResizable(false);

        mainWindow.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        panelEmpty.setPreferredSize(new java.awt.Dimension(1024, 50));

        javax.swing.GroupLayout panelEmptyLayout = new javax.swing.GroupLayout(panelEmpty);
        panelEmpty.setLayout(panelEmptyLayout);
        panelEmptyLayout.setHorizontalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        panelEmptyLayout.setVerticalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty);

        panelTitle.setPreferredSize(new java.awt.Dimension(1024, 100));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/icoApplication.png"))); // NOI18N
        panelTitle.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WEBSITE ATLAS");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 60));
        panelTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        mainWindow.add(panelTitle);

        panelEmpty1.setPreferredSize(new java.awt.Dimension(1024, 20));

        javax.swing.GroupLayout panelEmpty1Layout = new javax.swing.GroupLayout(panelEmpty1);
        panelEmpty1.setLayout(panelEmpty1Layout);
        panelEmpty1Layout.setHorizontalGroup(
            panelEmpty1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        panelEmpty1Layout.setVerticalGroup(
            panelEmpty1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty1);

        panelUsername.setPreferredSize(new java.awt.Dimension(1024, 60));

        inputEmail.setPreferredSize(new java.awt.Dimension(200, 50));
        inputEmail.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 118, 118));
        jLabel5.setText("Username:");
        jLabel5.setPreferredSize(new java.awt.Dimension(109, 20));
        inputEmail.add(jLabel5, java.awt.BorderLayout.CENTER);

        jTextField1.setPreferredSize(new java.awt.Dimension(10, 25));
        inputEmail.add(jTextField1, java.awt.BorderLayout.PAGE_END);

        panelUsername.add(inputEmail);

        mainWindow.add(panelUsername);

        panelUserPass.setPreferredSize(new java.awt.Dimension(1024, 80));

        inputPass.setPreferredSize(new java.awt.Dimension(200, 50));
        inputPass.setLayout(new java.awt.BorderLayout(0, 3));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 118, 118));
        jLabel6.setText("Password:");
        jLabel6.setPreferredSize(new java.awt.Dimension(109, 20));
        inputPass.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPasswordField1.setDoubleBuffered(true);
        jPasswordField1.setMinimumSize(new java.awt.Dimension(7, 25));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(112, 25));
        inputPass.add(jPasswordField1, java.awt.BorderLayout.PAGE_END);

        panelUserPass.add(inputPass);

        mainWindow.add(panelUserPass);

        panelLogin.setPreferredSize(new java.awt.Dimension(1024, 40));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        panelLogin.setLayout(flowLayout1);

        buttonLogin.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        buttonLogin.setText("Log In");
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLogin.setPreferredSize(new java.awt.Dimension(130, 30));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        panelLogin.add(buttonLogin);

        mainWindow.add(panelLogin);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Forgot your password?");
        jPanel1.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        mainWindow.add(jPanel1);

        panelUserSignUp.setPreferredSize(new java.awt.Dimension(1024, 35));
        panelUserSignUp.setRequestFocusEnabled(false);
        panelUserSignUp.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/Line.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelUserSignUp.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Don't have an account?");
        jLabel4.setPreferredSize(new java.awt.Dimension(197, 30));
        panelUserSignUp.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        mainWindow.add(panelUserSignUp);

        panelSignUpButton.setPreferredSize(new java.awt.Dimension(1024, 50));

        buttonSignUp.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        buttonSignUp.setText("Sign Up for Website Atlas");
        buttonSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSignUp.setPreferredSize(new java.awt.Dimension(250, 30));
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });
        panelSignUpButton.add(buttonSignUp);

        mainWindow.add(panelSignUpButton);

        getContentPane().add(mainWindow, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1040, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new jframeSignUp().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new jframeMainMenu().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JPanel inputEmail;
    private javax.swing.JPanel inputPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JPanel panelEmpty;
    private javax.swing.JPanel panelEmpty1;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelSignUpButton;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panelUserPass;
    private javax.swing.JPanel panelUserSignUp;
    private javax.swing.JPanel panelUsername;
    // End of variables declaration//GEN-END:variables
}

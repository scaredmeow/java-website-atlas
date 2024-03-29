
package websiteatlas;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.*;

public class jframeSignUp extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    char[] randAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
                        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
                        'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    int[] randPi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9}; 
    static int x,count1,count2,count3,count4,flag2=0;
    boolean flag;
    public jframeSignUp() {
        initComponents();
        setIcon();
        conn = WebsiteAtlas.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWindow = new javax.swing.JPanel();
        panelEmpty = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelEmpty1 = new javax.swing.JPanel();
        panelForm = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        signupName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        signupEmail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        signupUser = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        signupPassword = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        signupConfirm = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        signupActivation = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSITE ATLAS");
        setResizable(false);

        panelEmpty.setPreferredSize(new java.awt.Dimension(1024, 20));

        javax.swing.GroupLayout panelEmptyLayout = new javax.swing.GroupLayout(panelEmpty);
        panelEmpty.setLayout(panelEmptyLayout);
        panelEmptyLayout.setHorizontalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        panelEmptyLayout.setVerticalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty);

        panelTitle.setPreferredSize(new java.awt.Dimension(1024, 100));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WEBSITE ATLAS");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 60));
        panelTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoApplication.png"))); // NOI18N
        panelTitle.add(jLabel2, java.awt.BorderLayout.PAGE_END);

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
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty1);

        panelForm.setPreferredSize(new java.awt.Dimension(500, 335));

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel2.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(118, 118, 118));
        jLabel3.setText("Name:");
        jLabel3.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel2.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        signupName.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel2.add(signupName, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 118, 118));
        jLabel5.setText("Email:");
        jLabel5.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel4.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        signupEmail.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel4.add(signupEmail, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel5.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 118, 118));
        jLabel6.setText("Username:");
        jLabel6.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel5.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        signupUser.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel5.add(signupUser, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 118, 118));
        jLabel7.setText("Password:");
        jLabel7.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel6.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        signupPassword.setMinimumSize(new java.awt.Dimension(7, 25));
        signupPassword.setPreferredSize(new java.awt.Dimension(112, 25));
        jPanel6.add(signupPassword, java.awt.BorderLayout.PAGE_END);

        panelForm.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(118, 118, 118));
        jLabel8.setText("Confirm Password:");
        jLabel8.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel7.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        signupConfirm.setMinimumSize(new java.awt.Dimension(7, 25));
        signupConfirm.setPreferredSize(new java.awt.Dimension(112, 25));
        jPanel7.add(signupConfirm, java.awt.BorderLayout.PAGE_END);

        panelForm.add(jPanel7);

        jPanel3.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel3.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(118, 118, 118));
        jLabel4.setText("Activation Key:");
        jLabel4.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel3.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        signupActivation.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel3.add(signupActivation, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel3);

        mainWindow.add(panelForm);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 110));

        jPanel10.setPreferredSize(new java.awt.Dimension(1024, 25));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel8.setMinimumSize(new java.awt.Dimension(500, 44));
        jPanel8.setPreferredSize(new java.awt.Dimension(260, 25));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Already have an account? ");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 22));
        jPanel8.add(jLabel9, java.awt.BorderLayout.LINE_START);
        jLabel9.getAccessibleContext().setAccessibleDescription("");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Sign In");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel8);

        jPanel1.add(jPanel10);

        jPanel9.setPreferredSize(new java.awt.Dimension(1024, 5));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9);

        jButton1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        mainWindow.add(jPanel1);

        getContentPane().add(mainWindow, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1040, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void sqlInsert(){                      
        String sql = "INSERT INTO userInfo(name, email, username, password, activationkey,pathchoice,retry) VALUES (?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement (sql);
            pst.setString(1, signupName.getText());
            pst.setString(2, signupEmail.getText());
            pst.setString(3, signupUser.getText());
            pst.setString(4, signupPassword.getText());
            pst.setString(5, signupActivation.getText());
            pst.setString(6, "-1");
            pst.setString(7, "0");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered");
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                rs.close();
                pst.close();                       
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);   
            }
        }
    }
    
    public void sqlInsertUserQuiz(){                      
        String sql1 = "INSERT INTO userQuiz(name, htmlw1, htmlw2, htmlw3, htmlw4, htmlw5, htmlw6, htmlw7, cssw1, cssw2, cssw3, cssw4, jsw1, jsw2, jsw3, jsw4, sqlw1, sqlw2, sqlw3) VALUES (?,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)";
        try {
            pst = conn.prepareStatement (sql1);
            pst.setString(1, signupName.getText());
            pst.execute();
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                rs.close();
                pst.close();
                conn.close();                       
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);   
            }
        }
    }   
    
    public boolean keyAlgo(String activation) {
        flag = false;
        count1 = count2 = count3 = count4 = 0;
        x =0;
        char[] str = activation.toCharArray(); 
        if (str.length != 17){
            JOptionPane.showMessageDialog(null,"Activation key is a 17 character alphanumeric","Alert",JOptionPane.WARNING_MESSAGE);
        } else {
            for (int i=1; i<=14; i++){
                if ((i+1) % 5 == 0){
                    if ( str[i] == '-')
                        count1++;//3
                } else {
                //odd position    
                    if ((i+1) % 2 != 0){
                        if ((i+1) % 3 == 0) {
                            if (randPi[x] > Arrays.binarySearch(randAlphabet, str[i]) )
                                count4 ++; //2
                        } else {
                            if (randPi[x] > Character.getNumericValue(str[i]))
                                count3 ++; //3
                        }
                    }
                //even position
                    else if ((i+1) % 2 == 0){
                        if (randPi[x] > Character.getNumericValue(str[i]))
                            count2 ++; //6  
                    } 
                }
                x++;    
            }
                if (count1 == 3)
                    if (count2 == 6)
                        if (count3 == 3)
                            if (count4 == 2)
                                flag = true;
                flag2 = 1;
                return flag;            
        }
        flag2 = 0;
        return false;                     
    }
    
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            new jframeLogin().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char[] firstPass = signupPassword.getPassword();
        String str1 = String.valueOf(firstPass);
        
        char[] secondPass = signupConfirm.getPassword();
        String str2 = String.valueOf(secondPass);
        String inputActivation = signupActivation.getText();
        if (signupName.getText().equals("") 
                || signupEmail.getText().equals("") 
                || signupUser.getText().equals("")
                || signupPassword.getText().equals("")
                || signupConfirm.getText().equals("")
                || signupActivation.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please fill all of the textfield.","Alert",JOptionPane.WARNING_MESSAGE);
        } else {
            try {    
                String sql = "SELECT activationkey from userInfo where activationkey = ?";
                        pst = conn.prepareStatement(sql);
                        pst.setString(1, signupActivation.getText());
                        rs = pst.executeQuery();
                if (rs.next() == true) {       
                    JOptionPane.showMessageDialog(null,"Your activation key is already used","Alert",JOptionPane.WARNING_MESSAGE);  
                } else {
                    if (keyAlgo(inputActivation.toUpperCase()) == true){
                        if (str1.equals(str2)){
                            sqlInsert();
                            sqlInsertUserQuiz();
                                   
                            java.awt.EventQueue.invokeLater(() -> {
                                new jframeLogin().setVisible(true);
                            });
                            dispose();
                        } else 
                            JOptionPane.showMessageDialog(null,"Your inputted password does not match","Alert",JOptionPane.WARNING_MESSAGE);                 
                    } else if (flag2 == 1)
                        JOptionPane.showMessageDialog(null,"Your activation key is not valid","Alert",JOptionPane.WARNING_MESSAGE);                 
                }
            } catch (HeadlessException |SQLException e) {
                    JOptionPane.showMessageDialog(null, e);            
            }            
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JPanel panelEmpty;
    private javax.swing.JPanel panelEmpty1;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JTextField signupActivation;
    private javax.swing.JPasswordField signupConfirm;
    private javax.swing.JTextField signupEmail;
    private javax.swing.JTextField signupName;
    private javax.swing.JPasswordField signupPassword;
    private javax.swing.JTextField signupUser;
    // End of variables declaration//GEN-END:variables
}

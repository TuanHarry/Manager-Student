/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlydiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Tuan Tran
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     * @throws java.sql.SQLException
     */
    public User() throws SQLException {
        initComponents();
        LoadUser();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        txtPassword = new javax.swing.JPasswordField();
        btnHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thông tin tài khoản");

        txtUserName.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setText("Tên người dùng");

        jLabel2.setText("Mật khẩu");

        btnThem.setBackground(new java.awt.Color(153, 255, 153));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 255, 153));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(153, 255, 153));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên đăng nhập", "Mật khẩu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        txtPassword.setBackground(new java.awt.Color(0, 255, 204));

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("BẢNG QUẢN LÝ TÀI KHOẢN");

        btnRS.setBackground(new java.awt.Color(153, 255, 153));
        btnRS.setText("Nhập lại");
        btnRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(244, 244, 244))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnThem)
                        .addGap(56, 56, 56)
                        .addComponent(btnXoa)
                        .addGap(54, 54, 54)
                        .addComponent(btnSua)
                        .addGap(56, 56, 56)
                        .addComponent(btnRS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnRS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // Duyet du lieu vao bang
        Connection ketnoi;
        if(txtUserName.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin", "Thông báo",JOptionPane.OK_CANCEL_OPTION);
        }else if(txtPassword.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin", "Thông báo",JOptionPane.OK_CANCEL_OPTION);
        }else{
            try {
                ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
                String lenhSQL = "INSERT INTO user VALUES(?,?)";
                PreparedStatement lenh = ketnoi.prepareStatement(lenhSQL);
                // truyen tham so 
                lenh.setString(1, txtUserName.getText());
                lenh.setString(2, txtPassword.getText());
                // lenh thuc thi 
                lenh.executeLargeUpdate();
                LoadUser();
                tableUser.repaint();

            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        Connection ketnoi;
        int vitri = tableUser.getSelectedRow();
        if(vitri  == -1){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn dòng để xóa","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
        }else{
            try {
                
                ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
                String lenhSQL = "DELETE FROM user WHERE TenDN = ? AND MatKhau = ?";

                PreparedStatement lenh = ketnoi.prepareStatement(lenhSQL);
                // truyen tham so 
                lenh.setString(1, txtUserName.getText());
                lenh.setString(2, txtPassword.getText());
                // lenh thuc thi 
                lenh.executeLargeUpdate();
                LoadUser();
                tableUser.repaint();
                JOptionPane.showMessageDialog(this,"Xóa thành công","Thông báo ",JOptionPane.OK_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int vitri = tableUser.getSelectedRow();
        TableModel model = tableUser.getModel();
        DefaultTableModel nModel = (DefaultTableModel) model;
        // cap nhat du lieu
        String ten = nModel.getValueAt(vitri, 0).toString();
        String mk = nModel.getValueAt(vitri, 1).toString();
        
        txtUserName.setText(ten);
        txtPassword.setText(mk);
    }//GEN-LAST:event_tableUserMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        Connection ketnoi;
         int vitri = tableUser.getSelectedRow();
        if(vitri  == -1){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn dòng để sửa","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
        }else{
            try {
                ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
                String lenhSQL = "UPDATE user SET MatKhau = ? WHERE TenDN = ?";

                PreparedStatement lenh = ketnoi.prepareStatement(lenhSQL);
                // truyen tham so 
                lenh.setString(1, txtPassword.getText());
                lenh.setString(2, txtUserName.getText());
                // lenh thuc thi 
                lenh.executeLargeUpdate();
                LoadUser();
                tableUser.repaint();
                JOptionPane.showMessageDialog(this,"Sửa thành công","Thông báo ",JOptionPane.OK_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRSActionPerformed
        if(evt.getSource() == btnRS){
            txtUserName.setText(null);
            txtPassword.setText(null);
        }
    }//GEN-LAST:event_btnRSActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new User().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRS;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void LoadUser() throws SQLException {
        Connection ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
        Statement lenh = ketnoi.createStatement();
        String lenhSQL = "SELECT * FROM user";
        ResultSet bangKQ = lenh.executeQuery(lenhSQL);
        // chuan bi bang
        TableModel model = tableUser.getModel();
        DefaultTableModel nModel = (DefaultTableModel) model;
        // xoa du lieu ton 
        while(nModel.getRowCount()>0){
            nModel.removeRow(0);
        }
        
    // Duyet moi du lieu vao bang  
        while(bangKQ.next()){
            Vector row = new Vector();
            row.add(bangKQ.getString("TenDN"));
            row.add(bangKQ.getString("MatKhau"));
            nModel.addRow(row);
        }
        
        tableUser.setModel(nModel);
        
    }
}

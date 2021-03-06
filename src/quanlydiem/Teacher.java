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
public class Teacher extends javax.swing.JFrame {

    /**
     * Creates new form Teacher
     */
    public Teacher() {
        initComponents();
        try {
            LoadUser();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JTextField();
        txtHodem = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        txtBoMon = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTeacher = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        btnRS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("THÔNG TIN GIÁO VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Họ tên đêm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mã GV");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Chức vụ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Bộ môn");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Giới tính");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("SĐT");

        txtMaGV.setBackground(new java.awt.Color(0, 255, 204));

        txtHodem.setBackground(new java.awt.Color(0, 255, 204));

        txtTen.setBackground(new java.awt.Color(0, 255, 204));

        txtChucVu.setBackground(new java.awt.Color(0, 255, 204));

        txtBoMon.setBackground(new java.awt.Color(0, 255, 204));

        txtGioiTinh.setBackground(new java.awt.Color(0, 255, 204));

        txtEmail.setBackground(new java.awt.Color(0, 255, 204));

        txtSdt.setBackground(new java.awt.Color(0, 255, 204));

        btnThem.setBackground(new java.awt.Color(153, 255, 153));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 255, 153));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(153, 255, 153));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã GV", "Họ tên đệm", "Tên", "Chức vụ", "Bộ môn", "Giói tính", "Email", "SĐT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTeacherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTeacher);

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnRS.setBackground(new java.awt.Color(153, 255, 153));
        btnRS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHodem)
                            .addComponent(txtTen)
                            .addComponent(txtChucVu))
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBoMon)
                            .addComponent(txtGioiTinh)
                            .addComponent(txtEmail)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRS)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBoMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThem)
                    .addComponent(btnRS))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Connection ketnoi ;
            if(txtMaGV.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else if(txtHodem.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else if(txtTen.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else if(txtChucVu.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else if(txtBoMon.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else if(txtEmail.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else if(txtGioiTinh.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else if(txtSdt.getText().length() ==0){
                JOptionPane.showMessageDialog(this, "Điền đủ các trường","Thông báo lỗi",JOptionPane.OK_CANCEL_OPTION);
            }else{
                try {
                    ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
                    String lenhSQL = "INSERT INTO thongtingiaovien VALUES(?,?,?,?,?,?,?,?)";
                    PreparedStatement lenh = ketnoi.prepareStatement(lenhSQL);
                    // doc tung noi dung 
                    lenh.setString(1,txtMaGV.getText());
                    lenh.setString(2, txtHodem.getText());
                    lenh.setString(3,txtTen.getText());
                    lenh.setString(4,txtChucVu.getText());
                    lenh.setString(5, txtBoMon.getText());
                    lenh.setString(6, txtGioiTinh.getText());
                    lenh.setString(7, txtEmail.getText());
                    lenh.setString(8, txtSdt.getText());

                    // cap nhat du lieu 
                    lenh.executeLargeUpdate();
                    LoadUser();

                } catch (SQLException ex) {
                    Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        Connection ketnoi ;
        int vitri = tableTeacher.getSelectedRow();
        if(vitri == -1){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn dòng để xóa","Thông báo ",JOptionPane.OK_CANCEL_OPTION);
        }else{
            try {
                ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
                String lenhSQL = "DELETE FROM thongtingiaovien WHERE Masogv = ? ";
                PreparedStatement lenh = ketnoi.prepareStatement(lenhSQL);
                // doc tung noi dung 
                lenh.setString(1,txtMaGV.getText());            
                // cap nhat du lieu 
                lenh.executeLargeUpdate();
                LoadUser();
                JOptionPane.showMessageDialog(this,"Xóa thành công","Thông báo ",JOptionPane.OK_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tableTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTeacherMouseClicked
        int vitri = tableTeacher.getSelectedRow();
        TableModel model = tableTeacher.getModel();
        DefaultTableModel nModel = (DefaultTableModel) model;
        
        String ms = nModel.getValueAt(vitri,0).toString();
        String ho = nModel.getValueAt(vitri,1).toString();
        String ten = nModel.getValueAt(vitri, 2).toString();
        String chucvu = nModel.getValueAt(vitri, 3).toString();
        String bomon = nModel.getValueAt(vitri,4).toString();
        String gioitinh = nModel.getValueAt(vitri, 5).toString();
        String email = nModel.getValueAt(vitri, 6).toString();
        String sdt = nModel.getValueAt(vitri , 7).toString();
        
        txtMaGV.setText(ms);
        txtHodem.setText(ho);
        txtTen.setText(ten);
        txtChucVu.setText(chucvu);
        txtBoMon.setText(bomon);
        txtGioiTinh.setText(gioitinh);
        txtEmail.setText(email);
        txtSdt.setText(sdt);
    }//GEN-LAST:event_tableTeacherMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        Connection ketnoi ;
        int vitri = tableTeacher.getSelectedRow();
        if(vitri == -1){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn dòng để sửa","Thông báo ",JOptionPane.OK_CANCEL_OPTION);
        }else{
            try {
                ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
                String lenhSQL = "UPDATE thongtingiaovien SET Hodem = ? , Ten = ? , Chucvu = ?, Bomon = ?, Gioitinh = ?, Email = ?, Sdt = ? WHERE Masogv = ?";
                PreparedStatement lenh = ketnoi.prepareStatement(lenhSQL);
                // doc tung noi dung 
                lenh.setString(8,txtMaGV.getText());
                lenh.setString(1, txtHodem.getText());
                lenh.setString(2,txtTen.getText());
                lenh.setString(3,txtChucVu.getText());
                lenh.setString(4, txtBoMon.getText());
                lenh.setString(5, txtGioiTinh.getText());
                lenh.setString(6, txtEmail.getText());
                lenh.setString(7, txtSdt.getText());

                // cap nhat du lieu 
                lenh.executeLargeUpdate();
                LoadUser();
                JOptionPane.showMessageDialog(this,"Đã sửa thành công","Thông báo ",JOptionPane.OK_OPTION);
            } catch (SQLException ex) {
                Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRSActionPerformed
        if(evt.getSource() ==btnRS){
            txtMaGV.setText(null);
            txtHodem.setText(null);
            txtTen.setText(null);
            txtChucVu.setText(null);
            txtBoMon.setText(null);
            txtEmail.setText(null);
            txtGioiTinh.setText(null);
            txtSdt.setText(null);
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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTeacher;
    private javax.swing.JTextField txtBoMon;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHodem;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
    private void LoadUser() throws SQLException {
        Connection ketnoi = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydiem", "root","");
        Statement lenh = ketnoi.createStatement();
        String lenhSQL = "SELECT * FROM thongtingiaovien";
        ResultSet bangKQ = lenh.executeQuery(lenhSQL);
        // chuan bi bang
        TableModel model = tableTeacher.getModel();
        DefaultTableModel nModel = (DefaultTableModel) model;
        // xoa du lieu ton 
        while(nModel.getRowCount()>0){
            nModel.removeRow(0);
        }
        
    // Duyet moi du lieu vao bang  
        while(bangKQ.next()){
            Vector row = new Vector();
            row.add(bangKQ.getString("Masogv"));
            row.add(bangKQ.getString("Hodem"));
            row.add(bangKQ.getString("Ten"));
            row.add(bangKQ.getString("Chucvu"));
            row.add(bangKQ.getString("Bomon"));
            row.add(bangKQ.getString("Gioitinh"));
            row.add(bangKQ.getString("Email"));
            row.add(bangKQ.getString("Sdt"));
            nModel.addRow(row);
        }
        tableTeacher.setModel(nModel);
    }
}

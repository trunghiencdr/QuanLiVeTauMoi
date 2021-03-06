/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connectSQL.LopKetNoi;
import java.util.ArrayList;
import module.LoaiTaiKhoan;
import module.NguoiDung;
import module.TaiKhoan;

/**
 *
 * @author Tuong
 */
public class JPanelCaiDatTaiKhoan extends javax.swing.JPanel {

    private LopKetNoi ketNoiCSDL;
    private NguoiDung nguoiDung;
    /**
     * Creates new form JPanelCaiDatTaiKhoan
     */
    public JPanelCaiDatTaiKhoan(TaiKhoan tk) {
        initComponents();
        
        ketNoiCSDL = new LopKetNoi();
        nguoiDung=ketNoiCSDL.getThongTinNguoiDung(tk.getCMND());
        
        txtTen.setText(nguoiDung.getTen());
        txtCMND.setText(nguoiDung.getCMND());
        txtEmail.setText(nguoiDung.getEmail());
        txtSDT.setText(nguoiDung.getSDT());
        txtTenTaiKhoan.setText(nguoiDung.getTenTaiKhoan());
        jpwMatKhau.setText(tk.getMatKhau());
        
        jcbLoaiTaiKhoan.addItem(tk.getMaLoaiTaiKhoan());        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbTen = new javax.swing.JLabel();
        jlbCMND = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbSDT = new javax.swing.JLabel();
        jlbTenTaiKhoan = new javax.swing.JLabel();
        jlbMatKhau = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtTenTaiKhoan = new javax.swing.JTextField();
        jlbLoaiTaiKhoan = new javax.swing.JLabel();
        jcbLoaiTaiKhoan = new javax.swing.JComboBox<>();
        jbtSua = new javax.swing.JButton();
        jbnLuu = new javax.swing.JButton();
        jbtDoiMatKhau = new javax.swing.JButton();
        jpwMatKhau = new javax.swing.JPasswordField();

        jLabel2.setText("jLabel2");

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setRequestFocusEnabled(false);

        jLabel1.setText("Th??ng tin t??i kho???n");

        jlbTen.setText("H??? v?? T??n");

        jlbCMND.setText("CMND");

        jlbEmail.setText("Email");

        jlbSDT.setText("S??? ??i???n tho???i");

        jlbTenTaiKhoan.setText("T??n t??i kho???n");

        jlbMatKhau.setText("M???t kh???u");

        txtTenTaiKhoan.setEnabled(false);

        jlbLoaiTaiKhoan.setText("Lo???i t??i kho???n");

        jcbLoaiTaiKhoan.setEnabled(false);

        jbtSua.setText("S???a");

        jbnLuu.setText("L??u");

        jbtDoiMatKhau.setText("?????i m???t kh???u");

        jpwMatKhau.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbtSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnLuu)
                        .addGap(239, 239, 239)
                        .addComponent(jbtDoiMatKhau))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbTen)
                            .addComponent(jlbCMND)
                            .addComponent(jlbEmail)
                            .addComponent(jlbSDT)
                            .addComponent(jlbTenTaiKhoan)
                            .addComponent(jlbMatKhau)
                            .addComponent(jlbLoaiTaiKhoan))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                                    .addComponent(txtEmail)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCMND, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbLoaiTaiKhoan, 0, 622, Short.MAX_VALUE)
                                    .addComponent(jpwMatKhau)
                                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCMND)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTenTaiKhoan)
                    .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbMatKhau)
                    .addComponent(jpwMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLoaiTaiKhoan)
                    .addComponent(jcbLoaiTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSua)
                    .addComponent(jbnLuu)
                    .addComponent(jbtDoiMatKhau))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbnLuu;
    private javax.swing.JButton jbtDoiMatKhau;
    private javax.swing.JButton jbtSua;
    private javax.swing.JComboBox<String> jcbLoaiTaiKhoan;
    private javax.swing.JLabel jlbCMND;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbLoaiTaiKhoan;
    private javax.swing.JLabel jlbMatKhau;
    private javax.swing.JLabel jlbSDT;
    private javax.swing.JLabel jlbTen;
    private javax.swing.JLabel jlbTenTaiKhoan;
    private javax.swing.JPasswordField jpwMatKhau;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}

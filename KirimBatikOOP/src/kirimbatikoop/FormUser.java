package kirimbatikoop;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormUser extends javax.swing.JFrame {
    int pilihan;
    String MasterKey = "hasan";
    String MainDatabase = "internal";
    String DbsTable = "user";
    String PrimaryKey;
    String UserName;

    public FormUser() {
        initComponents();
        TampilTabel();
        ClearPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_user = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_edit = new javax.swing.JButton();
        btn_tambahkan = new javax.swing.JButton();
        pn_master = new javax.swing.JPanel();
        pass_master = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        pn_user = new javax.swing.JPanel();
        pass_user = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pn_input = new javax.swing.JPanel();
        in_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        in_password = new javax.swing.JTextField();
        pn_tambah = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        pn_edit = new javax.swing.JPanel();
        btn_edituser = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabel_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_user);

        btn_back.setText("Kembali ke Login");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addGap(0, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_edit.setText("Edit User");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_tambahkan.setText("Tambahkan User Baru");
        btn_tambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btn_tambahkan)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btn_tambahkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_master.setBackground(new java.awt.Color(255, 255, 255));

        pass_master.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass_masterKeyReleased(evt);
            }
        });

        jLabel1.setText("Masukkan Master Password");

        javax.swing.GroupLayout pn_masterLayout = new javax.swing.GroupLayout(pn_master);
        pn_master.setLayout(pn_masterLayout);
        pn_masterLayout.setHorizontalGroup(
            pn_masterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_masterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_masterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_masterLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pass_master))
                .addContainerGap())
        );
        pn_masterLayout.setVerticalGroup(
            pn_masterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_masterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_user.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Masukkan User Password");

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_userLayout = new javax.swing.GroupLayout(pn_user);
        pn_user.setLayout(pn_userLayout);
        pn_userLayout.setHorizontalGroup(
            pn_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_userLayout.createSequentialGroup()
                        .addComponent(pass_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(pn_userLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_userLayout.setVerticalGroup(
            pn_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(pn_userLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_input.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("User Name");

        jLabel4.setText("Password");

        javax.swing.GroupLayout pn_inputLayout = new javax.swing.GroupLayout(pn_input);
        pn_input.setLayout(pn_inputLayout);
        pn_inputLayout.setHorizontalGroup(
            pn_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(in_username)
                    .addGroup(pn_inputLayout.createSequentialGroup()
                        .addGroup(pn_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(in_password))
                .addContainerGap())
        );
        pn_inputLayout.setVerticalGroup(
            pn_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(in_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pn_tambah.setBackground(new java.awt.Color(255, 255, 255));

        btn_tambah.setText("Tambahkan User");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_tambahLayout = new javax.swing.GroupLayout(pn_tambah);
        pn_tambah.setLayout(pn_tambahLayout);
        pn_tambahLayout.setHorizontalGroup(
            pn_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_tambahLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_tambah)
                .addContainerGap())
        );
        pn_tambahLayout.setVerticalGroup(
            pn_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambah)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_edit.setBackground(new java.awt.Color(255, 255, 255));

        btn_edituser.setText("Edit User");
        btn_edituser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edituserActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete User");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_editLayout = new javax.swing.GroupLayout(pn_edit);
        pn_edit.setLayout(pn_editLayout);
        pn_editLayout.setHorizontalGroup(
            pn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_edituser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        pn_editLayout.setVerticalGroup(
            pn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_editLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edituser)
                    .addComponent(btn_delete)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_master, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearPanel(){
        pn_master.setVisible(false);
        pn_user.setVisible(false);
        pn_input.setVisible(false);
        pn_tambah.setVisible(false);
        pn_edit.setVisible(false);
        btn_delete.setVisible(false);
    }

    private void TampilTabel(){
        DefaultTableModel mdlz = new DefaultTableModel();
        mdlz.addColumn("ID User");
        mdlz.addColumn("Nama User");
        String sqlMenu = "SELECT * FROM " + DbsTable;
        try{
            java.sql.Connection conn = ConnectTools.connect(MainDatabase);
            java.sql.ResultSet rs = conn.createStatement().executeQuery(sqlMenu);
            while(rs.next()){
                String[] dataField = {
                    rs.getString("user_id"),
                    rs.getString("user_name"),
                    rs.getString("password")
                };
                mdlz.addRow(dataField);
            }
            tabel_user.setModel(mdlz);
            tabel_user.setRowSelectionInterval(0,0);
        }catch(Exception e){}
    }

    private void Identifikasi(int baris){
        PrimaryKey = tabel_user.getModel().getValueAt(baris,0).toString();
        UserName = tabel_user.getModel().getValueAt(baris,1).toString();
        
        String Ident = "SELECT * FROM " + DbsTable + " WHERE user_name='" +
                UserName + "' AND password='" +
                Encryptorz.enkrip(pass_user.getText()) +"'";
        try{
            java.sql.Connection conz = ConnectTools.connect(MainDatabase);
            java.sql.ResultSet res = conz.createStatement().executeQuery(Ident);
            while(res.next()){
                ClearPanel();
                pn_input.setVisible(true);
                pn_edit.setVisible(true);
                in_username.setText(UserName);
                in_password.setText(null);
                return;
            }JOptionPane.showMessageDialog(null, "Password Tidak Sesuai");
        }catch(Exception e){}
    }

    private void TambahUser(){
        String sqlTambah = "INSERT INTO " + DbsTable + " VALUES (NULL,'" +
                in_username.getText() + "','" +
                Encryptorz.enkrip(in_password.getText()) + "')";
        try{
            java.sql.Connection conz = ConnectTools.connect(MainDatabase);
            java.sql.PreparedStatement pst = conz.prepareStatement(sqlTambah);
            pst.execute();
            JOptionPane.showMessageDialog(null,"User Berhasil Ditambahkan");
        }catch(Exception e){}
    }

    private void EditUser(){
        String sqlEdit = "UPDATE " + DbsTable + " SET user_name='" +
                in_username.getText() +
                "', password='" +
                Encryptorz.enkrip(in_password.getText()) +
                "' WHERE user_id='" +
                PrimaryKey + "'";
        try{
            java.sql.Connection conz = ConnectTools.connect(MainDatabase);
            java.sql.PreparedStatement pst = conz.prepareStatement(sqlEdit);
            pst.execute();
            JOptionPane.showMessageDialog(null,"User Setting Berhasil Diubah");
        }catch(Exception e){}
    }

    private void DeleteUser(){
        int baris = tabel_user.getSelectedRow();
        String nama = tabel_user.getModel().getValueAt(baris,1).toString();
        String SelectAidi = tabel_user.getModel().getValueAt(baris,0).toString();
        String sqlDel = "DELETE FROM " + DbsTable + " WHERE user_id='" + SelectAidi + "'";
        try{
            java.sql.Connection conz = ConnectTools.connect(MainDatabase);
            java.sql.PreparedStatement pst = conz.prepareStatement(sqlDel);
            pst.execute();
            JOptionPane.showMessageDialog(null,"User " + nama + " Telah Dihapus");
        }catch(Exception e){}
    }

    private void btn_tambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahkanActionPerformed
        // TODO add your handling code here:
        pilihan = 2;
        ClearPanel();
        pn_master.setVisible(true);
        pass_master.setText(null);
    }//GEN-LAST:event_btn_tambahkanActionPerformed

    private void pass_masterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_masterKeyReleased
        // TODO add your handling code here:
        String tulis = pass_master.getText();
        int pj_tulis = tulis.length();
        int pj_master = MasterKey.length();
        if(pj_tulis == pj_master){
            if(tulis.equals(MasterKey)){
                if(pilihan == 1){
                    pn_user.setVisible(true);
                    pass_user.setText(null);
                    pass_master.setText(null);
                    pn_master.setVisible(false);
                }
                if(pilihan == 2){
                    ClearPanel();
                    pn_input.setVisible(true);
                    pn_tambah.setVisible(true);
                    in_username.setText(null);
                    in_password.setText(null);
                }
            }
        }
    }//GEN-LAST:event_pass_masterKeyReleased

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        pilihan = 1;
        ClearPanel();
        pn_master.setVisible(true);
        pass_master.setText(null);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        if(in_username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "User Name Tidak Boleh Kososng");
            return;
        }
        if(in_password.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Password User");
            return;
        }
        TambahUser();
        in_username.setText(null);
        in_password.setText(null);
        TampilTabel();
        ClearPanel();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        FormLogin flog = new FormLogin();
        flog.setVisible(true);
        flog.setTitle("Login Aplikasi");
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Identifikasi(tabel_user.getSelectedRow());
        if(PrimaryKey.equals("1")){
            btn_delete.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_edituserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edituserActionPerformed
        // TODO add your handling code here:
        if(in_username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "User Name Tidak Boleh Kososng");
            return;
        }
        if(in_password.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Password User");
            return;
        }
        int YesNo = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Mengubah User Setting ?", null, JOptionPane.YES_NO_OPTION);
        if(YesNo == JOptionPane.YES_OPTION){
            EditUser();
            in_username.setText(null);
            in_password.setText(null);
            TampilTabel();
            ClearPanel();
        }else{
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_btn_edituserActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        in_username.setText(null);
        in_password.setText(null);
        ClearPanel();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int Rows = tabel_user.getSelectedRow();
        String UserID = tabel_user.getModel().getValueAt(Rows,0).toString();
        String SelectNama = tabel_user.getModel().getValueAt(Rows,1).toString();
        if(UserID.equals("1")){
            JOptionPane.showMessageDialog(null, "User Utama Tidak Boleh Dihapus");
            return;
        }
        int YesNo = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus User " + SelectNama + " ?",
                null, JOptionPane.YES_NO_OPTION);
        if(YesNo == JOptionPane.YES_OPTION){
            DeleteUser();
            TampilTabel();
        }else{
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_edituser;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambahkan;
    private javax.swing.JTextField in_password;
    private javax.swing.JTextField in_username;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pass_master;
    private javax.swing.JPasswordField pass_user;
    private javax.swing.JPanel pn_edit;
    private javax.swing.JPanel pn_input;
    private javax.swing.JPanel pn_master;
    private javax.swing.JPanel pn_tambah;
    private javax.swing.JPanel pn_user;
    private javax.swing.JTable tabel_user;
    // End of variables declaration//GEN-END:variables
}

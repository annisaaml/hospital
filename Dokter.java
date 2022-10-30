/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubessmt4;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Dokter extends javax.swing.JFrame {
    private Object tabelDokter;
    DefaultTableModel model;
    
    private void kosongkan_form(){
        txtKd_dokter.setEditable(true);
        txtKd_dokter.setText(null);
        txtKd_spesialis.setText(null);
        txtNama.setText(null);
        txtTmpt_lahir.setText(null);
        txtTgl_lahir.setText(null);
        txtAlamat.setText(null);
        txtNo_telp.setText(null);
    }
    
    private void cariData(String key){
    ResultSet RsDokter=null;
        try{
            Object[] judul_kolom = {"Kode Dokter", "Kode Spesialis", "Nama", "Tempat Lahir", "Tanggal Lahir", "Alamat", "No. Telepon"};
            model=new DefaultTableModel(null,judul_kolom);
            tabeldokter.setModel(model);
            
            Connection conn=(Connection)TubesSMT4.configDB();
            Statement stt=conn.createStatement();
            model.getDataVector().removeAllElements();
            
            RsDokter=stt.executeQuery("SELECT * from dokter WHERE kd_dokter LIKE '%"+key+"%' OR kd_spesialis LIKE '%"+key+"%' OR nama LIKE '%"+key+"%'");
            while(RsDokter.next()){
                Object[] data={
                    RsDokter.getString(1),
                    RsDokter.getString(2),
                    RsDokter.getString(3),
                    RsDokter.getString(4),
                    RsDokter.getString(5),
                    RsDokter.getString(6),
                    RsDokter.getString(7),
                };
               model.addRow(data);
            }                
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tampilkan_data(){
        
        int row = tabeldokter.getRowCount();
        for(int a = 0;a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection conn = TubesSMT4.configDB();
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM dokter");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
                rs.getString(6),rs.getString(7)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public Dokter() {
        initComponents();
        String [] judul ={"Kode Dokter","Kode Spesialis","Nama","Tempat Lahir","Tanggal Lahir","Alamat","No. Telepon"};
        model = new DefaultTableModel(judul,0);
        tabeldokter.setModel(model);
        tampilkan_data();
    }
    
    private void koneksidokter(){

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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JLabel1 = new javax.swing.JLabel();
        txtKd_dokter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKd_spesialis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTmpt_lahir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTgl_lahir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNo_telp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldokter = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        JLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabel1.setText("Kode Dokter");

        txtKd_dokter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtKd_dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKd_dokterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Kode Spesialis");

        txtKd_spesialis.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Nama");

        txtNama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Tempat Lahir");

        txtTmpt_lahir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Tanggal Lahir");

        txtTgl_lahir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Alamat");

        txtAlamat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("No. Telepon");

        txtNo_telp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tabeldokter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabeldokter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tabeldokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Dokter", "Kode Spesialis", "Nama", "Tempat Lahir", "Tanggal Lahir", "Alamat", "No. Telepon"
            }
        ));
        tabeldokter.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabeldokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldokter);

        edit.setBackground(new java.awt.Color(204, 204, 255));
        edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edit.setText("Edit");
        edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(204, 204, 255));
        hapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hapus.setText("Hapus");
        hapus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        simpan.setBackground(new java.awt.Color(204, 204, 255));
        simpan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        simpan.setText("Simpan");
        simpan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(JLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKd_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKd_spesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTmpt_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNo_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280)
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel1)
                    .addComponent(txtKd_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKd_spesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTmpt_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNo_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("DATA DOKTER");

        keluar.setBackground(new java.awt.Color(153, 153, 153));
        keluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        keluar.setForeground(new java.awt.Color(153, 153, 153));
        keluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\rsz_1back.png")); // NOI18N
        keluar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\rsz_1cari.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(439, 439, 439)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCari)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtKd_dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKd_dokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKd_dokterActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn =  TubesSMT4.configDB();
            conn.createStatement().executeUpdate ("UPDATE dokter SET kd_dokter='"+ txtKd_dokter.getText()+"',"+ "kd_spesialis='"+ txtKd_spesialis.getText()+"'," + "nama='"+ txtNama.getText()+"',"  + "tempat_lahir='"+ txtTmpt_lahir.getText()+"'," + "tanggal_lahir='"+ txtTgl_lahir.getText()+"',"+ "alamat='"+ txtAlamat.getText()+"',"+ "no_tlp='"+ txtNo_telp.getText()+"' where kd_dokter = '"+ txtKd_dokter.getText()+"'");
            JOptionPane.showMessageDialog(null, "Selamat proses edit data berhasil!");
            tampilkan_data();
            kosongkan_form();

        }catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Error","Pesan Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        Home a = new Home();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO dokter VALUES ('"+txtKd_dokter.getText()+"','"+txtKd_spesialis.getText()+"','"+txtNama.getText()+"','"+txtTmpt_lahir.getText()+"','"+txtTgl_lahir.getText()+"','"+txtKd_spesialis.getText()+"','"+txtAlamat.getText()+"','"+txtNo_telp.getText()+"')";
            java.sql.Connection conn = (Connection)TubesSMT4.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Selamat Proses simpan data berhasil!");
            tampilkan_data();
            kosongkan_form();

        }catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void tabeldokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldokterMouseClicked
        // TODO add your handling code here:
        int baris = tabeldokter.rowAtPoint(evt.getPoint());
        String kd_dokter = tabeldokter.getValueAt(baris, 0).toString();
        txtKd_dokter.setText(kd_dokter);
        
        String kd_spesialis = tabeldokter.getValueAt(baris, 1).toString();
        txtKd_spesialis.setText(kd_spesialis);
        
        String nama = tabeldokter.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String tempat_lahir = tabeldokter.getValueAt(baris, 3).toString();
        txtTmpt_lahir.setText(tempat_lahir);
        
        String tanggal_lahir = tabeldokter.getValueAt(baris, 4).toString();
        txtTgl_lahir.setText(tanggal_lahir);
        
        String alamat = tabeldokter.getValueAt(baris, 5).toString();
        txtAlamat.setText(alamat);
        
        String no_tlp = tabeldokter.getValueAt(baris, 6).toString();
        txtNo_telp.setText(no_tlp);
        
    }//GEN-LAST:event_tabeldokterMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        Connection conn = TubesSMT4.configDB();
        // TODO add your handling code here:
        try {          
            conn.createStatement().executeUpdate("delete from dokter where kd_dokter ='"+txtKd_dokter.getText()+"'");
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            tampilkan_data();
      
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // TODO add your handling code here:
        String key=txtCari.getText();
        System.out.println(key);  
        
        if(key!=""){
            cariData(key);
        }else{
            tampilkan_data();
        }
    }//GEN-LAST:event_txtCariKeyReleased

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
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabeldokter;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKd_dokter;
    private javax.swing.JTextField txtKd_spesialis;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo_telp;
    private javax.swing.JTextField txtTgl_lahir;
    private javax.swing.JTextField txtTmpt_lahir;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formulirMahasiswa extends javax.swing.JFrame {

    public formulirMahasiswa() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.cyan);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLnim = new javax.swing.JLabel();
        jLnama = new javax.swing.JLabel();
        jLprodi = new javax.swing.JLabel();
        jLipk = new javax.swing.JLabel();
        jTFipk = new javax.swing.JTextField();
        jTFnim = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jTFnama = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jTFprodi = new javax.swing.JTextField();
        btndel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMhs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulir Mahasiswa");

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setText("Formulir Mahasiswa");

        jLnim.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLnim.setText("NIM");

        jLnama.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLnama.setText("Nama");

        jLprodi.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLprodi.setText("Program Studi");
        jLprodi.setToolTipText("");

        jLipk.setFont(new java.awt.Font("Tekton Pro Ext", 0, 18)); // NOI18N
        jLipk.setText("IPk");

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnadd.setText("Tambah");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndel.setText("Dekete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        jTableMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Program Studi", "IPK"
            }
        ));
        jScrollPane1.setViewportView(jTableMhs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnama)
                            .addComponent(jLnim))
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFnim, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFnama, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLipk)
                                .addGap(130, 130, 130))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLprodi)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFprodi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFipk, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndel)
                            .addComponent(jLnama))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLprodi)
                            .addComponent(btnupdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLipk)
                            .addComponent(jTFipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLnim)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTableMhs.getModel();
        int pil = JOptionPane.showConfirmDialog(this, "Apakah anda ingin menambahkan data ?","Tambah data",JOptionPane.YES_NO_OPTION);
        if(pil == JOptionPane.YES_OPTION){
            try {
                int nim = Integer.parseInt(jTFnim.getText());
                String nama = jTFnama.getText();
                String prodi = jTFprodi.getText();
                Double ipk = Double.parseDouble(jTFipk.getText());
                Object[] o = {nim,nama,prodi,ipk};
                JOptionPane.showMessageDialog(this, "Data DiTambahkan");
                model.addRow(o);
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this, " Masukkan Data / Data Salah ",
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
            }
        }else if(pil == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "Data Tidak DiTambahkan");}

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTableMhs.getModel();
        int pil = JOptionPane.showConfirmDialog(this, "Apakah Anda ingin merubah data ?","Update Data",JOptionPane.YES_NO_OPTION);
        if(pil == JOptionPane.YES_OPTION){
            try {
                int upd = jTableMhs.getSelectedRow();
                model.setValueAt(jTFnim.getText(), upd, 0);
                model.setValueAt(jTFnama.getText(), upd, 1);
                model.setValueAt(jTFprodi.getText(), upd, 2);
                model.setValueAt(jTFipk.getText(), upd, 3);
                JOptionPane.showMessageDialog(this, "Data Telah di Update");
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(this, "Data Belum Dipilih",
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
            }
        }else if(pil == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "Data tidak di Update");}
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTableMhs.getModel();
        int pil = JOptionPane.showConfirmDialog(this, "Apakah anda ingin menghapus data ?","Hapus data",JOptionPane.YES_NO_OPTION);
        if(pil == JOptionPane.YES_OPTION){
            try {
                int del = jTableMhs.getSelectedRow();
                model.removeRow(del);
                JOptionPane.showMessageDialog(this, "Data di hapus");
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(this, "Pilih Data",
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
            }
        }else if(pil == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "Data tidak di hapus");}

    }//GEN-LAST:event_btndelActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(formulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulirMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulirMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLipk;
    private javax.swing.JLabel jLnama;
    private javax.swing.JLabel jLnim;
    private javax.swing.JLabel jLprodi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFipk;
    private javax.swing.JTextField jTFnama;
    private javax.swing.JTextField jTFnim;
    private javax.swing.JTextField jTFprodi;
    private javax.swing.JTable jTableMhs;
    // End of variables declaration//GEN-END:variables
}

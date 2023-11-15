package uts.view;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uts.DBConnection;
import uts.entity.Mahasiswa;
import uts.model.MahasiswaModel;

public class MahasiswaForm extends javax.swing.JDialog {

    private Connection connection;
    private Mahasiswa mahasiswa;
    private MahasiswaModel mahasiswaModel;

    public MahasiswaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        connection = DBConnection.newgetInstant();
        mahasiswa = new Mahasiswa();
        mahasiswaModel = new MahasiswaModel(connection);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNim = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        buttonBaru = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        radioL = new javax.swing.JRadioButton();
        radioP = new javax.swing.JRadioButton();
        textAlamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORMULIR BARANG");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nim");

        jLabel2.setText("Nama");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("Asal Kota");

        buttonBaru.setText("BARU");
        buttonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaruActionPerformed(evt);
            }
        });

        buttonTambah.setText("TAMBAH");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUbah.setText("UBAH");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("APLIKASI CRUD MAHASISWA");

        buttonGroup1.add(radioL);
        radioL.setText("Laki-Laki");

        buttonGroup1.add(radioP);
        radioP.setText("Perempuan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(radioL)
                                        .addGap(44, 44, 44)
                                        .addComponent(radioP)
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textAlamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUbah)
                                .addGap(10, 10, 10)
                                .addComponent(buttonHapus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioP)
                    .addComponent(radioL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBaru)
                    .addComponent(buttonTambah)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        String jenisKelamin = null;
        if (radioL.isSelected()) {
            jenisKelamin = "Laki-laki";
        } else if (radioP.isSelected()) {
            jenisKelamin = "Perempuan";
        }

        mahasiswa.setNim(textNim.getText());
        mahasiswa.setNama(textNama.getText());
        mahasiswa.setJenis_kelamin(jenisKelamin);
        mahasiswa.setAlamat(textAlamat.getText());

        try {
            connection.setAutoCommit(false);
            mahasiswaModel.update(mahasiswa);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DIUPDATE", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "DATA GAGAL DIUPDATE", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaruActionPerformed
        textNim.setText(null);
        textNama.setText(null);

        textAlamat.setText(null);
        textNim.requestFocus();
    }//GEN-LAST:event_buttonBaruActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        String jenisKelamin = null;
        if (radioL.isSelected()) {
            jenisKelamin = "Laki-laki";
        } else if (radioP.isSelected()) {
            jenisKelamin = "Perempuan";
        }

        mahasiswa.setNim(textNim.getText());
        mahasiswa.setNama(textNama.getText());

        mahasiswa.setJenis_kelamin(jenisKelamin);
        mahasiswa.setAlamat(textAlamat.getText());

        try {
            connection.setAutoCommit(false);
            mahasiswaModel.insert(mahasiswa);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DITAMBAH", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "DATA GAGAL DITAMBAH", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        mahasiswa.setNim(textNim.getText());
        mahasiswa.setNama(textNama.getText());

        mahasiswa.setJenis_kelamin(radioL.getText());
        mahasiswa.setJenis_kelamin(radioP.getText());
        mahasiswa.setAlamat(textAlamat.getText());

        try {
            connection.setAutoCommit(false);
            mahasiswaModel.delete(mahasiswa);
            connection.commit();
            JOptionPane.showMessageDialog(this, "DATA BERHASIL DIHAPUS", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "DATA GAGAL DIHAPUS", "KESALAHAN", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MahasiswaForm dialog = new MahasiswaForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBaru;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton radioL;
    private javax.swing.JRadioButton radioP;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    // End of variables declaration//GEN-END:variables
}

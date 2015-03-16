package com.wordpress.bmadi.belajar.jtable.ui;

import com.wordpress.bmadi.belajar.jtable.dao.KontakDao;
import com.wordpress.bmadi.belajar.jtable.model.Kontak;
import com.wordpress.bmadi.belajar.jtable.tablemodel.KontakTableModel;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DaftarKontak extends javax.swing.JFrame {
    
    public DaftarKontak() {
        initComponents();
        
        ListSelectionModel lsm = tblDaftarKontak.getSelectionModel();
        lsm.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent lse) {
                ListSelectionModel sumberEvent = (ListSelectionModel) lse.getSource();
                Integer barisYangDipilih = sumberEvent.getMinSelectionIndex();
                
                KontakTableModel tm = (KontakTableModel) tblDaftarKontak.getModel();
                List<Kontak> data = tm.getData();
                System.out.println("nama : " + data.get(barisYangDipilih).getNama());
                System.out.println("aktif : " + data.get(barisYangDipilih).getAktif());
              
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTampilkan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDaftarKontak = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanActionPerformed(evt);
            }
        });

        tblDaftarKontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDaftarKontak);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTampilkan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTampilkan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanActionPerformed
        KontakDao kd = new KontakDao();
        List<Kontak> k = kd.cariSemua();
        KontakTableModel ktm = new KontakTableModel(k);
        tblDaftarKontak.setModel(ktm);

    }//GEN-LAST:event_btnTampilkanActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarKontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarKontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDaftarKontak;
    // End of variables declaration//GEN-END:variables
}
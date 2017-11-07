/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Muhammad Fahmy
 */
public class v_KANDANG extends javax.swing.JFrame {

    /**
     * Creates new form v_KANDANG
     */
    public v_KANDANG() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jumlahKandang = new javax.swing.JTextField();
        kapasitasKandang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKandang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHapus.setBorder(null);
        btnHapus.setBorderPainted(false);
        btnHapus.setContentAreaFilled(false);
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 90, 40));

        btnKembali.setBorder(null);
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 100, 30));

        btnTambah.setBorder(null);
        btnTambah.setBorderPainted(false);
        btnTambah.setContentAreaFilled(false);
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 100, 40));

        jumlahKandang.setBorder(null);
        jumlahKandang.setOpaque(false);
        getContentPane().add(jumlahKandang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 210, 30));

        kapasitasKandang.setBorder(null);
        kapasitasKandang.setOpaque(false);
        getContentPane().add(kapasitasKandang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 210, 30));

        tableKandang.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKandang.setGridColor(new java.awt.Color(255, 255, 255));
        tableKandang.setOpaque(false);
        jScrollPane1.setViewportView(tableKandang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 590, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/admin_kandang (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(v_KANDANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_KANDANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_KANDANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_KANDANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_KANDANG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahKandang;
    private javax.swing.JTextField kapasitasKandang;
    private javax.swing.JTable tableKandang;
    // End of variables declaration//GEN-END:variables

    public JTextField getJumlahKandang() {
        return jumlahKandang;
    }

    public JTextField getKapasitasKandang() {
        return kapasitasKandang;
    }

    public JTable getTableKandang() {
        return tableKandang;
    }

    public void getBtnTambah(ActionListener a) {
        btnTambah.addActionListener(a);
    }

    public void getBtnHapus(ActionListener a) {
        btnHapus.addActionListener(a);
    }

    public void getBtnKembali(ActionListener a) {
        btnKembali.addActionListener(a);
    }

    public String getValueAt(int baris, int kolom) {
        return tableKandang.getValueAt(baris, kolom).toString();
    }
}

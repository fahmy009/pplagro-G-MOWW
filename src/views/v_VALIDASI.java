/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author Muhammad Fahmy
 */
public class v_VALIDASI extends javax.swing.JFrame {

    /**
     * Creates new form v_VALIDASI
     */
    public v_VALIDASI() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTolak = new javax.swing.JButton();
        btnValidasi = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelValidasi = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        saran = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTolak.setBorder(null);
        btnTolak.setContentAreaFilled(false);
        getContentPane().add(btnTolak, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 160, 50));

        btnValidasi.setBorder(null);
        btnValidasi.setContentAreaFilled(false);
        getContentPane().add(btnValidasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 160, 50));

        btnKembali.setBorder(null);
        btnKembali.setContentAreaFilled(false);
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 680, 160, 50));

        tabelValidasi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelValidasi.setGridColor(new java.awt.Color(255, 255, 255));
        tabelValidasi.setOpaque(false);
        jScrollPane1.setViewportView(tabelValidasi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 690, 520));

        saran.setEditable(false);
        saran.setColumns(20);
        saran.setLineWrap(true);
        saran.setRows(5);
        jScrollPane2.setViewportView(saran);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 540, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/val.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 240, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/admin-validasi.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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
            java.util.logging.Logger.getLogger(v_VALIDASI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_VALIDASI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_VALIDASI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_VALIDASI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_VALIDASI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTolak;
    private javax.swing.JButton btnValidasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea saran;
    private javax.swing.JTable tabelValidasi;
    // End of variables declaration//GEN-END:variables

    public JTextArea getSaran() {
        return saran;
    }

    public JTable getTabelValidasi() {
        return tabelValidasi;
    }
    
    public void getData(MouseListener a) {
        tabelValidasi.addMouseListener(a);
    }

    public void getBtnValidasi(ActionListener a) {
        btnValidasi.addActionListener(a);
    }

    public void getBtnKembali(ActionListener a) {
        btnKembali.addActionListener(a);
    }

    public void getBtnTolak(ActionListener a) {
        btnTolak.addActionListener(a);
    }
}

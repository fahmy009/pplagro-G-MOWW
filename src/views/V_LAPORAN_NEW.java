/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Muhammad Fahmy
 */
public class V_LAPORAN_NEW extends javax.swing.JFrame {

    /**
     * Creates new form V_LAPORAN_NEW
     */
    public V_LAPORAN_NEW() {
        initComponents();
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

        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSapi = new javax.swing.JTable();
        beratSapi = new javax.swing.JTextField();
        jumlahP1 = new javax.swing.JTextField();
        cbPakan1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        saran = new javax.swing.JTextArea();
        cbVitamin = new javax.swing.JComboBox<>();
        cbVaksin = new javax.swing.JComboBox<>();
        btnHitung = new javax.swing.JButton();
        cekP1 = new javax.swing.JCheckBox();
        cekVaksin = new javax.swing.JCheckBox();
        cekVitamin = new javax.swing.JCheckBox();
        umurSapi = new javax.swing.JTextField();
        jumlahP2 = new javax.swing.JTextField();
        cbPakan2 = new javax.swing.JComboBox<>();
        cekP2 = new javax.swing.JCheckBox();
        jumlahP3 = new javax.swing.JTextField();
        cbPakan3 = new javax.swing.JComboBox<>();
        cekP3 = new javax.swing.JCheckBox();
        jumlahVitamin = new javax.swing.JTextField();
        jumlahVaksin = new javax.swing.JTextField();
        nomorSapi = new javax.swing.JComboBox<>();
        jenisSapi = new javax.swing.JTextField();
        jumlahVitamin1 = new javax.swing.JTextField();
        cbVitamin1 = new javax.swing.JComboBox<>();
        cekVitamin1 = new javax.swing.JCheckBox();
        cbVitamin2 = new javax.swing.JComboBox<>();
        cekVitamin2 = new javax.swing.JCheckBox();
        jumlahVitamin2 = new javax.swing.JTextField();
        lberat1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKembali.setBorder(null);
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 690, 150, 50));

        tableSapi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSapi.setEnabled(false);
        tableSapi.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableSapi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 530, 290));

        beratSapi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        beratSapi.setEnabled(false);
        getContentPane().add(beratSapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 370, 50));

        jumlahP1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumlahP1.setEnabled(false);
        getContentPane().add(jumlahP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 70, 50));

        cbPakan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbPakan1.setEnabled(false);
        getContentPane().add(cbPakan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 240, 50));

        saran.setEditable(false);
        saran.setColumns(20);
        saran.setLineWrap(true);
        saran.setRows(5);
        saran.setWrapStyleWord(true);
        saran.setName(""); // NOI18N
        jScrollPane2.setViewportView(saran);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 530, 210));

        cbVitamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbVitamin.setEnabled(false);
        getContentPane().add(cbVitamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 240, 50));

        cbVaksin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbVaksin.setEnabled(false);
        getContentPane().add(cbVaksin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 240, 50));

        btnHitung.setBorder(null);
        btnHitung.setBorderPainted(false);
        btnHitung.setContentAreaFilled(false);
        getContentPane().add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 680, 270, 60));

        cekP1.setBorder(null);
        cekP1.setContentAreaFilled(false);
        getContentPane().add(cekP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 30, 50));

        cekVaksin.setBorder(null);
        cekVaksin.setContentAreaFilled(false);
        getContentPane().add(cekVaksin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 30, 50));

        cekVitamin.setBorder(null);
        cekVitamin.setContentAreaFilled(false);
        getContentPane().add(cekVitamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 30, 50));

        umurSapi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        umurSapi.setEnabled(false);
        getContentPane().add(umurSapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 370, 50));

        jumlahP2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumlahP2.setEnabled(false);
        getContentPane().add(jumlahP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 70, 50));

        cbPakan2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbPakan2.setEnabled(false);
        getContentPane().add(cbPakan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 240, 50));

        cekP2.setBorder(null);
        cekP2.setContentAreaFilled(false);
        getContentPane().add(cekP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 30, 50));

        jumlahP3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumlahP3.setEnabled(false);
        getContentPane().add(jumlahP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 70, 50));

        cbPakan3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbPakan3.setEnabled(false);
        getContentPane().add(cbPakan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 240, 50));

        cekP3.setBorder(null);
        cekP3.setContentAreaFilled(false);
        getContentPane().add(cekP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 30, 50));

        jumlahVitamin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumlahVitamin.setEnabled(false);
        getContentPane().add(jumlahVitamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 70, 50));

        jumlahVaksin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumlahVaksin.setEnabled(false);
        getContentPane().add(jumlahVaksin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, 70, 50));

        nomorSapi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        getContentPane().add(nomorSapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 50));

        jenisSapi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jenisSapi.setEnabled(false);
        getContentPane().add(jenisSapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 270, 50));

        jumlahVitamin1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumlahVitamin1.setEnabled(false);
        getContentPane().add(jumlahVitamin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 70, 50));

        cbVitamin1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbVitamin1.setEnabled(false);
        getContentPane().add(cbVitamin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 240, 50));

        cekVitamin1.setBorder(null);
        cekVitamin1.setContentAreaFilled(false);
        getContentPane().add(cekVitamin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 30, 50));

        cbVitamin2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbVitamin2.setEnabled(false);
        getContentPane().add(cbVitamin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 240, 50));

        cekVitamin2.setBorder(null);
        cekVitamin2.setContentAreaFilled(false);
        getContentPane().add(cekVitamin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 30, 50));

        jumlahVitamin2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jumlahVitamin2.setEnabled(false);
        getContentPane().add(jumlahVitamin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 70, 50));

        lberat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/peternak sppk.png"))); // NOI18N
        lberat1.setText("NOMOR SAPI");
        getContentPane().add(lberat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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
            java.util.logging.Logger.getLogger(V_LAPORAN_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_LAPORAN_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_LAPORAN_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_LAPORAN_NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_LAPORAN_NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beratSapi;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKembali;
    private javax.swing.JComboBox<String> cbPakan1;
    private javax.swing.JComboBox<String> cbPakan2;
    private javax.swing.JComboBox<String> cbPakan3;
    private javax.swing.JComboBox<String> cbVaksin;
    private javax.swing.JComboBox<String> cbVitamin;
    private javax.swing.JComboBox<String> cbVitamin1;
    private javax.swing.JComboBox<String> cbVitamin2;
    private javax.swing.JCheckBox cekP1;
    private javax.swing.JCheckBox cekP2;
    private javax.swing.JCheckBox cekP3;
    private javax.swing.JCheckBox cekVaksin;
    private javax.swing.JCheckBox cekVitamin;
    private javax.swing.JCheckBox cekVitamin1;
    private javax.swing.JCheckBox cekVitamin2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jenisSapi;
    private javax.swing.JTextField jumlahP1;
    private javax.swing.JTextField jumlahP2;
    private javax.swing.JTextField jumlahP3;
    private javax.swing.JTextField jumlahVaksin;
    private javax.swing.JTextField jumlahVitamin;
    private javax.swing.JTextField jumlahVitamin1;
    private javax.swing.JTextField jumlahVitamin2;
    private javax.swing.JLabel lberat1;
    private javax.swing.JComboBox<String> nomorSapi;
    private javax.swing.JTextArea saran;
    private javax.swing.JTable tableSapi;
    private javax.swing.JTextField umurSapi;
    // End of variables declaration//GEN-END:variables

    public void setPakan1(String[] combo) {
        for (String a : combo) {
            this.cbPakan1.addItem(a);
        }
    }

    public void setPakan2(String[] combo) {
        for (String a : combo) {
            this.cbPakan2.addItem(a);
        }
    }

    public void setPakan3(String[] combo) {
        for (String a : combo) {
            this.cbPakan3.addItem(a);
        }
    }

    public void setVitamin(String[] combo) {
        for (String a : combo) {
            this.cbVitamin.addItem(a);
        }
    }

    public void setVitamin1(String[] combo) {
        for (String a : combo) {
            this.cbVitamin1.addItem(a);
        }
    }

    public void setVitamin2(String[] combo) {
        for (String a : combo) {
            this.cbVitamin2.addItem(a);
        }
    }

    public void setVaksin(String[] combo) {
        for (String a : combo) {
            this.cbVaksin.addItem(a);
        }
    }

    public void setNomorSapi(String[] combo) {
        for (String a : combo) {
            this.nomorSapi.addItem(a);
        }
    }

    public void cekPakan1(ItemListener a) {
        this.cekP1.addItemListener(a);
    }

    public void cekPakan2(ItemListener a) {
        this.cekP2.addItemListener(a);
    }

    public void cekPakan3(ItemListener a) {
        this.cekP3.addItemListener(a);
    }

    public void cekVitamin(ItemListener a) {
        this.cekVitamin.addItemListener(a);
    }

    public void cekVitamin1(ItemListener a) {
        this.cekVitamin1.addItemListener(a);
    }

    public void cekVitamin2(ItemListener a) {
        this.cekVitamin2.addItemListener(a);
    }

    public void cekVaksin(ItemListener a) {
        this.cekVaksin.addItemListener(a);
    }

    public void cekNomor(ItemListener a) {
        this.nomorSapi.addItemListener(a);
    }

    public void btnHitung(ActionListener a) {
        btnHitung.addActionListener(a);
    }

    public void btnKembali(ActionListener a) {
        btnKembali.addActionListener(a);
    }

    //muali dari sini bukan tambahan sendiri
    public JTextField getBeratSapi() {
        return beratSapi;
    }

    public JComboBox<String> getNomorSapi() {
        return nomorSapi;
    }

    public JComboBox<String> getCbPakan1() {
        return cbPakan1;
    }

    public JComboBox<String> getCbPakan2() {
        return cbPakan2;
    }

    public JComboBox<String> getCbPakan3() {
        return cbPakan3;
    }

    public JComboBox<String> getCbVaksin() {
        return cbVaksin;
    }

    public JComboBox<String> getCbVitamin() {
        return cbVitamin;
    }

    public JComboBox<String> getCbVitamin1() {
        return cbVitamin1;
    }

    public JComboBox<String> getCbVitamin2() {
        return cbVitamin2;
    }

    public JCheckBox getCekP1() {
        return cekP1;
    }

    public JCheckBox getCekP2() {
        return cekP2;
    }

    public JCheckBox getCekP3() {
        return cekP3;
    }

    public JCheckBox getCekVaksin() {
        return cekVaksin;
    }

    public JCheckBox getCekVitamin() {
        return cekVitamin;
    }

    public JCheckBox getCekVitamin1() {
        return cekVitamin1;
    }

    public JCheckBox getCekVitamin2() {
        return cekVitamin2;
    }

    public JTextField getJenisSapi() {
        return jenisSapi;
    }

    public JTextField getJumlahP1() {
        return jumlahP1;
    }

    public JTextField getJumlahP2() {
        return jumlahP2;
    }

    public JTextField getJumlahP3() {
        return jumlahP3;
    }

    public JTextField getJumlahVaksin() {
        return jumlahVaksin;
    }

    public JTextField getJumlahVitamin() {
        return jumlahVitamin;
    }

    public JTextField getJumlahVitamin1() {
        return jumlahVitamin1;
    }

    public JTextField getJumlahVitamin2() {
        return jumlahVitamin2;
    }

    public JTextArea getSaran() {
        return saran;
    }

    public JTable getTableSapi() {
        return tableSapi;
    }

    public JTextField getUmurSapi() {
        return umurSapi;
    }

    public void jumlahP1(KeyListener a) {
        jumlahP1.addKeyListener(a);
    }

    public void jumlahP2(KeyListener a) {
        jumlahP2.addKeyListener(a);
    }

    public void jumlahP3(KeyListener a) {
        jumlahP3.addKeyListener(a);
    }

    public void jumlahVitamin1(KeyListener a) {
        jumlahVitamin.addKeyListener(a);
    }

    public void jumlahVitamin2(KeyListener a) {
        jumlahVitamin1.addKeyListener(a);
    }

    public void jumlahVitamin3(KeyListener a) {
        jumlahVitamin2.addKeyListener(a);
    }
    
    public void jumlahVaksin(KeyListener a) {
        jumlahVaksin.addKeyListener(a);
    }

    public void erase() {
        cbPakan1.setEnabled(false);
        cbPakan2.setEnabled(false);
        cbPakan3.setEnabled(false);
        cbVaksin.setEnabled(false);
        cbVitamin.setEnabled(false);
        cbPakan1.setSelectedIndex(0);
        cbPakan2.setSelectedIndex(0);
        cbPakan3.setSelectedIndex(0);
        cbVitamin.setSelectedIndex(0);
        cbVitamin1.setSelectedIndex(0);
        cbVitamin2.setSelectedIndex(0);
        cbVaksin.setSelectedIndex(0);
        nomorSapi.setSelectedIndex(0);
        beratSapi.setText("");
        cekP1.setSelected(false);
        cekP1.setSelected(false);
        cekP2.setSelected(false);
        cekP3.setSelected(false);
        cekVitamin.setSelected(false);
        cekVitamin1.setSelected(false);
        cekVitamin2.setSelected(false);
        cekVaksin.setSelected(false);
        jumlahP1.setText("");
        jumlahP2.setText("");
        jumlahP3.setText("");
        jumlahVitamin.setText("");
        jumlahVitamin1.setText("");
        jumlahVitamin2.setText("");
        jumlahVaksin.setText("");
        jenisSapi.setText("");
        umurSapi.setText("");
    }

}

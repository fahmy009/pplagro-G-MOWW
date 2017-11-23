/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.m_sapi;
import models.m_validasi;
import views.v_PENGHITUNG;
import views.v_PETERNAK;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_hitung {

    v_PENGHITUNG view;
    m_sapi model;
    double hasil;
    String lingkardada;

    public c_hitung(v_PENGHITUNG view, m_sapi model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.setNomorSapi(model.nomorSapi());
        view.getTableSapi().setModel(model.getTable());
        view.getHasil(new hitung());
        view.btnUpdate(new btnUpdate());
        view.btnKembali(new btnKembali());
    }

    private class btnUpdate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int hasilP = (int) Math.round(hasil);
                model.update(Integer.toString(hasilP), (String) view.getNomorSapi().getSelectedItem());
//                System.out.println(Double.toString(hasil) +" "+ (String) view.getNomorSapi().getSelectedItem());
                view.getTableSapi().setModel(model.getTable());
                view.getNomorSapi().setSelectedIndex(0);
                view.getLingkarDada().setText("");
                view.getHasilHitungan().setText("");
            } catch (SQLException ex) {
                Logger.getLogger(c_hitung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class btnKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_peternak a = new c_peternak(new v_PETERNAK());
            view.dispose();
        }

    }

    private class hitung implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //rumus Scroll untuk menghitung bobot sapi dengan inputan lingkar dada sapi
            //berat = (lingkardada + 22)^2 / 100
            String regex = "\\d+";
            if (view.getLingkarDada().getText().matches(regex)) {
                hasil = (Math.pow((Double.valueOf(view.getLingkarDada().getText()) + 22), 2)) / 100;
                int hasilP = (int) Math.round(hasil);
                view.getHasilHitungan().setText(Integer.toString(hasilP));
            } else {
                view.getLingkarDada().setText("");
                JOptionPane.showMessageDialog(view, "Silahkan Masukkan Angka dengan Benar");
            }
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.m_user;
import views.v_LOGIN;
import views.v_MENU;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_menu {

    v_MENU view;

    public c_menu(v_MENU view) {
        this.view = view;
        view.setVisible(true);
        view.getBtnLogin(new btnLogin());
        view.getBtnKeluar(new btnKeluar());
    
         this.model = model;
        this.model2 = model;
        view.getTableSapi().setModel(model.getTableLaporan());
        view.setVisible(true);
        //bagian set combo box
        view.setPakan1(model.pakan());
        view.setPakan2(model.pakan());
        view.setPakan3(model.pakan());
        view.setVitamin(model.vitamin());
        view.setVitamin1(model.vitamin());
        view.setVitamin2(model.vitamin());
        view.setVaksin(model.vaksin());
        view.setNomorSapi(model.nomorSapi());
        //end
        view.btnHitung(new btnHitung());
        view.btnKembali(new btnKembali());
        view.cekPakan1(new cekPakan1());
        view.cekPakan2(new cekPakan2());
        view.cekPakan3(new cekPakan3());
        view.cekVitamin(new cekVitamin());
        view.cekVitamin1(new cekVitamin1());
        view.cekVitamin2(new cekVitamin2());
        view.cekVaksin(new cekVaksin());
        view.cekNomor(new cekNomor());

        //bagian set
        view.jumlahP1(new jumlahP1());
        view.jumlahP2(new jumlahP2());
        view.jumlahP3(new jumlahP3());
        view.jumlahVitamin1(new jumlahVitamin());
        view.jumlahVitamin2(new jumlahVitamin2());
        view.jumlahVitamin3(new jumlahVitamin3());
        view.jumlahVaksin(new jumlahVaksin());
    }

    private class jumlahVaksin implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVaksin().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVaksin().getText()) > 150) {
                    JOptionPane.showMessageDialog(view, "Vaksin Maksimal 150 ML / Vitaminnya Silahkan Masukkan Kembali Vitaminnya");
                    view.getJumlahVaksin().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVaksin().setText("");
            }
        }

    }

    private class jumlahVitamin3 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVitamin2().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVitamin2().getText()) > 3) {
                    JOptionPane.showMessageDialog(view, "Vitamin Maksimal 3 kg / Vitaminnya Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahVitamin2().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVitamin2().setText("");
            }
        }

    }

    private class btnKeluar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

        
    }

    private class btnLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_user a = new c_user(new v_LOGIN(), new m_user());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

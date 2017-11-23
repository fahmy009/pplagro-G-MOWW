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
import models.m_sapi;
import models.m_sapi_new;
import models.m_user;
import models.m_validasi;
import views.V_LAPORAN_NEW;
import views.v_ADMINSAPI;
import views.v_LOGIN;
import views.v_PENGHITUNG;
import views.v_PETERNAK;
import views.v_LAPORAN;
import views.v_VALIDASI;
import views.v_VALIDASI_P;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_peternak {

    v_PETERNAK view;

    public c_peternak(v_PETERNAK view) {
        this.view = view;
        view.setVisible(true);
        view.getBtnPertumbuhan(new btnPertumbuhan());
        view.getBtnValidasi(new btnValidasi());
        view.getBtnPenghitung(new btnHitung());
        view.getBtnLogout(new btnLogout());
    }

    private class btnHitung implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_hitung a = new c_hitung(new v_PENGHITUNG(), new m_sapi());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_peternak.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class btnPertumbuhan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_laporan_new a = new c_laporan_new(new V_LAPORAN_NEW(), new m_sapi_new());
//                c_laporan a = new c_laporan(new v_LAPORAN(), new m_sapi());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_peternak.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private class btnValidasi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_validasi a = new c_validasi(new v_VALIDASI_P(), new m_validasi());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_peternak.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private class btnLogout implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_user a = new c_user(new v_LOGIN(), new m_user());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_peternak.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

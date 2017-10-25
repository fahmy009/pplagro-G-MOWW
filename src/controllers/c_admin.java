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
import javax.swing.JOptionPane;
import models.m_kandang;
import models.m_makanan;
import models.m_sapi;
import models.m_user;
import models.m_validasi;
import views.v_ADMIN;
import views.v_ADMINSAPI;
import views.v_KANDANG;
import views.v_LOGIN;
import views.v_MAKANAN;
import views.v_MENU;
import views.v_VALIDASI;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_admin {

    v_ADMIN view;

    public c_admin(v_ADMIN view) {
        this.view = view;
        view.setVisible(true);
        view.getBtnKandang(new btnKandang());
        view.getBtnValidasi(new btnValidasi());
        view.getBtnMakanan(new btnMakanan());
        view.getBtnLogout(new btnLogout());
        view.getBtnSapi(new btnSapi());
        view.getBtnProfile(new btnProfile());
    }

    private class btnProfile implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(view, "masih dalam perbaikan");
        }

    }

    private class btnSapi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_sapi a = new c_sapi(new v_ADMINSAPI(), new m_sapi());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class btnMakanan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_makanan a = new c_makanan(new v_MAKANAN(), new m_makanan());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class btnKandang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_kandang a = new c_kandang(new v_KANDANG(), new m_kandang());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class btnValidasi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_validasi a = new c_validasi(new v_VALIDASI(), new m_validasi());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

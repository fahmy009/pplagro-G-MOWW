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
import models.m_user;
import views.v_ADMIN;
import views.v_LOGIN;
import views.v_MENU;
import views.v_PETERNAK;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_user {

    v_LOGIN view;
    m_user model;

    public c_user(v_LOGIN view, m_user model) {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.getBtnLogin(new login());
        view.getBtnKembali(new kembali());
    }

    private class login implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model.Login(view.getUsername().getText(), view.getPassword().getText());
                if (view.getUsername().getText().equalsIgnoreCase("") || view.getPassword().getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(view, "Username dan Password tidak Boleh Kosong");
                    view.getUsername().setText("");
                    view.getPassword().setText("");
                } else if (model.level_user.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(view, "Pastikan username dan password benar !!!");
                    view.getUsername().setText("");
                    view.getPassword().setText("");
                } else if (model.level_user.equalsIgnoreCase("admin")) {
                    c_admin a = new c_admin(new v_ADMIN());
                    view.dispose();
                } else if (model.level_user.equalsIgnoreCase("peternak")) {
                    c_peternak a = new c_peternak(new v_PETERNAK());
                    view.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(view, "Username dan Password tidak Boleh Kosong");
            }
        }

    }

    private class kembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_menu a = new c_menu(new v_MENU());
            view.dispose();
        }

    }

}

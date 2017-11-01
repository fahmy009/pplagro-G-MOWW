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

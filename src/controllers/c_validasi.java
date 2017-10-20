/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.m_validasi;
import views.v_ADMIN;
import views.v_VALIDASI;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_validasi {
    
    v_VALIDASI view;
    m_validasi model;

    public c_validasi(v_VALIDASI view, m_validasi model) {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.getBtnKembali(new btnKembali());
        view.getBtnTolak(new btnTolak());
        view.getBtnValidasi(new btnValidasi());
    }

    private class btnKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_admin a = new c_admin(new v_ADMIN());
            view.dispose();
        }
    }

    private class btnTolak implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }

    }

    private class btnValidasi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
    
    
}

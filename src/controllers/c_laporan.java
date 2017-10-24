/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import models.koneksi;
import models.m_sapi;
import views.v_LAPORAN;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_laporan {

    v_LAPORAN views;
    m_sapi model;

    public c_laporan(v_LAPORAN views, m_sapi model) throws SQLException {
        this.views = views;
        this.model = model;
        views.setVisible(true);
        views.setNomorSapi(model.nomorSapi());
        views.check(new check());
        views.setMakanan(model.pakan());
        views.validasi(new cek());
        views.validasi2(new cek2());
     
    }

    private class cek2 implements ItemListener {


        @Override
        public void itemStateChanged(ItemEvent e) {
            if (views.getCek2().isSelected()) {
                views.getCbVaksin().setEnabled(true);
            } else {
                views.getCbVaksin().setEnabled(false);
            }
        }
    }

    private class cek implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (views.getCek().isSelected()) {
                views.getCbVitamin().setEnabled(true);
            } else {
                views.getCbVitamin().setEnabled(false);
            }
        }

    }

    private class check implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            try {
                model.berat((String) views.getCbNomor().getSelectedItem());
                model.umur((String) views.getCbNomor().getSelectedItem());
            } catch (SQLException ex) {
                Logger.getLogger(c_laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
            views.getUmurSapi().setText(String.valueOf(m_sapi.umur));
            views.getBeratSapi().setText(String.valueOf(m_sapi.berat));

        }

    }

}

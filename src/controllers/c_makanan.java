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
import models.m_makanan;
import views.v_ADMIN;
import views.v_MAKANAN;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_makanan {

    v_MAKANAN view;
    m_makanan model;

    public c_makanan(v_MAKANAN view, m_makanan model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.setComboAngkatan(model.jenisMakanan());
        view.setComboNama(model.namaMakanan());
        view.getBtnTambah(new btnTambah());
        view.getBtnHapus(new btnHapus());
        view.getBtnKembali(new btnKembali());
        view.getTableMakanan().setModel(model.getTable());
    }

    private class btnKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_admin a = new c_admin(new v_ADMIN());
            view.dispose();
        }
    }

    private class btnTambah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model.save("NULL," + view.getCbJjenisMakanan().getSelectedIndex() + "," + view.getCbMakanan().getSelectedIndex());
                view.getTableMakanan().setModel(model.getTable());
                view.getCbJjenisMakanan().setSelectedIndex(0);
                view.getCbMakanan().setSelectedIndex(0);
            } catch (SQLException ex) {
                Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class btnHapus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model.delete((String) view.getTableMakanan().getValueAt(view.getTableMakanan().getSelectedRow(), 0));
                view.getTableMakanan().setModel(model.getTable());
            } catch (SQLException ex) {
                Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

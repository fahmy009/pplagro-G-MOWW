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
import views.v_ADMIN;
import views.v_KANDANG;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_kandang {

    v_KANDANG view;
    m_kandang model;

    public c_kandang(v_KANDANG view, m_kandang model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.getTableKandang().setModel(model.getTable());
        view.getBtnHapus(new btnHapus());
        view.getBtnKembali(new btnKembali());
        view.getBtnTambah(new btnTambah());
    }

    private class btnHapus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (view.getTableKandang().getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(view, "Silahkan PIlih Data yang akan dihapus");
                } else {
                    model.delete((String) view.getTableKandang().getValueAt(view.getTableKandang().getSelectedRow(), 0));
                    view.getTableKandang().setModel(model.getTable());
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_kandang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
                model.save("'" + view.getJumlahKandang().getText() + "','" + view.getKapasitasKandang().getText() + "'");
                view.getTableKandang().setModel(model.getTable());
            } catch (SQLException ex) {
                Logger.getLogger(c_kandang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

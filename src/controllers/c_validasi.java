/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.m_validasi;
import views.v_ADMIN;
import views.v_PETERNAK;
import views.v_VALIDASI;
import views.v_VALIDASI_P;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_validasi {

    v_VALIDASI view;
    m_validasi model;
    v_VALIDASI_P view2;

    public c_validasi(v_VALIDASI view, m_validasi model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.getTabelValidasi().setModel(model.getTable());
        view.getBtnKembali(new btnKembali());
        view.getBtnTolak(new btnTolak());
        view.getBtnValidasi(new btnValidasi());
        view.getData(new data());
    }

    public c_validasi(v_VALIDASI_P view, m_validasi model) throws SQLException {
        this.view2 = view;
        this.model = model;
        view.setVisible(true);
        view.getValidasi().setModel(model.getTable());
        view.btnKembali(new btnKembaliPeternak());
    }

    private class data implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            view.getSaran().setText((String) view.getTabelValidasi().getValueAt(view.getTabelValidasi().getSelectedRow(), 2));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }

    private class btnKembaliPeternak implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_peternak a = new c_peternak(new v_PETERNAK());
            view2.dispose();
        }

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
            if (view.getTabelValidasi().getSelectedRow() == -1) {
                try {
                    model.update("2", (String) view.getTabelValidasi().getValueAt(view.getTabelValidasi().getSelectedRow(), 0));
                    view.getTabelValidasi().setModel(model.getTable());
                } catch (SQLException ex) {
                    Logger.getLogger(c_validasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    private class btnValidasi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getTabelValidasi().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(view, "Tolong Pilih Data Terlebih Dahulu");
            } else {
                try {
                    model.update("1", (String) view.getTabelValidasi().getValueAt(view.getTabelValidasi().getSelectedRow(), 0));
                    view.getTabelValidasi().setModel(model.getTable());
                } catch (SQLException ex) {
                    Logger.getLogger(c_validasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}

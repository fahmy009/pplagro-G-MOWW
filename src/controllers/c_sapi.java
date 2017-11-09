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
import models.m_sapi;
import views.v_ADMIN;
import views.v_ADMINSAPI;
import views.v_CRUDJENIS;
import views.v_JENISSAPI;
import views.v_LAPORAN;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_sapi {

    v_ADMINSAPI view;
    m_sapi model;
    v_CRUDJENIS view2;

    public c_sapi(v_ADMINSAPI view, m_sapi model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setComboKandang(model.kandang());
        view.setComboJenis(model.nomorJenis());
        view.btnHapus(new btnHapus());
        view.btnKembali(new btnKembali());
        view.btnTambah(new btnTambah());
        view.getTableSapi().setModel(model.getTable());
        view.setVisible(true);
    }

    public c_sapi(v_CRUDJENIS view2, m_sapi model) throws SQLException {
        this.view2 = view2;
        this.model = model;
        view2.setVisible(true);
        view2.getSapi().setModel(model.getTable3());
        view2.btnHapus(new btnHapusJenis());
        view2.btnKembali(new btnKembaliJenis());
        view2.btnTambah(new btnTambahJenis());
    }

    private class btnHapusJenis implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view2.getSapi().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(view2, "Silahkan Pilih Data Terlebih Dahulu");
            } else {
                try {
                    model.delete3((String) view2.getSapi().getValueAt(view2.getSapi().getSelectedRow(), 0));
                    view2.getSapi().setModel(model.getTable3());
                } catch (SQLException ex) {
                    Logger.getLogger(c_sapi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class btnKembaliJenis implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_admin a = new c_admin(new v_JENISSAPI());
            view2.dispose();
        }
    }

    private class btnTambahJenis implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model.save3("NULL,'" + view2.getJenisSapi().getText() + "'");
                view2.getSapi().setModel(model.getTable3());
            } catch (SQLException ex) {
                Logger.getLogger(c_sapi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    private class btnHapus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getTableSapi().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(view, "Silahkan Pilih Data ");
            } else {
                try {
                    model.delete((String) view.getTableSapi().getValueAt(view.getTableSapi().getSelectedRow(), 0));
                    view.getTableSapi().setModel(model.getTable());
                } catch (SQLException ex) {
                    Logger.getLogger(c_sapi.class.getName()).log(Level.SEVERE, null, ex);
                }
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
            if (view.getUmurSapi().getText().equalsIgnoreCase("") || view.getCbKandang().getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(view, "Silahkan Dicek dan Diisi Kembali");
            } else {
                try {
                    model.save("NULL,NULL," + view.getUmurSapi().getText() + ",NULL,NULL,NULL,NULL,NULL," + view.getCbKandang().getSelectedItem() + "," + view.getCbJenisSapi().getSelectedIndex());
                    view.getTableSapi().setModel(model.getTable());
                    view.hapus();
                } catch (SQLException ex) {
                    Logger.getLogger(c_sapi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}

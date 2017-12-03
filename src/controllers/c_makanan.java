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
import models.m_makanan;
import views.v_ADMIN;
import views.v_CRUDPAKAN;
import views.v_MAKANAN;
import views.v_MENUPAKAN;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_makanan {

    v_MAKANAN view;
    m_makanan model;
    v_CRUDPAKAN view2;
    v_MENUPAKAN view3;

    public c_makanan(v_MENUPAKAN view) {
        this.view3 = view;
        view.setVisible(true);
        view.btnLogout(new btnKembali());
        view.btnNamaPakan(new btnPakan());
        view.btnPakan(new btnNamaPakan());
    }

    public c_makanan(v_MAKANAN view, m_makanan model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.setComboAngkatan(model.jenisMakanan());
        view.setComboNama(model.namaMakanan());
        view.getBtnTambah(new btnTambah());
        view.getBtnHapus(new btnHapus());
        view.getBtnKembali(new btnKembali2());
        view.getTableMakanan().setModel(model.getTable());
    }

    public c_makanan(v_CRUDPAKAN view, m_makanan model) throws SQLException {
        this.view2 = view;
        this.model = model;
        view.setVisible(true);
        view.btnHapus(new btnHapus2());
        view.btnKembali(new btnKembali3());
        view.btnTambah(new btnTambah2());
        view.btnUpdate(new btnUpdate());
        view.getPakan().setModel(model.getTable2());
    }

    private class btnPakan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_makanan a = new c_makanan(new v_CRUDPAKAN(), new m_makanan());
                view3.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class btnNamaPakan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_makanan a = new c_makanan(new v_MAKANAN(), new m_makanan());
                view3.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class btnHapus2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view2.getPakan().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(view2, "Silahkan Pilih Data Terlebih Dahulu");
            } else {
                try {
                    model.delete2((String) view2.getPakan().getValueAt(view2.getPakan().getSelectedRow(), 0));
                    view2.getPakan().setModel(model.getTable2());
                } catch (SQLException ex) {
                    Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    private class btnKembali2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_makanan a = new c_makanan(new v_MENUPAKAN());
            view.dispose();
        }

    }

    private class btnKembali3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_makanan a = new c_makanan(new v_MENUPAKAN());
            view2.dispose();
        }

    }

    private class btnTambah2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                model.save2("NULL,'" + view2.getNamaPakan().getText() + "'," + view2.getPersentaseBK().getText() + "," + view2.getPersentasePK().getText() + "," + view2.getPersentaseTDN().getText() + "," + view2.getHarga().getText());
                view2.getPakan().setModel(model.getTable2());
            } catch (SQLException ex) {
                Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class btnUpdate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view2.getPakan().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(view2, "Silahkan Pilih Data Terlebih Dahulu");
            } else {
                try {
                    model.update("nama_makanan='" + view2.getNamaPakan().getText() + "',persentaseBK= " + view2.getPersentaseBK().getText()
                            + ",persentasePK=" + view2.getPersentasePK().getText() + ",persentaseTDN=" + view2.getPersentaseTDN().getText()
                            + ",harga=" + view2.getHarga().getText() + "where id_nama_makanan=" + view2.getPakan().getValueAt(view2.getPakan().getSelectedRow(), 0));
                    view2.getPakan().setModel(model.getTable2());
                } catch (SQLException ex) {
                    Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class btnKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_admin a = new c_admin(new v_ADMIN());
            view3.dispose();
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
            if (view.getTableMakanan().getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(view2, "Silahkan Pilih Data Terlebih Dahulu");
            } else {
                try {
                    model.delete((String) view.getTableMakanan().getValueAt(view.getTableMakanan().getSelectedRow(), 0));
                    view.getTableMakanan().setModel(model.getTable());
                } catch (SQLException ex) {
                    Logger.getLogger(c_makanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}

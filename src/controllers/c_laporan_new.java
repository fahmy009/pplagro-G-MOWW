/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.m_sapi;
import views.V_LAPORAN_NEW;
import views.v_PETERNAK;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_laporan_new {

    V_LAPORAN_NEW view;
    m_sapi model;

    public c_laporan_new(V_LAPORAN_NEW view, m_sapi model) throws SQLException {
        this.view = view;
        this.model = model;
        view.getTableSapi().setModel(model.getTableLaporan());
        view.setVisible(true);
        //bagian set combo box
        view.setPakan1(model.pakan());
        view.setPakan2(model.pakan());
        view.setPakan3(model.pakan());
        view.setVitamin(model.vitamin());
        view.setVaksin(model.vaksin());
        view.setNomorSapi(model.nomorSapi());
        //end
        view.btnHitung(new btnHitung());
        view.btnKembali(new btnKembali());
        view.cekPakan1(new cekPakan1());
        view.cekPakan2(new cekPakan2());
        view.cekPakan3(new cekPakan3());
        view.cekVitamin(new cekVitamin());
        view.cekVaksin(new cekVaksin());
        view.cekNomor(new cekNomor());
    }

    private class cekNomor implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            try {
                model.jenis((String) view.getNomorSapi().getSelectedItem());
                model.berat((String) view.getNomorSapi().getSelectedItem());
                model.umur((String) view.getNomorSapi().getSelectedItem());
                view.getUmurSapi().setText(String.valueOf(m_sapi.umur));
                view.getBeratSapi().setText(String.valueOf(m_sapi.berat));
                view.getJenisSapi().setText(m_sapi.jenis);
            } catch (SQLException ex) {
                Logger.getLogger(c_laporan_new.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class cekPakan1 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (view.getCekP1().isSelected()) {
                view.getCbPakan1().setEnabled(true);
                view.getJumlahP1().setEnabled(true);
            } else {
                view.getCbPakan1().setEnabled(false);
                view.getJumlahP1().setEnabled(false);
            }
        }

    }

    private class cekPakan2 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (view.getCekP2().isSelected()) {
                view.getCbPakan2().setEnabled(true);
                view.getJumlahP2().setEnabled(true);
            } else {
                view.getCbPakan2().setEnabled(false);
                view.getJumlahP2().setEnabled(false);
            }
        }

    }

    private class cekPakan3 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (view.getCekP3().isSelected()) {
                view.getCbPakan3().setEnabled(true);
                view.getJumlahP3().setEnabled(true);
            } else {
                view.getCbPakan3().setEnabled(false);
                view.getJumlahP3().setEnabled(false);
            }
        }

    }

    private class cekVitamin implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (view.getCekVitamin().isSelected()) {
                view.getCbVitamin().setEnabled(true);
                view.getJumlahVitamin().setEnabled(true);
            } else {
                view.getCbVitamin().setEnabled(false);
                view.getJumlahVitamin().setEnabled(false);
            }
        }

    }

    private class cekVaksin implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (view.getCekVaksin().isSelected()) {
                view.getCbVaksin().setEnabled(true);
                view.getJumlahVaksin().setEnabled(true);
            } else {
                view.getCbVaksin().setEnabled(false);
                view.getJumlahVaksin().setEnabled(false);
            }
        }
    }

    private class btnKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_peternak a = new c_peternak(new v_PETERNAK());
            view.dispose();
        }

    }

    private class btnHitung implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.getSaran().setText("Tambahkan Vitamin dan Vaksin selama 1 minggu kedepan kemudian cek lagi untuk kelakuan dan kebiasaan sapi");
            //bk = 3% * berat sapi
            //pk = 14% * bk
            //perbandingan = 60 : 30 : 10 || hijauan(rerumuputan/alami) : konsentrat(buatan/sentrat) : vaksinasi
            //bk hijauan = 60% * bk
            //bk konsentrat = 30% * bk
            //pk (bahan makanan) = pk bahan * bk hijauan
            //pk konsentrat untuk menutupi kekurangan = pk - pk (bahan makanan) 
            // z pk(konsentrat) = (pk konseetrat kebutuhan / bk konsentrat) * 100%
            //perhitungan z konsentrat
            
            //jika z konsentrat = z
            //maka bahan makanan (vitamin) = 30% * pk bahan makanan (vitamin) -- ada ditabel tdn
            //untuk bahan makanan (utama) = 60% * pk bahan makanan  (utama) -- ada ditabel tdn
            //untuk vaksin = 10% * pk vitamin -- ada di tdn
            //hasil perhitungan sumber energi = utama + vitamin + vaksin
            
            //hasil perhitungan sumber protein = utama + konsentrat (beda kandungan) || 15% dari 2 bahan makanan yang berbeda
            
            //----pearson square method
            //sumber energi     |   hasil perhitungan energi                        (z pk(konsentrat) - hasil perhitungan protein)      30%
            //
            //
            //                                                  z pk(konsentrat)
            //                                          
            //
            //sumber protein    |   hasil perhitungan protein                       
            
            view.erase();
        }
    }

}

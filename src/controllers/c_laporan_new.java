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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.m_sapi_new;
import views.V_LAPORAN_NEW;
import views.v_PETERNAK;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_laporan_new {

    V_LAPORAN_NEW view;
    m_sapi_new model2;
    public int jumlah = 0;
    String regex = "\\d+";
    float kb_pakan1;
    float kb_pakan2;
    float kb_pakan3;
    float kb_vitamin1;
    float kb_vitamin2;
    float kb_vitamin3;
    float kb_vaksin1;

    public c_laporan_new(V_LAPORAN_NEW view, m_sapi_new model) throws SQLException {
        this.view = view;
//        this.model = model;
        this.model2 = model;
        view.getTableSapi().setModel(model.getTableLaporan());
        view.setVisible(true);
        //bagian set combo box
        view.setPakan1(model.pakan());
        view.setPakan2(model.pakan());
        view.setPakan3(model.pakan());
        view.setVitamin(model.vitamin());
        view.setVitamin1(model.vitamin());
        view.setVitamin2(model.vitamin());
        view.setVaksin(model.vaksin());
        view.setNomorSapi(model.nomorSapi());
        //end
        view.btnHitung(new btnHitung());
        view.btnKembali(new btnKembali());
        view.cekPakan1(new cekPakan1());
        view.cekPakan2(new cekPakan2());
        view.cekPakan3(new cekPakan3());
        view.cekVitamin(new cekVitamin());
        view.cekVitamin1(new cekVitamin1());
        view.cekVitamin2(new cekVitamin2());
        view.cekVaksin(new cekVaksin());
        view.cekNomor(new cekNomor());

        //bagian set
        view.jumlahP1(new jumlahP1());
        view.jumlahP2(new jumlahP2());
        view.jumlahP3(new jumlahP3());
        view.jumlahVitamin1(new jumlahVitamin());
        view.jumlahVitamin2(new jumlahVitamin2());
        view.jumlahVitamin3(new jumlahVitamin3());
        view.jumlahVaksin(new jumlahVaksin());
    }

    private class jumlahVaksin implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVaksin().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVaksin().getText()) > 150) {
                    JOptionPane.showMessageDialog(view, "Vaksin Maksimal 150 ML / Vitaminnya Silahkan Masukkan Kembali Vitaminnya");
                    view.getJumlahVaksin().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVaksin().setText("");
            }
        }

    }

    private class jumlahVitamin3 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVitamin2().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVitamin2().getText()) > 3) {
                    JOptionPane.showMessageDialog(view, "Vitamin Maksimal 3 kg / Vitaminnya Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahVitamin2().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVitamin2().setText("");
            }
        }

    }

    private class jumlahVitamin2 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVitamin1().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVitamin1().getText()) > 3) {
                    JOptionPane.showMessageDialog(view, "Vitamin Maksimal 3 kg / Vitaminnya Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahVitamin1().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVitamin().setText("");
            }
        }

    }

    private class jumlahVitamin implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahVitamin().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahVitamin().getText()) > 3) {
                    JOptionPane.showMessageDialog(view, "Vitamin Maksimal 3 kg / Vitaminnya Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahVitamin().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahVitamin().setText("");
            }
        }

    }

    private class jumlahP3 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahP3().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahP3().getText()) > 5) {
                    JOptionPane.showMessageDialog(view, "Makanan Maksimal 5 kg / Pakan Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahP3().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahP3().setText("");
            }
        }

    }

    private class jumlahP2 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahP2().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahP2().getText()) > 5) {
                    JOptionPane.showMessageDialog(view, "Makanan Maksimal 5 kg / Pakan Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahP2().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahP2().setText("");
            }
        }

    }

    private class jumlahP1 implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (view.getJumlahP1().getText().matches(regex)) {
                if (Integer.valueOf(view.getJumlahP1().getText()) > 5) {
                    JOptionPane.showMessageDialog(view, "Makanan Maksimal 5 kg / Pakan Silahkan Masukkan Kembali Beratnya");
                    view.getJumlahP1().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(view, "Mohon Untuk Memasukkan Karakter Angka");
                view.getJumlahP1().setText("");
            }
        }

    }

    private class cekVitamin1 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (view.getCekVitamin1().isSelected()) {
                view.getCbVitamin1().setEnabled(true);
                view.getJumlahVitamin1().setEnabled(true);
            } else {
                view.getCbVitamin1().setEnabled(false);
                view.getJumlahVitamin1().setEnabled(false);
            }
        }
    }

    private class cekVitamin2 implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (view.getCekVitamin2().isSelected()) {
                view.getCbVitamin2().setEnabled(true);
                view.getJumlahVitamin2().setEnabled(true);
            } else {
                view.getCbVitamin2().setEnabled(false);
                view.getJumlahVitamin2().setEnabled(false);
            }
        }
    }

    private class cekNomor implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            try {
                model2.jenis((String) view.getNomorSapi().getSelectedItem());
                model2.berat((String) view.getNomorSapi().getSelectedItem());
                model2.umur((String) view.getNomorSapi().getSelectedItem());
                view.getUmurSapi().setText(String.valueOf(m_sapi_new.umur));
                view.getBeratSapi().setText(String.valueOf(m_sapi_new.berat));
                view.getJenisSapi().setText(m_sapi_new.jenis);
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
            //sumber energi     |   hasil perhitungan energi                        (z pk(konsentrat) - hasil perhitungan protein)      = ((z pk(konsentrat) - hasil perhitungan protein)/jumlah energi ditambah protein)*100%
            //
            //
            //                                                  z pk(konsentrat)
            //                                          
            //
            //sumber protein    |   hasil perhitungan protein                       hasil perhitungan energi - z pk(konsentrat)         = ((hasil perhitungan energi - z pk(konsentrat))/jumlah energi ditambah protein)*100%
            //                      
            //                      jumlah energi ditambah protein
            if (view.getNomorSapi().getSelectedItem().equals("-")) {
                JOptionPane.showMessageDialog(view, "Tolong pilih sapi terlebih dulu");
            } else if (!view.getCekP1().isSelected() || !view.getCekP2().isSelected() || !view.getCekP3().isSelected() || !view.getCekVitamin().isSelected() || !view.getCekVitamin1().isSelected() || !view.getCekVitamin2().isSelected() || !view.getCekVaksin().isSelected()) {
                JOptionPane.showMessageDialog(view, "Tolong lengkapi data terlebih dulu");
            } else {
                float bahan_kering = (float) (0.03 * Float.valueOf(view.getBeratSapi().getText()));
                float p_konsentrat = (float) (0.14 * bahan_kering);
                float hijauan = (float) (0.2 * bahan_kering); //20% * 3 = 20 : 20 : 20 (makanan)
                float konsentrat_30 = (float) (0.3 * bahan_kering);//10% * 3 = 10 : 10 : 10 (vitamin)
                float bk_konsentrat = (float) (0.4 * bahan_kering);//10% * 3 = 10 : 10 : 10 (vitamin)
                float konsentrat = (float) (0.1 * bahan_kering);//10% * 3 = 10 : 10 : 10 (vitamin)
                float vaksin = (float) (0.1 * bahan_kering);//10% vaksin

                try {

                    //pakan
                    model2.makanan((String) view.getCbPakan1().getSelectedItem());
                    model2.harga((String) view.getCbPakan1().getSelectedItem());
                    String bk_pakan1 = m_sapi_new.getBk();
                    String pk_pakan1 = m_sapi_new.getPk();
                    double h_pakan1 = m_sapi_new.h;
                    float harga_pakan1 = (float) (kb_pakan1 * h_pakan1);
                    float pk_makanan1 = (Float.valueOf(pk_pakan1) / 100) * hijauan;

                    model2.makanan((String) view.getCbPakan2().getSelectedItem());
                    model2.harga((String) view.getCbPakan1().getSelectedItem());
                    String bk_pakan2 = m_sapi_new.getBk();
                    String pk_pakan2 = m_sapi_new.getPk();
                    double h_pakan2 = m_sapi_new.h;
                    float harga_pakan2 = (float) (kb_pakan2 * h_pakan2);
                    float pk_makanan2 = (Float.valueOf(pk_pakan2) / 100) * hijauan;

                    model2.makanan((String) view.getCbPakan3().getSelectedItem());
                    model2.harga((String) view.getCbPakan1().getSelectedItem());
                    String bk_pakan3 = m_sapi_new.getBk();
                    String pk_pakan3 = m_sapi_new.getPk();
                    double h_pakan3 = m_sapi_new.h;
                    float harga_pakan3 = (float) (kb_pakan3 * h_pakan3);
                    float pk_makanan3 = (Float.valueOf(pk_pakan3) / 100) * hijauan;

                    // end of pakan
                    // vitamin
                    model2.makanan((String) view.getCbVitamin().getSelectedItem());
                    model2.harga((String) view.getCbPakan1().getSelectedItem());
                    String bk_vitamin1 = m_sapi_new.getBk();
                    String pk_vitamin1 = m_sapi_new.getPk();
                    double h_vitamin1 = m_sapi_new.h;
                    float harga_vitamin1 = (float) (kb_vitamin1 * h_vitamin1);
                    float pk_vita1 = (Float.valueOf(pk_vitamin1) / 100) * konsentrat;

                    model2.makanan((String) view.getCbVitamin1().getSelectedItem());
                    model2.harga((String) view.getCbPakan1().getSelectedItem());
                    String bk_vitamin2 = m_sapi_new.getBk();
                    String pk_vitamin2 = m_sapi_new.getPk();
                    double h_vitamin2 = m_sapi_new.h;
                    float harga_vitamin2 = (float) (kb_vitamin2 * h_vitamin2);
                    float pk_vita2 = (Float.valueOf(pk_vitamin2) / 100) * konsentrat;

                    model2.makanan((String) view.getCbVitamin2().getSelectedItem());
                    model2.harga((String) view.getCbPakan1().getSelectedItem());
                    String bk_vitamin3 = m_sapi_new.getBk();
                    String pk_vitamin3 = m_sapi_new.getPk();
                    double h_vitamin3 = m_sapi_new.h;
                    float harga_vitamin3 = (float) (kb_vitamin3 * h_vitamin3);
                    float pk_vita3 = (Float.valueOf(pk_vitamin3) / 100) * konsentrat;

                    model2.makanan((String) view.getCbVitamin2().getSelectedItem());
                    model2.harga((String) view.getCbPakan1().getSelectedItem());
                    String bk_vaksin = m_sapi_new.getBk();
                    String pk_vaksin = m_sapi_new.getPk();
                    double h_vaksin = m_sapi_new.h;
                    float harga_vaksin = (float) (kb_vaksin1 * h_vaksin);
                    float pk_vaksinasi = (Float.valueOf(pk_vaksin) / 100) * vaksin;

// end of vitamin
                    float totalMakanan = (pk_makanan1 + pk_makanan2 + pk_makanan3);
                    float totalVitamin = pk_vita1 + pk_vita2 + pk_vita3;
                    float kekurangan = p_konsentrat - totalMakanan;
//                float kekurangan_v = konsentrat_30 - totalVitamin;

                    float z_konsentrat = kekurangan / konsentrat_30 * 100;

                    float bahanVitamin = ((10 * (Float.valueOf(pk_vitamin1))) / 100) + ((10 * (Float.valueOf(pk_vitamin2))) / 100) + ((10 * (Float.valueOf(pk_vitamin3))) / 100);
                    float bahanMakanan = ((20 * (Float.valueOf(pk_makanan1))) / 100) + ((20 * (Float.valueOf(pk_makanan2))) / 100) + ((20 * (Float.valueOf(pk_makanan3))) / 100);
                    float bahanVaksin = (10 * Float.valueOf(pk_vaksin)) / 100;

                    float sumber_energi = bahanMakanan + bahanVitamin + bahanVaksin;
                    float sumber_protein = bahanMakanan + (bahanVitamin / 2);

                    float jumlahAtas = sumber_protein - z_konsentrat;
                    float jumlahBawah = sumber_energi - z_konsentrat;

                    float jumlahEP = sumber_energi + sumber_protein;

                    float persentaseAtas = (jumlahAtas / jumlahEP) * 100;
                    float persentaseBawah = (jumlahBawah / jumlahEP) * 100;

                    float jumlahA = (float) (0.6 * (Float.valueOf(view.getJumlahP1().getText()) + Float.valueOf(view.getJumlahP1().getText()) + Float.valueOf(view.getJumlahP1().getText())));
                    float jumlahB = (float) (0.3 * (Float.valueOf(view.getJumlahVitamin().getText()) + Float.valueOf(view.getJumlahVitamin1().getText()) + Float.valueOf(view.getJumlahVitamin2().getText())));
                    float jumlahC = (float) (0.1 * Float.valueOf(view.getJumlahVaksin().getText()));

                    float persentaseA = Math.round(Math.abs(persentaseAtas) * jumlahA);
                    float persentaseB = Math.round(Math.abs(persentaseBawah) * jumlahB);
                    float persentaseC = Math.round(Math.abs(persentaseBawah) * jumlahC);

                    float permisalanB = Math.round(persentaseB + persentaseC);

                    float hasil = permisalanB + persentaseA;

                    float hasilSebelum = permisalanB + persentaseA;

                    Random rand = new Random();
                    int kondisi1 = rand.nextInt((25 - 1) + 1) + 1;
                    int kondisi2 = rand.nextInt((50 - 25) + 1) + 25;
                    int kondisi3 = rand.nextInt((80 - 50) + 1) + 50;
                    int kondisi4 = rand.nextInt((100 - 80) + 1) + 80;
                    int kondisi5 = rand.nextInt((200 - 100) + 1) + 100;

                    if (hasil < 150) {
                        hasil = kondisi1;
                    } else if (hasil > 150 && hasil < 300) {
                        hasil = kondisi2;
                    } else if (hasil > 300 && hasil < 400) {
                        hasil = kondisi3;
                    } else if (hasil > 400 && hasil < 1200) {
                        hasil = kondisi4;
                    } else {
                        hasil = kondisi5;
                    }

                    String pertumbuhan = null;
                    double pertumbuhan1 = 0;

                    if (Float.valueOf(view.getBeratSapi().getText()) > 300 && Float.valueOf(view.getBeratSapi().getText()) < 600 && view.getJenisSapi().getText().equalsIgnoreCase("") && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "0.6 - 0.8";
                        pertumbuhan1 = 0.6;
//                    pertumbuhan1 = rand.nextInt((int)(((0.8 - 0.6) + 0.8) + 0.8));
                    } else if (Float.valueOf(view.getBeratSapi().getText()) > 400 && Float.valueOf(view.getBeratSapi().getText()) < 600 && view.getJenisSapi().getText().equalsIgnoreCase("bali") && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "0.6 - 0.8";
                        pertumbuhan1 = 0.7;
//                    pertumbuhan1 = rand.nextInt((int) (((0.8 - 0.6) + 0.8) + 0.8));
                    } else if (Float.valueOf(view.getBeratSapi().getText()) > 250 && Float.valueOf(view.getBeratSapi().getText()) < 300 && view.getJenisSapi().getText().equalsIgnoreCase("madura") && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "0.3 - 0.6";
//                    pertumbuhan1 = rand.nextInt((int) (((0.6 - 0.3) + 0.6) + 0.3));
                        pertumbuhan1 = 0.4;
                    } else if (Float.valueOf(view.getBeratSapi().getText()) < 800 && view.getJenisSapi().getText().equalsIgnoreCase("brahma") && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "0.8 - 1.2";
                        pertumbuhan1 = 0.8;
//                    pertumbuhan1 = rand.nextInt((int) (((1.2 - 0.8) + 1.2) + 0.8));
                    } else if (Float.valueOf(view.getBeratSapi().getText()) > 800 && Float.valueOf(view.getBeratSapi().getText()) < 1200 && view.getJenisSapi().getText().equalsIgnoreCase("limousin") && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "1.2 - 1.4";
                        pertumbuhan1 = 1.3;
//                    pertumbuhan1 = rand.nextInt((int) (((1.4 - 1.2) + 1.4) + 1.2));
                    } else if (Float.valueOf(view.getBeratSapi().getText()) > 800 && Float.valueOf(view.getBeratSapi().getText()) < 1000 && view.getJenisSapi().getText().equalsIgnoreCase("Aberdeen Angus") && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "1 - 1.2";
                        pertumbuhan1 = 1.2;
//                    pertumbuhan1 = rand.nextInt((int) ((1.2 - 1) + 1.2)) + 1;
                    } else if (Float.valueOf(view.getBeratSapi().getText()) > 800 && Float.valueOf(view.getBeratSapi().getText()) < 1000 && view.getJenisSapi().getText().equalsIgnoreCase("Simmental") && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "1.2 - 1.4";
                        pertumbuhan1 = 1.3;
//                    pertumbuhan1 = rand.nextInt((int) (((1.4 - 1.2) + 1.4) + 1.2));
                    } else if (Float.valueOf(view.getBeratSapi().getText()) > 200 && Float.valueOf(view.getBeratSapi().getText()) < 500 && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "0.1 - 0.4";
                        pertumbuhan1 = 0.3;
//                    pertumbuhan1 = rand.nextInt((int) (((0.4 - 0.1) + 0.4) + 0.1));
                    } else if (Float.valueOf(view.getBeratSapi().getText()) > 500 && Integer.valueOf(view.getUmurSapi().getText()) > 1) {
                        pertumbuhan = "0.6 - 0.8";
                        pertumbuhan1 = 0.6;
//                    pertumbuhan1 = rand.nextInt((int) (((0.8 - 0.6) + 0.8) + 0.6));
                    }

                    float atas = persentaseA * bk_konsentrat;
                    float bawah = permisalanB * bk_konsentrat;

                    if (atas > 100 && bawah > 100) {
                        atas = (float) (atas * 0.1);
                        bawah = (float) (bawah * 0.1);
                    } else if (atas > 1000 && bawah > 1000) {
                        atas = (float) (atas * 0.01);
                        bawah = (float) (bawah * 0.01);
                    }

                    kb_pakan1 = (float) (0.6 * atas);
                    kb_pakan2 = (float) (0.6 * atas);
                    kb_pakan3 = (float) (0.6 * atas);
                    kb_vitamin1 = (float) (0.4 * bawah);
                    kb_vitamin2 = (float) (0.4 * bawah);
                    kb_vitamin3 = (float) (0.4 * bawah);
                    kb_vaksin1 = (float) (0.4 * bawah);

                    float harga_pakan = harga_pakan1 + harga_pakan2 + harga_pakan3;
                    float harga_vitamin = harga_vitamin1 + harga_vitamin2 + harga_vitamin3;
                    float harga_total = harga_pakan + harga_vitamin + harga_vaksin;

                    String saran1 = "pertumbuhan bobot sapi sangat kurang \n"
                            + "    dengan pertumbuhan berat selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                            + "    kombinasi pakan, vaksin & vitamin sangat kurang memenuhi sehingga pertumbuhan sapi kecil sekali sehingga tidak sesuai dengan apa yang diharapkan.\n"
                            + "    pilih jenis " + view.getCbPakan1().getSelectedItem() + " sebesar = " + kb_pakan1 + " kg\n"
                            + "    pilih jenis " + view.getCbPakan2().getSelectedItem() + " sebesar = " + kb_pakan2 + " kg\n"
                            + "    pilih jenis " + view.getCbPakan3().getSelectedItem() + " sebesar = " + kb_pakan3 + " kg\n"
                            + "    pilih jenis " + view.getCbVitamin().getSelectedItem() + " sebesar = " + kb_vitamin1 + " kg\n"
                            + "    pilih jenis " + view.getCbVitamin1().getSelectedItem() + " sebesar = " + kb_vitamin2 + " kg\n"
                            + "    pilih jenis " + view.getCbVitamin2().getSelectedItem() + " sebesar = " + kb_vitamin3 + " kg\n"
                            + "    pilih jenis " + view.getCbVaksin().getSelectedItem() + " sebesar = " + kb_vaksin1 + " ml\n"
                            + "    dengan biaya pakan sebesar Rp. " + harga_pakan + " , vitamin sebesar Rp. " + harga_vitamin + " , dan vaksin sebesar Rp. " + harga_vaksin + " .\n"
                            + "    sehingga biaya total dalam 1 Bulan sebesar = Rp. " + harga_total + " dengan harga daging sapi = Rp.110.000/Kg \n"
                            + "    maka peternak akan mendapatkan keuntungan sebesar = Rp. " + Math.abs((((pertumbuhan1 * 30) * 110000) - (harga_pakan * 3))) + "/bulan";
                    String saran2 = "pertumbuhan bobot sapi kurang\n"
                            + "    dengan pertumbuhan berat selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                            + "    kombinasi pakan, vaksin & vitamin kurang memenuhi sehingga pertumbuhan sapi tidak sesuai dengan apa yang diharapkan.\n"
                            + "    pilih jenis " + view.getCbPakan1().getSelectedItem() + " sebesar = " + kb_pakan1 + " kg\n"
                            + "    pilih jenis " + view.getCbPakan2().getSelectedItem() + " sebesar = " + kb_pakan2 + " kg\n"
                            + "    pilih jenis " + view.getCbVitamin().getSelectedItem() + " sebesar = " + kb_vitamin1 + " kg\n"
                            + "    pilih jenis " + view.getCbVitamin2().getSelectedItem() + " sebesar = " + kb_vitamin2 + " kg\n"
                            + "    pilih jenis " + view.getCbVaksin().getSelectedItem() + " sebesar  = " + kb_vaksin1 + " ml\n"
                            + "    dengan biaya pakan sebesar Rp. " + harga_pakan + " , vitamin sebesar Rp. " + harga_vitamin + " , dan vaksin sebesar Rp. " + harga_vaksin + " .\n"
                            + "    sehingga biaya total dalam 1 Bulan sebesar = Rp. " + harga_total + " dengan harga daging sapi = Rp.110.000/Kg \n"
                            + "    maka peternak akan mendapatkan keuntungan sebesar = Rp. " + Math.abs((((pertumbuhan1 * 30) * 110000) - (harga_pakan * 3))) + "/bulan";
                    String saran3 = "pertumbuhan bobot sapi normal\n"
                            + "    dengan pertumbuhan berat selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                            + "    kombinasi pakan, vaksin & vitamin sudah memenuhi dengan apa yang diharapkan.\n"
                            //                        + "    dengan biaya pakan sebesar Rp. " + (harga_pakan * 0.1) + " , vitamin sebesar Rp. " + harga_vitamin + " , dan vaksin sebesar Rp. " + harga_vaksin + " .\n"
                            + "    sehingga biaya total dalam 1 Bulan sebesar = Rp. 250000 dengan harga daging sapi = Rp.110.000/Kg \n"
                            + "    maka peternak akan mendapatkan keuntungan sebesar = Rp. " + Math.abs((((pertumbuhan1 * 30) * 110000) - (harga_pakan * 3))) + "/bulan";
                    String saran4 = "sapi stress \n"
                            + "    pertumbuhan bobot sapi menurun selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                            + "    kombinasi pakan, vaksin & vitamin melebihi batas maksimum sehingga mengakibatkan pertumbuhan sapi menurun drastis dan mengganggu kesehatan sapi.\n"
                            + "    pilih jenis pakan, vitamin, & vaksin yang sesuai sehingga pertumbuhan sapi meningkat tiap bulannya";

                    if (hasil < 40) {
                        view.getSaran().setText("pertumbuhan bobot sapi sangat kurang \n"
                                + "    dengan pertumbuhan berat selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                                + "    kombinasi pakan, vaksin & vitamin sangat kurang memenuhi sehingga pertumbuhan sapi kecil sekali sehingga tidak sesuai dengan apa yang diharapkan.\n"
                                + "    pilih jenis " + view.getCbPakan1().getSelectedItem() + " sebesar = " + kb_pakan1 + " kg\n"
                                + "    pilih jenis " + view.getCbPakan2().getSelectedItem() + " sebesar = " + kb_pakan2 + " kg\n"
                                + "    pilih jenis " + view.getCbPakan3().getSelectedItem() + " sebesar = " + kb_pakan3 + " kg\n"
                                + "    pilih jenis " + view.getCbVitamin().getSelectedItem() + " sebesar = " + kb_vitamin1 + " kg\n"
                                + "    pilih jenis " + view.getCbVitamin1().getSelectedItem() + " sebesar = " + kb_vitamin2 + " kg\n"
                                + "    pilih jenis " + view.getCbVitamin2().getSelectedItem() + " sebesar = " + kb_vitamin3 + " kg\n"
                                + "    pilih jenis " + view.getCbVaksin().getSelectedItem() + " sebesar = " + kb_vaksin1 + " ml\n"
                                + "    dengan biaya pakan sebesar Rp. " + harga_pakan + " , vitamin sebesar Rp. " + harga_vitamin + " , dan vaksin sebesar Rp. " + harga_vaksin + " .\n"
                                + "    sehingga biaya total dalam 1 Bulan sebesar = Rp. " + harga_total + " dengan harga daging sapi = Rp.110.000/Kg \n"
                                + "    maka peternak akan mendapatkan keuntungan sebesar = Rp. " + Math.abs((((pertumbuhan1 * 30) * 110000) - (harga_pakan * 3))) + "/bulan");
                        model2.update2("'" + saran1 + "'", (String) view.getNomorSapi().getSelectedItem());
                        model2.idpakan((String) view.getCbPakan1().getSelectedItem());
                        model2.save4("NULL, " + (String) view.getNomorSapi().getSelectedItem() + m_sapi_new.id_pakan + ",now()");
                        view.getTableSapi().setModel(model2.getTableLaporan());
                    } else if (hasil > 40 && hasil < 80) {
                        view.getSaran().setText("pertumbuhan bobot sapi kurang\n"
                                + "    dengan pertumbuhan berat selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                                + "    kombinasi pakan, vaksin & vitamin kurang memenuhi sehingga pertumbuhan sapi tidak sesuai dengan apa yang diharapkan.\n"
                                + "    pilih jenis " + view.getCbPakan1().getSelectedItem() + " sebesar = " + kb_pakan1 + " kg\n"
                                + "    pilih jenis " + view.getCbPakan2().getSelectedItem() + " sebesar = " + kb_pakan2 + " kg\n"
                                + "    pilih jenis " + view.getCbVitamin().getSelectedItem() + " sebesar = " + kb_vitamin1 + " kg\n"
                                + "    pilih jenis " + view.getCbVitamin2().getSelectedItem() + " sebesar = " + kb_vitamin2 + " kg\n"
                                + "    pilih jenis " + view.getCbVaksin().getSelectedItem() + " sebesar  = " + kb_vaksin1 + " ml\n"
                                + "    dengan biaya pakan sebesar Rp. " + harga_pakan + " , vitamin sebesar Rp. " + harga_vitamin + " , dan vaksin sebesar Rp. " + harga_vaksin + " .\n"
                                + "    sehingga biaya total dalam 1 Bulan sebesar = Rp. " + harga_total + " dengan harga daging sapi = Rp.110.000/Kg \n"
                                + "    maka peternak akan mendapatkan keuntungan sebesar = Rp. " + Math.abs((((pertumbuhan1 * 30) * 110000) - (harga_pakan * 3))) + "/bulan");
                        model2.update2("'" + saran2 + "'", (String) view.getNomorSapi().getSelectedItem());
                        model2.idpakan((String) view.getCbPakan1().getSelectedItem());
                        model2.save4("NULL, " + (String) view.getNomorSapi().getSelectedItem() + m_sapi_new.id_pakan + ",now()");
                        view.getTableSapi().setModel(model2.getTableLaporan());
                    } else if (hasil > 80 && hasil < 100) {
                        view.getSaran().setText("pertumbuhan bobot sapi normal\n"
                                + "    dengan pertumbuhan berat selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                                + "    kombinasi pakan, vaksin & vitamin sudah memenuhi dengan apa yang diharapkan.\n"
                                + "    dengan biaya pakan sebesar Rp. " + (harga_pakan * 0.1) + " , vitamin sebesar Rp. " + harga_vitamin + " , dan vaksin sebesar Rp. " + harga_vaksin + " .\n"
                                + "    sehingga biaya total dalam 1 Bulan sebesar = Rp. 150000 dengan harga daging sapi = Rp.110.000/Kg \n"
                                + "    maka peternak akan mendapatkan keuntungan sebesar = Rp. " + Math.abs((((pertumbuhan1 * 30) * 110000) - (harga_pakan * 3))) + "/bulan");
                        model2.update2("'" + saran3 + "'", (String) view.getNomorSapi().getSelectedItem());
                        model2.idpakan((String) view.getCbPakan1().getSelectedItem());
                        model2.save4("NULL, " + (String) view.getNomorSapi().getSelectedItem() + m_sapi_new.id_pakan + ",now()");
                        view.getTableSapi().setModel(model2.getTableLaporan());
                    } else if (hasil > 100) {
                        view.getSaran().setText("sapi stress \n"
                                + "    pertumbuhan bobot sapi menurun selama 1 bulan sebesar = " + (pertumbuhan1 * 30) + " KG\n"
                                + "    kombinasi pakan, vaksin & vitamin melebihi batas maksimum sehingga mengakibatkan pertumbuhan sapi menurun drastis dan mengganggu kesehatan sapi.\n"
                                + "    pilih jenis pakan, vitamin, & vaksin yang sesuai sehingga pertumbuhan sapi meningkat tiap bulannya");
                        model2.update2("'" + saran4 + "'", (String) view.getNomorSapi().getSelectedItem());
                        model2.idpakan((String) view.getCbPakan1().getSelectedItem());
                        model2.save4("NULL, " + (String) view.getNomorSapi().getSelectedItem() + m_sapi_new.id_pakan + ",now()");
                        view.getTableSapi().setModel(model2.getTableLaporan());
                    }

                } catch (SQLException ex) {
                    System.out.println("ERROR");
                }
                view.erase();
            }

        }
    }

}

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
            float bahan_kering = (float) (0.03 * Float.valueOf(view.getBeratSapi().getText()));
            float p_konsentrat = (float) (0.14 * bahan_kering);
            float hijauan = (float) (0.2 * bahan_kering); //20% * 3 = 20 : 20 : 20 (makanan)
            float konsentrat_30 = (float) (0.3 * bahan_kering);//10% * 3 = 10 : 10 : 10 (vitamin)
            float konsentrat = (float) (0.1 * bahan_kering);//10% * 3 = 10 : 10 : 10 (vitamin)
            float vaksin = (float) (0.1 * bahan_kering);//10% vaksin

            try {

                //pakan
                model2.makanan((String) view.getCbPakan1().getSelectedItem());
                String bk_pakan1 = m_sapi_new.getBk();
                String pk_pakan1 = m_sapi_new.getPk();
                float pk_makanan1 = (Float.valueOf(pk_pakan1) / 100) * hijauan;

                model2.makanan((String) view.getCbPakan2().getSelectedItem());
                String bk_pakan2 = m_sapi_new.getBk();
                String pk_pakan2 = m_sapi_new.getPk();
                float pk_makanan2 = (Float.valueOf(pk_pakan2) / 100) * hijauan;

                model2.makanan((String) view.getCbPakan3().getSelectedItem());
                String bk_pakan3 = m_sapi_new.getBk();
                String pk_pakan3 = m_sapi_new.getPk();
                float pk_makanan3 = (Float.valueOf(pk_pakan3) / 100) * hijauan;

                // end of pakan
                // vitamin
                model2.makanan((String) view.getCbVitamin().getSelectedItem());
                String bk_vitamin1 = m_sapi_new.getBk();
                String pk_vitamin1 = m_sapi_new.getPk();
                float pk_vita1 = (Float.valueOf(pk_vitamin1) / 100) * konsentrat;

                model2.makanan((String) view.getCbVitamin1().getSelectedItem());
                String bk_vitamin2 = m_sapi_new.getBk();
                String pk_vitamin2 = m_sapi_new.getPk();
                float pk_vita2 = (Float.valueOf(pk_vitamin2) / 100) * konsentrat;

                model2.makanan((String) view.getCbVitamin2().getSelectedItem());
                String bk_vitamin3 = m_sapi_new.getBk();
                String pk_vitamin3 = m_sapi_new.getPk();
                float pk_vita3 = (Float.valueOf(pk_vitamin3) / 100) * konsentrat;

                model2.makanan((String) view.getCbVitamin2().getSelectedItem());
                String bk_vaksin = m_sapi_new.getBk();
                String pk_vaksin = m_sapi_new.getPk();
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

                System.out.println("KOndisi 1 = " + kondisi1);
                System.out.println("KOndisi 2 = " + kondisi2);
                System.out.println("KOndisi 3 = " + kondisi3);
                System.out.println("KOndisi 4 = " + kondisi4);
                System.out.println("KOndisi 5 = " + kondisi5);

                if (hasil < 150) {
                    hasil = kondisi1;
                } else if (hasil > 150 && hasil < 300) {
                    hasil = kondisi2;
                } else if (hasil > 300 && hasil < 400) {
                    hasil = kondisi3;
                } else if (hasil > 400 && hasil < 550) {
                    hasil = kondisi4;
                } else {
                    hasil = kondisi5;
                }

                view.getSaran().setText("Persentase Atas = " + persentaseA + " Persentase Bawah = " + permisalanB + " Hasil Tanpa Random : " + hasilSebelum + " Hasilnya : " + hasil);

            } catch (SQLException ex) {
                Logger.getLogger(c_laporan_new.class.getName()).log(Level.SEVERE, null, ex);
            }

            view.erase();
        }
    }

}

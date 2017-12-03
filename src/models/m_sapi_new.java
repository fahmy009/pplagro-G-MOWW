/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * koneksi kon;
 *
 * public m_sapi() throws SQLException {
 *
 * @author Muhammad Fahmy
 */
public class m_sapi_new extends modelInheritance {

    koneksi kon;
    public static String coba;
    public static double berat;
    public static String umur;
    public static String jenis;
    public static String bk1;
    public static String pk1;
    public static String bk2;
    public static String pk2;
    public static String bk3;
    public static String pk3;
    public static double h;

    public m_sapi_new() throws SQLException {
        super();
        kon = new koneksi("root", "", "pplagro");
    }

    @Override
    public boolean delete(String query) throws SQLException {
        String queries = "DELETE FROM sapi WHERE id_sapi=" + query;
        return super.delete(queries); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(String query) throws SQLException {
        String queries = "INSERT INTO sapi VALUES (" + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean save2(String query) throws SQLException {
        String queries = "INSERT INTO validasi VALUES (" + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(String query, String id) throws SQLException {
        String queries = "UPDATE sapi SET berat_sapi=" + query + " WHERE id_sapi=" + id;
        return super.update(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public DefaultTableModel getTable() throws SQLException {
        String header[] = {"Nomor Sapi", "Jenis Sapi", "Berat Sapi", "Umur Sapi", "Nomor Kandang"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("SELECT s.id_sapi, j.jenis_sapi, s.berat_sapi,s.umur, k.id_kandang FROM sapi s join kandang k on s.id_kandang=k.id_kandang join jenis_sapi j on s.id_jenis_sapi = j.id_jenis_sapi");
        for (int i = tabelModel.getRowCount() - 1; i >= 0; i--) {
            tabelModel.removeRow(i);
        }
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }

            tabelModel.addRow(kolom);
        }
        return tabelModel;
    }

    public String[] nomorSapi() throws SQLException {
        String query = "SELECT * FROM sapi";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("id_sapi");
            a++;
        }
        a = 0;
        return tahun;
    }

    public String[] nomorJenis() throws SQLException {
        String query = "SELECT * FROM jenis_sapi";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("jenis_sapi");
            a++;
        }
        a = 0;
        return tahun;
    }

    public String jenis(String id) throws SQLException {
        String query = "SELECT * FROM sapi s join jenis_sapi j on s.id_jenis_sapi=j.id_jenis_sapi WHERE s.id_sapi='" + id + "'";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            jenis = rs.getString("j.jenis_sapi");
        }
        return jenis;
    }

    public String coba(String id) throws SQLException {
        String query = "SELECT * FROM sapi WHERE id_sapi=" + id;
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            coba = rs.getString("id_sapi");
            berat = rs.getDouble("berat_sapi");
            umur = rs.getString("umur");
        }
        return coba;
    }

    public void makanan(String id) throws SQLException {
        String query = "SELECT * FROM nama_makanan WHERE nama_makanan='" + id + "'";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            bk1 = rs.getString("persentase_BK");
            pk1 = rs.getString("persentase_PK");
        }
    }

    public double harga(String nama) throws SQLException {
        String query = "SELECT harga FROM nama_makanan WHERE nama_makanan='" + nama + "'";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            h = rs.getDouble("harga");
        }
        return h;
    }

    public static String getBk() {
        return bk1;
    }

    public static String getPk() {
        return pk1;
    }

    public String umur(String id) throws SQLException {
        String query = "SELECT * FROM sapi WHERE id_sapi='" + id + "'";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            umur = rs.getString("umur");
        }
        return umur;
    }

    public double berat(String id) throws SQLException {
        String query = "SELECT * FROM sapi WHERE id_sapi='" + id + "'";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            berat = rs.getDouble("berat_sapi");
            umur = rs.getString("umur");
        }
        return berat;
    }

    public String[] kandang() throws SQLException {
        String query = "SELECT * FROM kandang";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("id_kandang");
            a++;
        }
        a = 0;
        return tahun;
    }

    public String[] pakan() throws SQLException {
        String query = "SELECT * FROM makanan m join jenis_makanan j ON m.id_jenis=j.id_jenis JOIN nama_makanan n ON m.id_nama_makanan=n.id_nama_makanan";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("n.nama_makanan");
            a++;
        }
        a = 0;
        return tahun;
    }

    public String[] vitamin() throws SQLException {
        String query = "SELECT * FROM makanan m join jenis_makanan j ON m.id_jenis=j.id_jenis JOIN nama_makanan n ON m.id_nama_makanan=n.id_nama_makanan where j.jenis='vitamin'";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("n.nama_makanan");
            a++;
        }
        a = 0;
        return tahun;
    }

    public String[] vaksin() throws SQLException {
        String query = "SELECT * FROM makanan m join jenis_makanan j ON m.id_jenis=j.id_jenis JOIN nama_makanan n ON m.id_nama_makanan=n.id_nama_makanan where j.jenis='vaksin'";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("n.nama_makanan");
            a++;
        }
        a = 0;
        return tahun;
    }

    public boolean save3(String query) throws SQLException {
        String queries = "INSERT INTO jenis_sapi VALUES (" + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete3(String query) throws SQLException {
        String queries = "DELETE FROM jenis_sapi where id_jenis_sapi=" + query;
        return super.delete(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public DefaultTableModel getTable3() throws SQLException {
        String header[] = {"Id Jenis Sapi", "Jenis Sapi"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("select * from jenis_sapi");
        for (int i = tabelModel.getRowCount() - 1; i >= 0; i--) {
            tabelModel.removeRow(i);
        }
        while (rs.next()) {
            String kolom[] = new String[2];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }

            tabelModel.addRow(kolom);
        }
        return tabelModel;
    }

    public DefaultTableModel getTableLaporan() throws SQLException {
        String header[] = {"Nomor Sapi", "Jenis Sapi", "Umur Sapi", "Berat Sapi", "Saran"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("select s.id_sapi, j.jenis_sapi, s.umur, s.berat_sapi, s.saran from sapi s join jenis_sapi j on s.id_jenis_sapi=j.id_jenis_sapi");
        for (int i = tabelModel.getRowCount() - 1; i >= 0; i--) {
            tabelModel.removeRow(i);
        }
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }

            tabelModel.addRow(kolom);
        }
        return tabelModel;
    }

    public boolean update2(String query, String id) throws SQLException {
        String queries = "UPDATE sapi SET saran=" + query + ", id_validasi=3 WHERE id_sapi=" + id;
        return super.update(queries); //To change body of generated methods, choose Tools | Templates.
    }
    
     public DefaultTableModel getTableRangking() throws SQLException {
        String header[] = {"Nomor Sapi", "Jenis Sapi", "Umur Sapi", "Berat Sapi", "Rangking"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        kon.execute("SET @rank=0;");
        ResultSet rs = kon.getResult("SELECT s.id_sapi, j.jenis_sapi, s.umur, s.berat_sapi, @rank:=@rank+1 FROM sapi s join jenis_sapi j on s.id_jenis_sapi=j.id_jenis_sapi ORDER BY berat_sapi DESC");
        for (int i = tabelModel.getRowCount() - 1; i >= 0; i--) {
            tabelModel.removeRow(i);
        }
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }

            tabelModel.addRow(kolom);
        }
        return tabelModel;
    }
}

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
 * @author Muhammad Fahmy
 */
public class m_makanan extends modelInheritance {

    private koneksi kon;

    public m_makanan() throws SQLException {
        super();
        kon = new koneksi("root", "", "pplagro");
    }

    public String[] jenisMakanan() throws SQLException {
        String query = "SELECT * FROM jenis_makanan";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("jenis");
            a++;
        }
        a = 0;
        return tahun;
    }

    public String[] namaMakanan() throws SQLException {
        String query = "SELECT * FROM nama_makanan";
        ResultSet rs = kon.getResult(query);
        rs.last();
        String tahun[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            tahun[a] = rs.getString("nama_makanan");
            a++;
        }
        a = 0;
        return tahun;
    }

    @Override
    public boolean delete(String query) throws SQLException {
        String queries = "DELETE FROM makanan WHERE id_makanan=" + query;
        return super.delete(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete2(String query) throws SQLException {
        String queries = "DELETE FROM nama_makanan WHERE id_makanan=" + query;
        return super.delete(queries); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(String query) throws SQLException {
        String queries = "INSERT INTO makanan (id_makanan, id_jenis, id_nama_makanan) VALUES (" + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean save2(String query) throws SQLException {
        String queries = "INSERT INTO nama_makanan VALUES (" + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(String query) throws SQLException {
        String queries = "UPDATE nama_makanan SET " + query;
        return super.update(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public DefaultTableModel getTable() throws SQLException {
        String header[] = {"Id Makanan", "Jenis Makanan", "Nama Makanan"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("SELECT m.id_makanan, jm.jenis, nm.nama_makanan from makanan m join jenis_makanan jm on m.id_jenis = jm.id_jenis join nama_makanan nm on m.id_nama_makanan = nm.id_nama_makanan");
        for (int i = tabelModel.getRowCount() - 1; i >= 0; i--) {
            tabelModel.removeRow(i);
        }
        while (rs.next()) {
            String kolom[] = new String[3];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }

            tabelModel.addRow(kolom);
        }
        return tabelModel;
    }

    public DefaultTableModel getTable2() throws SQLException {
        String header[] = {"Id Makanan", "Nama Makanan", "Persentase BK", "Persentase PK", "Persentase TDN", "Harga"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("SELECT * FROM nama_makanan");
        for (int i = tabelModel.getRowCount() - 1; i >= 0; i--) {
            tabelModel.removeRow(i);
        }
        while (rs.next()) {
            String kolom[] = new String[6];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }

            tabelModel.addRow(kolom);
        }
        return tabelModel;
    }
}

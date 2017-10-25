/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Fahmy
 */
public class m_kandang extends modelInheritance {

    private koneksi kon;
    public static int id;
    Connection coon;

    public m_kandang() throws SQLException {
        super();
        this.kon = new koneksi("root", "", "pplagro");
    }

    public DefaultTableModel getTable() throws SQLException {
        String header[] = {"Nomor Kandang", "Kapasitas Kandang"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("SELECT * from kandang");
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
//

    public int id() throws SQLException {
        String sql = "SELECT * FROM kandang";
        Statement st = coon.createStatement();
        ResultSet res = st.executeQuery(sql);
        res.next();
        id = res.getInt("id_kandang");
        return id;
    }

    @Override
    public boolean delete(String query) throws SQLException {
        String queries = "DELETE FROM kandang WHERE id_kandang=" + query;
        return super.delete(queries); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(String query) throws SQLException {
        String queries = "INSERT INTO kandang (id_kandang, nomor_kandang, kapasitas_kandang) VALUES (NULL, " + query + ")";
        return super.save(queries); //To change body of generated methods, choose Tools | Templates.
    }
}

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
public class m_validasi extends modelInheritance {

    koneksi kon;

    public m_validasi() throws SQLException {
        super();
        kon = new koneksi("root", "", "pplagro");
    }

    public boolean update(String id_valid, String id_sapi) throws SQLException {
        String queries = "UPDATE sapi SET id_validasi=" + id_valid + " where id_sapi=" + id_sapi;
        return super.update(queries); //To change body of generated methods, choose Tools | Templates.
    }

    public DefaultTableModel getTable() throws SQLException {
        String header[] = {"Nomor Sapi", "Validasi", "Saran"};
        DefaultTableModel tabelModel = new DefaultTableModel(null, header);
        ResultSet rs = kon.getResult("SELECT s.id_sapi, v.validasi, s.saran from sapi s join validasi v on s.id_validasi=v.id_validasi");
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

}

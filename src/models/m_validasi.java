/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.SQLException;

/**
 *
 * @author Muhammad Fahmy
 */
public class m_validasi extends modelInheritance{
    
    koneksi kon;

    public m_validasi() throws SQLException {
        super();
        kon = new koneksi("root", "", "pplagro");
    }

    @Override
    public boolean update(String query) throws SQLException {
        String queries = "UPDATE ";
        return super.update(queries); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

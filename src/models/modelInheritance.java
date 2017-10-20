/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.SQLException;

/**
 *
 * @author ANGGAA
 */
public class modelInheritance {

    private koneksi kon;

    public modelInheritance() throws SQLException {
        this.kon = new koneksi("root", "", "pplagro");
    }

    public boolean save(String query) throws SQLException {
        try {
            kon.execute(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(String query) throws SQLException {
        try {
            kon.execute(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(String query) throws SQLException {
        try {
            kon.execute(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

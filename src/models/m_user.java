/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Muhammad Fahmy
 */
public class m_user {

    public static String status;
    public static String username;
    public String level_user = "";
    private koneksi kon;

    public m_user() throws SQLException {
        kon = new koneksi("root", "", "pplagro");
    }

    public void Login(String user, String pass) throws SQLException {
        String query = "select * from user where username = '" + user + "' and password = '" + pass + "'";
        ResultSet rs = kon.getResult(query);
        if (rs.next()) {
            level_user = rs.getString("level");
        }
    }

    public String getStatusUser() {
        return level_user;
    }
}

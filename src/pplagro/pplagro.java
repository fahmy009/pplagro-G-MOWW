/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplagro;

import java.sql.SQLException;
import controllers.*;
import models.*;
import views.*;

/**
 *
 * @author Muhammad Fahmy
 */
public class pplagro {

    public static void main(String[] args) throws SQLException {
//        c_user a = new c_user(new v_LOGIN(), new m_user());
        c_menu a = new c_menu(new v_MENU());
//        c_hitung a = new c_hitung(new v_PENGHITUNG(), new m_sapi());
//        c_makanan a = new c_makanan(new v_MAKANAN(), new m_makanan());
//        c_kandang a = new c_kandang(new v_KANDANG(), new m_kandang());
//          c_admin a = new c_admin(new v_ADMIN());
//        c_sapi a = new c_sapi(new v_ADMINSAPI(), new m_sapi());
    }
}

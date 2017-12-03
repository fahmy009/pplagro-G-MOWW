/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import models.m_sapi_new;
import views.v_PETERNAK;
import views.v_rangking;

/**
 *
 * @author Muhammad Fahmy
 */
public class c_rangking {
    
    v_rangking view;
    m_sapi_new model;

    public c_rangking(v_rangking view, m_sapi_new model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.getRangking().setModel(model.getTableRangking());
        view.btnKembali(new btnKembali());
    }

    private class btnKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_peternak a = new c_peternak(new v_PETERNAK());
            view.dispose();
        }

    }
    
    
}

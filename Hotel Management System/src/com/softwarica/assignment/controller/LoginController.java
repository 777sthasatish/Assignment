/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwarica.assignment.controller;

import com.softwarica.assignment.model.Login;
import com.softwarica.assignment.util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Satish
 */
public class LoginController {

    private DBConnection conn=new DBConnection();

    public Login login(String username, String password) throws ClassNotFoundException, SQLException {
        for (Login l : getAll()) {
            if (l.getUserName().equals(username) && l.getPassword().equals(password)) {
                return l;
            }
        }
        return null;
    }

    public List<Login> getAll() throws ClassNotFoundException, SQLException {
        List<Login> loginList = new ArrayList<>();
        conn.open();
        String sql = "SELECT * FROM log";
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Login login = new Login(); 
            login.setLoginId(rs.getInt("id"));
            login.setUserName(rs.getString("username"));
            login.setPassword(rs.getString("password"));
            loginList.add(login);
        }
        conn.close();
        return loginList;
    }
}

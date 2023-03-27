/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implement;

import Connection.ConnectDB;
import MODEL.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author shintadl
 */
public class Login implements Loginable {
    Connection connection;
    final String queryUser = "SELECT EXISTS(SELECT * from user WHERE user.username = ? AND user.password = ?)";
    
    public Login() {
        this.connection = ConnectDB.getCon();
    }
    
    @Override
    public int auth(String username, String password) {
        int result = 0;
        try {
            PreparedStatement st = connection.prepareStatement(queryUser);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                result = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = 0;  
        }
        return result;
    }

    

}

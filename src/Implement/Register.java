/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implement;
import Connection.ConnectDB;
import VIEW.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shintadl
 */
public class Register implements Registerable {
    Connection connection;
    private int autoid = 1;
    final String sql = "INSERT INTO user (id, username, name, password) VALUES (?,?,?,?)";
    
    public Register() {
        this.connection = ConnectDB.getCon();
    }
    
    public int doRegister(int autoid, String user, String name, String pass) {
        int result = 0;
        
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, autoid);
            st.setString(2, user);
            st.setString(3, name);
            st.setString(4, pass);
            st.executeUpdate();
            result = 1;
            st.close();
            
            
            
        }catch (SQLException e) {
            e.printStackTrace();
            result = 0;
        } 
        
        if (result == 1) {
            Login a = new Login();
            new LoginForm().setVisible(true);
        }
        this.autoid = autoid++;
        return result;
    }
    
    
}

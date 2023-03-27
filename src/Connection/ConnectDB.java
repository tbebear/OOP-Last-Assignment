/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author shintadl
 */
public class ConnectDB {
    
    private static java.sql.Connection con;
    
    public static Connection getCon() {
        
        // declare database
        // database set database name
        // database set port
        // database set password
        if (con==null){
            try {
                String url = "jdbc:mysql://localhost:3306/MyRecipe_db";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Connected Successfully");
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return con;
    }
    
    /*public static void main(String[] args) {
        getCon();
    }*/
}

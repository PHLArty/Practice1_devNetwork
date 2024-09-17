package thuchanh1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arty
 */
import java.sql.*;
import javax.swing.*;

public class MyConnection {
    public Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //new instance
            String URL = "jdbc:sqlserver://localhost:1433;Database=quanlytaikhoan;user=long;password=long123;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(URL);
            return con;
               
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

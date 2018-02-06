   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.mahasiswa;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Connect_DataBase {
    private static Connection  MySQL_Mhs;
    public static Connection Mhs()throws SQLException{
        try{
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/java"; //url database
            String user = "root"; // user database
            String pass = ""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQL_Mhs = DriverManager.getConnection(url, user ,pass);
            
        }catch(Exception e){
            System.err.println("Koneksi Gagal "+e.getMessage()); //perintah menampilkan  error pada koneksi
        }
        return MySQL_Mhs;
    }
}

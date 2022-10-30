/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubessmt4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TubesSMT4 {
    private static Connection koneksi;
    public static Connection configDB(){
        if(koneksi==null){
            try{
                String url;
                url = "jdbc:mysql://localhost:3306/hospital";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi =DriverManager.getConnection(url,username,password);
            }catch(SQLException t){
                JOptionPane.showMessageDialog(null, "error koneksi");
            }
        }return koneksi;
         
        
    }
    static Object getConnection(){
            throw new UnsupportedOperationException("not yet implemented");
    }

    public static Connection getKoneksi(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
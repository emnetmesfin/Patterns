/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbcconnection {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
        if(con!=null){
            System.out.println("Connection established");
            }
        con.close();
    }
    
}

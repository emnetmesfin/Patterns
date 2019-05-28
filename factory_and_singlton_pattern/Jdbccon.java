/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Student
 */
public class Jdbccon {
    private Connection con;
    private Statement st;
    public Jdbccon(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exc","root","root");
        st = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){System.out.println("Error");
    }
}
public void insertdata(){
try{
    String query = "insert into ex1 values(12,'15',15)";
    st.executeUpdate(query);
    System.out.println("Insertion is successful");
}
catch(Exception e){
    System.out.println(e);

}
}
}

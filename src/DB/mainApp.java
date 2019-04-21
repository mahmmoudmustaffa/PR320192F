/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author aashgar
 */
public class mainApp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection aConnection = DriverManager.
                 getConnection("jdbc:mysql://localhost:3306/university",
                         "root", "root");
            Statement aStatement = aConnection.
                    createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            aStatement.setFetchSize(Integer.MIN_VALUE);
            ResultSet rs = aStatement.executeQuery("Select *From students");
           while(rs.next()){
               double gr = rs.getDouble("grade");
               rs.updateDouble("grade", gr + 1 );
               rs.updateRow();
               System.out.println(rs.getString("name")+ " - "+
                       rs.getString("major") + " - "+
                       rs.getDouble("grade"));
           }
           
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fidel.villero
 */
public class Connect {
    public Connection cnx = null;
    
    public Connection getConnection() throws ClassNotFoundException{
       Class.forName("com.mysql.jdbc.Driver");
       try {
           cnx = DriverManager.getConnection("jdbc:mysql://localhost/actualizar_datos_tcc", "root", "tccmysql$b0x!");
           //cnx = DriverManager.getConnection("jdbc:mysql://localhost/actualizar_datos_cuenta_empresarial", "root", "tccmysql$b0x!");
       } catch(SQLException ex) {
           System.out.println();
       }
       return cnx;
   }

   public void closeConnection(){
       try{
           getConnection().close();
       }catch(Exception er){  }
   }
}

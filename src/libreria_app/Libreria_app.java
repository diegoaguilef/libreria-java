/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_app;
import java.sql.ResultSet;
import libreria_app.db.DataHandler;


/**
 *
 * @author alumnossur
 */
public class Libreria_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      /*
      DataHandler datahandler = new DataHandler();
        ResultSet rset = datahandler.getClients();
        while (rset.next()) {
        System.out.println(rset.getInt(1) + " " +
          rset.getString(2) + " " + 
          rset.getString(3) + " " + 
          rset.getString(4));
        }
        */
      new LibreriaFrame().setVisible(true);
    }
    
}

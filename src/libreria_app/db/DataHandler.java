/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_app.db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import libreria_app.User;
import oracle.jdbc.pool.OracleDataSource;
import oracle.net.aso.e;
/**
 *
 * @author kdieg
 */
public class DataHandler {
    public DataHandler() {
    }
    
    private String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    private String userid = "ruby";
    private String password = "ruby"; 
    private Connection conn;
    
    private Collection<Connection> users;
    
    public void getDBConnection() throws SQLException{
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        conn = ds.getConnection(userid, password);
    }
    
    public ResultSet getClients() throws SQLException{
        Statement stmt;
        ResultSet rset;
        String query;
        String sqlString;
        getDBConnection();
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        query = "SELECT * FROM clientes ORDER BY nombre";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
        
        return rset;
    }
}

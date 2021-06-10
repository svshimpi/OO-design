package srp.database;
import java.sql.*;

public class DatabaseConnectionManager {

    private Connection conn;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
    private DatabaseConnectionManager(){

    }
    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;

    }
    public void connect() throws SQLException {
        conn = DriverManager.getConnection("/dburl");
        System.out.println("Established DB connection....");
    }

    public Connection getConnectionObject(){
        return conn;

    }

    public void disconnect() throws SQLException {
        conn.close();
    }
}

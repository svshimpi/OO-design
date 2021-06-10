package srp.domainDAO;
import srp.database.DatabaseConnectionManager;
import srp.domain.Employee;

import java.sql.*;

public class EmployeeDAO {
    public void saveEmployee(Employee emp) throws SQLException {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        connectionManager.connect();
        connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
        connectionManager.disconnect();
        System.out.println("Saved Employee in DB ");

    }

    public void deleteEmployee(Employee emp) throws SQLException {

        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        connectionManager.connect();
        connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
        connectionManager.disconnect();
        System.out.println("Delete  Employee from DB ");

    }
}

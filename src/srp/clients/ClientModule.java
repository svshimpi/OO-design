package srp.clients;

import srp.domain.Employee;
import srp.domainDAO.EmployeeDAO;
import srp.reporting.EmployeeReportFormatter;
import srp.reporting.FormatType;

import java.sql.SQLException;

public class ClientModule {

    //testing -- can make improvements here for SRP


    public static void main(String args[])  {
        Employee emp1 = new Employee(1,"Tim","Engineering",true);
        ClientModule.hireNewEmployee(emp1);

    }
    public static void hireNewEmployee(Employee emp)  {
        EmployeeDAO employeedao = new EmployeeDAO();
        try {
            employeedao.saveEmployee(emp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Hiring process complete");

    }

    public static void terminateEmployee(Employee emp)  {
        EmployeeDAO employeedao = new EmployeeDAO();
        try {
            employeedao.deleteEmployee(emp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Employee terminated ");
    }

    public  static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee,formatType);
        formatter.getFormattedEmployee();
        System.out.println("Report printed.. ");
    }
}

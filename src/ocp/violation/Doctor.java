package ocp.violation;

import ocp.violation.Employee;

public class Doctor extends Employee {
    public Doctor(int employee_id, String employee_name, String department, boolean is_working) {
        super(employee_id, employee_name, department, is_working);
    }
}

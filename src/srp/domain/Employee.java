package srp.domain;

public class Employee {
    private int employee_id;
    private String employee_name;
    private String department;
    private boolean is_working;

    public Employee(int employee_id, String employee_name, String department, boolean is_working) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.department = department;
        this.is_working = is_working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", department='" + department + '\'' +
                ", is_working=" + is_working +
                '}';
    }
}

package ocp.violation;

public class Nurse extends Employee {
    public Nurse(int employee_id, String employee_name, String department, boolean is_working) {
        super(employee_id, employee_name, department, is_working);
        System.out.println("Nurse... ");
    }
}

package ocp.solution;

import ocp.solution.Employee;

public class Doctor extends Employee {
    public Doctor(int employee_id, String employee_name, String department, boolean is_working) {
        super(employee_id, employee_name, department, is_working);
    }
    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }
    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }

    @Override
    public void performDuties(){
        prescribeMedicine();
        diagnosePatients();

    }
}

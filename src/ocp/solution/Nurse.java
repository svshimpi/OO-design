package ocp.solution;

import ocp.solution.Employee;

public class Nurse extends Employee {
    public Nurse(int employee_id, String employee_name, String department, boolean is_working) {
        super(employee_id, employee_name, department, is_working);
        System.out.println("Nurse... ");
    }
    private void checkVitals(){
        System.out.println("Checking vitals ");
    }
    private void drawBlood(){
        System.out.println("drawing blood");
    }
    private void cleanPatientArea(){
        System.out.println("sanitizing patient area");
    }

    @Override
    public void performDuties(){
        checkVitals();
        drawBlood();
        cleanPatientArea();

    }
}

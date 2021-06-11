package ocp.violation;

public class HospitalManagement {

    //All behaviors of Hospital staff in one place
    // instanceof conditionals - all information in one place
    //Hence violation of Open Closed Principle - as it is inviting modification if more business requirements added in future
    public void callUpon(Employee employee){
        if(employee instanceof Nurse){
            checkVitals();
            drawBlood();
            cleanPatientArea();
        }
        else if(employee instanceof Doctor){
            prescribeMedicine();
            diagnosePatients();
        }
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

    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }
    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }



}

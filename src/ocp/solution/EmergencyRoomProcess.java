package ocp.solution;


public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();
        Employee emp1 = new Nurse(1,"Cindy","emergency", true);
        ERDirector.callUpon(emp1);
        Employee emp2 = new Doctor(1,"Suzan","emergency", true);
        ERDirector.callUpon(emp2);
    }

}

package lsp;

public class SchoolStaff {
    private void takeAttendance(){
        System.out.println("took attendance");
    }

    private void conductExam(){
        System.out.println("conduct Examination");
    }

    private void collectPaperwork(){
        System.out.println("collect paperwork");
    }

    public void performOtherResponsibilities(){
        takeAttendance();
        conductExam();
        collectPaperwork();

    }
}

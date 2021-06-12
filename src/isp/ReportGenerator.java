package isp;

public class ReportGenerator {
    private Reporting transactionObject;
    public void generateReporting(){
        System.out.println(transactionObject.getName()+" "+transactionObject.getDate() + " "+ transactionObject.productBreakDown());
    }
}

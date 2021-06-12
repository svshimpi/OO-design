package isp;

public class AccountsReceivable {
    private CustomerTransaction transactionObject;

    public AccountsReceivable(CustomerTransaction atransaction) {
        this.transactionObject = atransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }

}

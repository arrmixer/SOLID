package com.AE.ISP;

/**
 * Created by Angel on 6/8/17.
 */
public class AccountsRecievable {
    private Accounting transactionObject;

    public AccountsRecievable(Accounting aTransaction){
        transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }
}

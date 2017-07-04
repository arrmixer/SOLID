package com.AE.ISP;

/**
 * Created by Angel on 6/8/17.
 */
public class ReportGenerator {

    private Reporting transactionObject;

    public void generateReport(){
        System.out.println(transactionObject.getName() + " "
        + transactionObject.getDate() + " " + transactionObject.productBreakDown());
    }
}

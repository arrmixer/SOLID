package com.AE.ISP;

import java.util.Date;
import java.util.List;

/**
 * Created by Angel on 6/8/17.
 */
public class CustomerTransaction implements Accounting, Reporting{

    private List<Product> products;

    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products){
        this.customer = customer;
        this.products = products;
    }



    public String getName(){
        return customer.getName();
    }

    public Date getDate(){
        return new Date();
    }

    public String productBreakDown(){
        String reportListing = null;
        for(Product product : products){
         reportListing += product.getPrductName();
        }


        return reportListing;
    }

    public void prepareInvoice(){
        System.out.println("invoice prepared...");
    }

    public void chargeCustomer(){
        System.out.println("charged the customer");
    }

}

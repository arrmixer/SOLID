package com.AE.CoffeShop.Customers;

/**
 * Created by Angel on 7/6/17.
 */
public interface WaitingCustomer {
    void orderReady(String preparedDrink);
    public String getName();
    public String getDrinkOrdered();
}



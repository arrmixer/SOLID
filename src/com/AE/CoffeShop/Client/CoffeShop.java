package com.AE.CoffeShop.Client;

import com.AE.CoffeShop.Customers.Customer;
import com.AE.CoffeShop.Subject.CoffeeAttendent;

/**
 * Created by Angel on 7/6/17.
 */
public class CoffeShop {
    public static void main(String[] args) {

        Customer robert = new Customer("Robert", "French Vanilla");
        Customer bill = new Customer("Bill", "Hot Coffee");

        CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
        coffeeAttendent.takeOrder(robert);
        coffeeAttendent.takeOrder(bill);

        // prepare drink
        coffeeAttendent.prepareDrink("French Vanilla");
        coffeeAttendent.prepareDrink("Hot Coffee");

        // order up...
        coffeeAttendent.callOutCompletedOrders();
    }
}

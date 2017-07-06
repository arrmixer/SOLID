package com.AE.CoffeShop.Subject;

import com.AE.CoffeShop.Customers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 7/6/17.
 */
public class CoffeeAttendent {
    private List<Customer> customersList;
    private List<String> completedDrinks;


    public CoffeeAttendent(){
        customersList = new ArrayList<>();
        completedDrinks = new ArrayList<>();
    }


    public void orderReady(String preparedDrink) {
        callOutCompletedOrders();
    }

    public void takeOrder(Customer customer){
        customersList.add(customer);
    }

    public void prepareDrink(String drinkToPrepare){
        double timeTaken = Math.random()* 10; // give value between 1 and 50
        try {
            Thread.sleep((long) (timeTaken)*1000);
            completedDrinks.add(drinkToPrepare);
        } catch (InterruptedException e) {
            System.out.println(" for some reason, drink was not prepared..");
        }
    }

    public void callOutCompletedOrders(){
        for (String readyDrink : completedDrinks) {
            System.out.println("Order up: " + readyDrink);
            for (Customer customer : customersList) {
                customer.orderReady(readyDrink);
            }
        }
    }



}

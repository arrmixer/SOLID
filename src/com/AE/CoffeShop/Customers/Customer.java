package com.AE.CoffeShop.Customers;

/**
 * Created by Angel on 7/6/17.
 */
public class Customer implements WaitingCustomer{
    private String name;
    public String drinkOrdered;
    private int customerRank;


    private static int COUNTER = 0;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
        customerRank = ++COUNTER;



    }


    public void orderReady(String completeDrink) {
        if(completeDrink == drinkOrdered){
            System.out.println(getName() + ", your drink is ready. ");
        }else{
            System.out.println("wrong drink sorry");
        }
    }

    public String getName() {
        return name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public int getCustomerRank() {
        return customerRank;
    }
}

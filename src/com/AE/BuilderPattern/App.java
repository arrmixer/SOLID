package com.AE.BuilderPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class App {
    public static void main(String[] args) {
        User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com").firstName("bob").lastName("max").build();

        System.out.println(websiteUser);

        Car lolo = new Car.Builder(12000, "Sedan").make("Nissan").model("Altima").doors(4).color("grey").build();
        System.out.println(lolo);
    }
}

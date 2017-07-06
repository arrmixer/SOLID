package com.AE.BuilderPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class Car {
    private int price;
    private String type;
    private String make;
    private int horsepower;
    private String model;
    private String color;
    private int doors;

    private Car(Builder builder){
        this.price = builder.price;
        this.type = builder.type;
        this.make = builder.make;
        this.horsepower = builder.horsepower;
        this.model = builder.model;
        this.color = builder.color;
        this.doors = builder.doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", horsepower=" + horsepower +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }

    public static class Builder {
        private int price;
        private String type;
        private String make;
        private int horsepower;
        private String model;
        private String color;
        private int doors;

        public Builder(int price, String type) {
            this.price = price;
            this.type = type;
        }

        public Builder make(String value){
            this.make = value;
            return this;
        }

        public Builder horsepower(int value){
            this.horsepower = value;
            return this;
        }

        public Builder model(String value){
            this.model = value;
            return this;
        }

        public Builder color(String value){
            this.color = value;
            return this;
        }

        public Builder doors(int value){
            this.doors = value;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }

}

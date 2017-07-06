package com.AE.BuilderPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class User {
    private String userName; //Required
    private String emailAddress; //Required

    private String firstname; // Optional
    private String lastname; // Optional
    private int phoneNumber; // Optional
    private String address; // Optional

    private User(Builder builder){
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private String userName; //Required
        private String emailAddress; //Required

        private String firstname; // Optional
        private String lastname; // Optional
        private int phoneNumber; // Optional
        private String address; // Optional

        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String value){
            this.firstname = value;
            return this;
        }

        public Builder lastName(String value){
            this.lastname = value;
            return this;
        }

        public Builder phoneNumber(String value){
            this.address = value;
            return this;
        }

        public Builder address(int value){
            this.phoneNumber = value;
            return this;
        }



        public User build(){
            return new User(this);
        }

    }
}

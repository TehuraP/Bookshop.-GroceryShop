package com.company;

public class Main {

    public static void main(String[] args) {
        // on the bus you receive a discount if you are a senior citizen, a dog or a student

        boolean isDog = false;
        boolean isSenior = true;
        boolean isStudent = true;
        double ticketPrice = 2.5;
        double discount = getBusDiscount ( ticketPrice, isDog, isSenior, isStudent);




        System.out.println("I saved " + discount + " € for my " + ticketPrice + " € ticket");



        }
public static double getBusDiscount (double ticketPrice, boolean isDog, boolean isSenior, boolean isStudent) {
    double discount;

        if (isDog) {
        discount = ticketPrice - ticketPrice * 0.2;
    } else if (isSenior) {
        discount = ticketPrice * 0.15;
    } else if (isStudent) {
        discount = ticketPrice * 0.1;
    } else {
        discount = 0;

    }
        return discount;
}
     }








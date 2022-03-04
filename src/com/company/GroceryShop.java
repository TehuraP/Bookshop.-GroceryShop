package com.company;

public class GroceryShop {
    public static void main(String[] args) {
        int alkidrink = 0;
        int nonalkidrink = 2;
        boolean discount;

        if (nonalkidrink >= 1 && alkidrink == 0) {
            discount = true;
        } else {
            discount = false;

        }
        System.out.println(discount);
    }
}

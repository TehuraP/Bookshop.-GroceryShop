package com.company;

public class Bookshop {
    public static void main(String[] args) {
        int nonFictionBooks = 3;
        int fictionBooks = 1;
        boolean discount;

        if (nonFictionBooks > 2 && fictionBooks >= 1) {
            discount = true;
        } else {
            discount = false;
        }
        System.out.println(discount);
    }
}

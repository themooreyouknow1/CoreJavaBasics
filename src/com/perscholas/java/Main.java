package com.perscholas.java;

public class Main {
    public static void main(String[] args) {
        int score1 = 5;
        int score2 = 10;
        int total1 = (score1 + score2);
        System.out.println("Total score: " + total1);

        double score3 = 5.2;
        double score4 = 5.3;
        double total2 = (score3 + score4);
        System.out.println("Total score: " + total2);

        int score5 = 10;
        double score6 = 5.7;
        double total3 = (score5 + score6);
        System.out.println("Total score: " + total3); //sum must be double

        int score7 = 10;
        int score8 = 3;
        int total4 = (score7 / score8);
        System.out.println("Total score: " + total4); //dividing larger into smaller results to "0"

        double score9 = 5.9;
        double score10 = 5.8;
        double total5 = (score9 / score10);
        System.out.println("Total score: " + total5); // with int, incompatible types

        int x = 5;
        int y = 6;
        double q = (y/x);
        System.out.println(q);

        final double PI = 3.14;
        double total6 = (5 + PI);
        System.out.println("Total: " + total6);

        cafe();


    }
    public static void cafe() {
        double coffee = 3.99;
        double tea = 2.99;
        double milk = 1.99;

        double subtotal = (coffee * 3) + (tea * 4) + (milk * 2);
        final double SALES_TAX = 3.10;
        double totalSale = subtotal + SALES_TAX;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total: $" + totalSale);
    }
}
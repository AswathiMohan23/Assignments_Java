package com.java.operators;

import java.util.Scanner;
//4. Write a program Distance.java that takes two integer command-line arguments x and y
// and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
// The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

public class EuclidienDistance{
    public static void main(String[] args) {
        System.out.println("enter the value of X co-ordinate : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("enter the value of Y co-ordinate : ");
        int y = sc.nextInt();
        double distance = Math.sqrt((x*x)+(y*y));
        System.out.println("Euclidean distance  : "+distance);

    }
}
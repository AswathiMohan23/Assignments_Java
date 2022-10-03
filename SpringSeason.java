package com.java.operators;

// 2. Write a program SpringSeason.java that takes two int values m and d
// from the command line and prints true if day d of month m is between
// March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        System.out.println("Enter the day in numbers : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println("Enter the month in numbers : ");
        int month = sc.nextInt();
        if ((month == 3) && ((day >= 20) && (day <= 31)))
            System.out.println("True : March and its Spring season");
        else if ((month==4)&&((day>=1)&&(day<=30)))
            System.out.println("True : April and its Spring Season");
        else if ((month==5)&&((day>=1)&&(day<=31)))
            System.out.println("True : May and its Spring Season");
        else if ((month==6)&&((day>=1)&&(day<=20)))
            System.out.println("True : June and Spring Season");
        else
            System.out.println("False : Either its not Spring Season or its a wrong entry check and try again !!!");
    }
}
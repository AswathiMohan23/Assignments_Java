package com.java.switchcase;

import java.util.Scanner;

public class MonthName_For_GivenNumber{
    public static void main(String[] args){
        System.out.println("Enter any number corresponding to a month  : ");
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch(month){
            case 1:
                System.out.println("month is january");
                break;
            case 2:
                System.out.println("month is february");
                break;
            case 3:
                System.out.println("month is march");
                break;
            case 4:
                System.out.println("month is april");
                break;
            case 5:
                System.out.println("month is may");
                break;
            case 6:
                System.out.println("month is june");
                break;
            case 7:
                System.out.println("month is July");
                break;
            case 8:
                System.out.println("month is August");
                break;
            case 9:
                System.out.println("month is September");
                break;
            case 10:
                System.out.println("month is October");
                break;
            case 11:
                System.out.println("month is November");
                break;
            case 12:
                System.out.println("month is December");
                break;
            default:
                System.out.println("invalid number !!!! there are only 12 months ...try again");
                break;
        }
    }
}

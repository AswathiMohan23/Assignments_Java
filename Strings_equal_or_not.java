package com.java;

import java.util.Scanner;

public class Strings_equal_or_not {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");

        String string1 = sc.next();
        System.out.println("enter the 2nd string");
        String string2= sc.next();

        boolean result = string2.equals(string1);
        if(result==true)
            System.out.println("strings are equal");
        else
            System.out.println("Different strings");


    }
}

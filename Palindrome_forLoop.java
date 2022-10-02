package com.java.forLoops;

// 3. Write a Program to find Palindrome Number
//    =========================================
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123
// then it is not a palindrome number.

import java.util.Scanner;

public class Palindrome_forLoop {
    public static void main(String[] args){
        System.out.println("Enter the integer : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int actualNumber=number;
        int reverse = 0, i,reminder = 0;
        for (i=0; number!=0;i++) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println("Reversed no = " + reverse);
        if(actualNumber==reverse)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");




    }
}

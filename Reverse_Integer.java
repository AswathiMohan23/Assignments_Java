package com.java.whileLoops;

// 2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132

import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args) {
        System.out.println("Enter the integer : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0, reminder = 0;                  //eg: number = 123
        while (number != 0) {                        //first iteration==> number=123
            reminder = number % 10;                  //reminder=(number%10)= 123%10 = 3
            reverse = reverse * 10 + reminder;         //reverse=0*10+3=3 (in first iteration reverse =0)
            number = number / 10;                    //number=123/10=12
        }
        System.out.println("Reversed no = " + reverse);// second iteration==> number =12
    }                                                //reminder= 12%10 =2
}                                                   //reverse=3*10+2=32
                                                   // number=12/10=1

                                                   //third iteration==>number=1
                                                   //reminder=1%10=0
                                                  //reverse=32*10+1=321
                                                 //so reversed output=====>321





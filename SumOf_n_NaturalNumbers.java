package com.java.whileLoops;

// 1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
//   ================================================================================

import java.util.Scanner;

public class SumOf_n_NaturalNumbers {
    public static void main(String[] args){
        System.out.println("Enter the limit (ie, nth number )  : ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i=0 , sum=0;
        while(i <= limit){
            sum =sum+i;
            i++;}
        System.out.println("The sum of first "+limit+" numbers = "+sum);
    }
}

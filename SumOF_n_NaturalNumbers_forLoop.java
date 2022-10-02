package com.java.forLoops;

import java.util.Scanner;

public class SumOF_n_NaturalNumbers_forLoop {
    public static void main(String[] args){
        System.out.println("Enter the limit (ie, nth number )  : ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i, sum=0;
        for(i=0;i<=limit;i++){
            sum =sum+i;
        }
        System.out.println("The sum of first "+limit+" numbers = "+sum);
    }
    }


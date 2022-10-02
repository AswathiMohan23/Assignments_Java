package com.java.operators;
// 1. Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c

import java.util.Scanner;

public class Arithmatic_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st no : ie, a = ");
        int a=sc.nextInt();
        System.out.println("enter the 2nd no : ie, b = ");
        int b=sc.nextInt();
        System.out.println("enter the 3rd no : ie, c = ");
        int c=sc.nextInt();
        int value1=a+b*c;
        int value2=c+a/b;
        int value3=a%b+c;
        int value4=a*b+c;
        if((value1>value2)&& (value1>value3)&& (value1>value4))
            System.out.println("the max value is a+b*c = "+value1);
        else if((value2>value1)&& (value2>value3)&& (value2>value4))
            System.out.println("the max value is c+a/b = "+value2);
        else if((value3>value1)&& (value3>value2)&& (value3>value4))
            System.out.println("the max value is c+a/b = "+value3);
        else if((value4>value1)&& (value4>value2)&& (value4>value3))
            System.out.println("the max value is c+a/b = "+value4);
        if((value1<value2)&& (value1<value3)&& (value1<value4)){
            System.out.println("the min value is a+b*c = "+value1);}
        else if((value2<value1)&& (value2<value3)&& (value2<value4))
            System.out.println("the min value is c+a/b = "+value2);
        else if((value3<value1)&& (value3<value2)&& (value3<value4))
            System.out.println("the min value is c+a/b = "+value3);
        else if((value4<value1)&& (value4<value2)&& (value4<value3))
            System.out.println("the min value is c+a/b = "+value4);
    }


    }

package com.java.array;

import java.util.Scanner;

// 8) Java Program to print the duplicate elements of an array
//   ==========================================================

public class DuplicateElements {
    public static void main(String[] args){
        System.out.println("enter the size : ");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int inputArray[]=new int[size];
        System.out.println("enter the elements : ");
        for(int i=0;i<size;i++)
            inputArray[i]=sc.nextInt();
        System.out.println("the duplicate elements are : ");
        for(int i = 0; i < inputArray.length; i++) {
            for(int j = i + 1; j < inputArray.length; j++) {
                if(inputArray[i] == inputArray[j])
                    System.out.println(inputArray[j]);}
        }
    }
}

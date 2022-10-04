package com.java.array;

//6) Java Program to print the elements of an array in reverse order
//   ===============================================================

import java.util.Scanner;

public class Elements_ReverseOrder {
    public static void main(String[] args) {
        System.out.println("enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int inputArray[] = new int[size];
       // int reverseArray[] = new int[size];
        System.out.println("enter the elements : ");
        for (int i = 0; i < size; i++) {
            inputArray[i]=sc.nextInt();
        }
        System.out.println("reverse array : ");
        for(int j=inputArray.length-1;j>=0;j--){
            System.out.print(inputArray[j]+" ");

        }

    }
}

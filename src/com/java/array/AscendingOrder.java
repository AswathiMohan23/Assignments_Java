package com.java.array;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int input[]=new int[size];
        System.out.println("Enter the elements : ");
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();}

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        int number=0;
        //Sort the array in ascending order
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i] > input[j]) {
                    number = input[i];
                    input[i] = input[j];
                    input[j] = number;
                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }}
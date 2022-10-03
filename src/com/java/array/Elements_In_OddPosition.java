package com.java.array;

import java.util.Scanner;

public class Elements_In_OddPosition {
    public static void main(String[] args){
        System.out.println("enter the size of an array : ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int inputArray[]=new int[size];
        System.out.println("enter the elements : ");
        for(int i =0;i<size;i++){
            inputArray[i]=sc.nextInt();
        }
        int odd[]=new int[size];
        System.out.println("the elements in the odd positions are : ");
        for(int j=0;j<size;j++){
            if(inputArray[j]%2!=0){
                odd[j]=inputArray[j];
                System.out.println("position "+j+" = "+odd[j]);
            }
        }
    }
}

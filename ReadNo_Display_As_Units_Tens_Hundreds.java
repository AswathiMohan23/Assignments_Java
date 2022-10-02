package com.java.if_else_statements;

//Read a Number 1,10,100,1000 and display unit, ten & hundred
//============================================================

import java.util.Scanner;

public class ReadNo_Display_As_Units_Tens_Hundreds {
    public static void main(String[] args){
        System.out.println("Select a number from the given set of numbers (1,10,100 or 1000) : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==1)
            System.out.println("Unit");
        else if (number == 10)
            System.out.println("Ten");
        else if (number == 100)
            System.out.println("Hundred");
        else if (number == 1000)
            System.out.println("Thousand");
        else
            System.out.println("Wrong entry !!!! try again by entering 1,10,100 or 1000");
    }
}

package com.java.operators;

//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//     Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
//     Root 1 of x = (-b + sqrt(delta))/(2*a)
//     Root 2 of x = (-b - sqrt(delta))/(2*a)

import java.util.Scanner;
                                                            //eg: a=1,b=5,c=2
import static java.lang.Math.sqrt;                          //root1 = -0.438, root2 = -4.561

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("enter the value of a : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("enter the value of b : ");
        double b = sc.nextDouble();
        System.out.println("enter the value of c : ");
        double c = sc.nextDouble();
        double delta = ((b * b) - (4 * a * c));
        System.out.println("value of ((b*b)-(4*a*c))  : " + delta);
        double root1 = (-b + sqrt(delta)) / (2 * a);
        double root2 = (-b - sqrt(delta)) / (2 * a);
        System.out.println("root 1 : " + root1 + "root 2 : " + root2);

    }
}


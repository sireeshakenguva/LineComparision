package com.bridgelabs.Linecomparision;

import java.util.Scanner;

public class Linecomparision {
	
	public static void main(String[] args) {
		
	System.out.println("Welcome to Linecomparision");
	
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
    System.out.print("Enter coordinates of x1:  "); // Xaxis coordinates of Line1
    int x1= sc.nextInt();
    System.out.print("Enter coordinates of x2:  ");// Xaxis coordinates of Line1
    int x2= sc.nextInt();
    System.out.print("Enter coordinates of y1: ");// Yaxis coordinates of Line1
    int y1= sc.nextInt();
    System.out.print("Enter coordinates of y2: ");// Yaxis coordinates of Line1
    int y2= sc.nextInt();
    double length1=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    System.out.println("Total Length of line 1 is : " +length1);
}
}
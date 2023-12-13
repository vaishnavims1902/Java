package gitHubJava.controlFlow;

import java.util.Scanner;

/*Part 1: Commission Calculator
Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A
Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.*/
public class ControlFlow {
	
	//int percentage;
	public void calculateCommission(int csale){
		if(csale>10000){
			System.out.println("Commission is 30%");
		}
		else if(csale<10000 && csale>5000){
			System.out.println("Commission is 20%");
		}
		else if(csale<=5000 && csale>1000){
			System.out.println("Commission is 10%");
		}
		else if(csale<=1000){
			System.out.println("N/A");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlFlow cf=new ControlFlow();
		Scanner sc=new Scanner(System.in);
		int sale;
		System.out.println("Enter sale figure : ");
		sale=sc.nextInt();
		cf.calculateCommission(sale);
		sc.close();
	}

}

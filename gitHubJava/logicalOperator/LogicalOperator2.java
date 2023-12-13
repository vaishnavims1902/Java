package gitHubJava.logicalOperator;

import java.util.Scanner;

public class LogicalOperator2 {
	/*Part 2: Weight Guru Challenge
	Create a Java program that tells whether your body to weight ratio is good or could be better.
	The java app should take in your weight and height from the console and calculate your body to weight ratio.
	You can use this article as a standardized guide for how to apply the logic.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enetr Your height in meters : ");
		double h=sc.nextDouble();
		System.out.print("Enetr Your Weight in kilograms : ");
		double w=sc.nextDouble();
		double sh=h*h;
		double bmi=w/sh;
		if(bmi>=19 && bmi<=24){
			System.out.print("Normal");
		}
		else if(bmi>=25 && bmi<=29 ){
			System.out.print("Overweight");
		}
		else if(bmi>=30 && bmi<=39){
			System.out.print("Obese");
		}
	}

}

package gitHubJava.Functions;

import java.util.Scanner;

/*
 * Part 2:
Create a new Java class that will have the following functionality:

Name should be CalculatorBrain
Implement a function for each aritmetic operation
Addition
Subtraction
Multiplication
Division
Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.
Challenge yourself
Add some more functionality to your CalculatorBrain:

Square Root
Power Of
 */
public class CalculatorBrain {

	public int addition(int a,int b){
		return a+b;
	}
	public int multiplication(int a,int b){
		return a*b;
	}
	public int subtraction(int a,int b){
		return a-b;
	}
	public int division(int a,int b){
		return a/b;
	}
	public double squareRoot(double a){
		return Math.sqrt(a);
	}
	public double powOf(double a,double b){
		return Math.pow(a, b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a : ");
		int a=sc.nextInt();
		System.out.println("Enter number b : ");
		int b=sc.nextInt();
		CalculatorBrain c=new CalculatorBrain();
		System.out.println("Addition : "+c.addition(a, b));
		
		System.out.println("Substraction : "+c.subtraction(a, b));
		
		System.out.println("Multiplication : "+c.multiplication(a, b));
		
		System.out.println("Division : "+c.division(a, b));
		
		System.out.println("Square Root : "+c.squareRoot(a));
		
		System.out.println("Enter number a : "+c.powOf(a, b));
		
	}

}

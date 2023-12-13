package gitHubJava.variablesDatatypesOperators;

import java.util.Scanner;

/*Activity 3: Variable Naming and Type Casting
Open your IntelliJ Idea IDE and follow the instructions below
Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
Perform a widening casting operation (integer to double) when storing the result of the operations.
Print out the results of the two operations in the console.
Extra features
If you're able to implement the steps above with time to spare, check on your pair partner and ask if they need help.*/

public class VariableNamingAndTypeCasting {
	int radius;
	double area,perimeter;
	Scanner sc= new Scanner(System.in);
	public void calculate(){
		System.out.println("Enter the radius of circle : ");
		radius=sc.nextInt();
		area=3.14*radius*radius;
		perimeter=3.14*2*radius;
		System.out.println("Area of circle : "+area);
		System.out.println("Perimeter of circle : "+perimeter);
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		VariableNamingAndTypeCasting circle= new VariableNamingAndTypeCasting();
		circle.calculate();
	}

}

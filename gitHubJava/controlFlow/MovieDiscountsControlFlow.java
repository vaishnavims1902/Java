package gitHubJava.controlFlow;

import java.util.Scanner;

public class MovieDiscountsControlFlow {
	/*Part 2: Movie Discounts
	A movie cinema does price discounting depending on a customer's age.
	The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
	Age range	Ticket Price
	Normal ticket	7 Euros
	Below 5	60% Discount
	Over 60	55% Discount
	Write the app so that the conditions above are met and the correct ticket price is returned.
	Extra features
If done with the first part of the exercise with time to spare add the following feature.

Have the app prompt normal ticket buyers for the number of tickets they wish to buy.
For every two or more tickets sold, give a 30% discount.*/
	Scanner sc=new Scanner(System.in);
	public void calDiscounts(int age){
		if(age>5 && age<60){
			double total;
			System.out.print("How many tickets you want to buy : ");
			int n=sc.nextInt();
			if(n>=2){
				 total=(n*7)+(n*7)*0.3;
				 System.out.println("Yayyy.. you get 30% discount...");
				 System.out.println("You need to pay "+total+" Euros.");
			}
			else{
			System.out.println("You need to pay 7 Euros.");
			}
		}
		else if (age<=5){
			double dis=7*0.6;
			double total=7+dis;
			System.out.println("Yayyy.. you get 60% discount...");
			System.out.println("You need to pay "+total+" Euros.");
		}
		else if (age>=60){
			double dis=7*0.55;
			double total=7+dis;
			System.out.println("Yayyy.. you get 55% discount...");
			System.out.println("You need to pay "+total+" Euros.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieDiscountsControlFlow cf=new MovieDiscountsControlFlow();
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter Age : ");
		age=sc.nextInt();
		cf.calDiscounts(age);
		sc.close();

	}

}

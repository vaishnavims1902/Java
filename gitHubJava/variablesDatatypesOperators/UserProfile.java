package gitHubJava.variablesDatatypesOperators;

import java.util.Scanner;

/*Activity 2: My First Variable Naming
Open your IntelliJ Idea IDE and follow the instructions below
Create a project called MyFirstVariableNaming
Create a class titled "UserProfile"
Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
Use the age to calculate the year when a user was born.
Print the values back to a user's console.
Extra features
If you're able to implement the steps above with time to spare, add the following features to your app.

Instead of storing values in the static variables (variables manually assigned to values), have it so that a few variables are entered by a user through the console.*/
public class UserProfile {
	String username,gender,jobPreference,nationality,bloodType;
	int age;
	Scanner sc=new Scanner(System.in);
	
	public void printUser(){
		System.out.println("********************************");
		System.out.println("Enter your name : ");
		username=sc.nextLine();
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		System.out.println("Enter your gender : ");
		gender=sc.nextLine();
		gender=sc.nextLine();
		System.out.println("Enter your Job Preference : ");
		jobPreference=sc.nextLine();
		System.out.println("Enter your Nationality : ");
		nationality=sc.nextLine();
		System.out.println("Enter your Blood Type : ");
		bloodType=sc.nextLine();
		System.out.println("**********************************");
		System.out.println("Username : "+username);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Job Preference : "+jobPreference);
		System.out.println("Nationality : "+nationality);
		System.out.println("Blood Type : "+bloodType);
		System.out.println("**********************************");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserProfile user=new UserProfile();
		user.printUser();
	}

}

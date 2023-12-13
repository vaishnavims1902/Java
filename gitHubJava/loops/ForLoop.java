package gitHubJava.loops;

import java.util.Scanner;

/*Part 3: For loops
Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
Hint You can use the following String functions:

lenght() -> returns the total number of characters of a given String
chartAt(i) -> returns the character at the given position(i) of a String
Challenge yourself
Write a for loop that makes the counter go from 15 to 30, counting by 3s.*/
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		for(int i=0;i<name.length();i++){
			System.out.println(name.charAt(i));
		}

	}

}

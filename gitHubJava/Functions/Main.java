package gitHubJava.Functions;

/*
 Part 1:
Download the project and import it into IntelliJ Idea
Implement the following functions:
    private static void printNameLength( String name )
    {
      //TODO implement this code
    }

    private static void printNameCharacters( String name )
    {
      //TODO implement this code
    }
Test your code with 5 different names and verify that the behaviour is correct.
Modify your code to also capture from the user the last name.
Implement an additional function that prints the FUll name of the person.

*/import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        System.out.println( "Enter your last name:  " );
        String lname = console.next();
        String fullname=name+" "+lname;
        printNameCharacters( name );
        printNameLength( name );
        printName( fullname );
        console.close();
    }

    private static void printNameLength( String name )
    {
        //TODO implement this code
    	System.out.println(name.length());
    }

    private static void printNameCharacters( String name )
    {
        //TODO implement this code
    	for(int i=0;i<name.length();i++){
    		System.out.println(name.charAt(i));
    	}
    	
    }
    private static void printName( String fullname )
    {
        //TODO implement this code
    	System.out.println(fullname);
    	
    }


}

package gitHubJava.loops;

import java.util.Scanner;

/*Part 2: Do While loops
Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	...*/
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0 ,n,i=2;
		Scanner sc=new Scanner(System.in);
		a=0;
		b=1;
		System.out.println("Enter upto what you want print fibonacci series : ");
		n=sc.nextInt();
		System.out.println("Fibonacci Number : ");
		
		if(n==0){
			System.out.println(a);
		}
		else if(n==1){
			System.out.println(b);
			
		}
		else{
			do{
				
				c=a+b;
				a=b;
				b=c;
				i++;
			}while(i<=n);
			System.out.println(c);
		}
		

	}

}


package mod3Homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


//1. Write Fibonnaci series between the user entered start and end values

//2. Determine whether a user entered number is an Armstrong number
int num, originalnumber, remainder, results=0;
//Scanner console = new Scanner (System.in);
//System.out.print("Enter number between 1 and 7:");
//weekdays = console.nextInt();
Scanner scan = new Scanner (System.in);
System.out.println("enter a number");
num = scan.nextInt ();

originalnumber = num;

while(originalnumber !=0)
{
	remainder= originalnumber % 10;
	results+=Math.pow(remainder, 3);
	originalnumber/=10; 
}
if (results==num)
	System.out.println(num+"is an armstrongnumber");
else
	System.out.println(num+"is not an armstrongnumber");



//3. Write a program to see if a user entered string is a palindrome or not
String rev = "";
Scanner scann = new Scanner (System.in);
System.out.println("enter string");
String str = scann.nextLine ();

 int length = str.length();
		
		for(int i = length - 1; i >=0; i-- )
			rev = rev + str.charAt(i);
		
		
		if(str.equals(rev))
			System.out.println(str + "is a palindrome!!");
		else
			System.out.println(str + "is not a palindrome!!");
	}


	}
}
	

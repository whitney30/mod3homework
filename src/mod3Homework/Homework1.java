import java.util.Scanner;
package mod3Homework;


public class Homework1 {

ecx
		public static void main(String [] args ) {
			/*Write an if/else statement for the following requirements:
			Write an if/else statement for the following requirements:
				If student gets 90 or higher: console log  A
				If students get 80 or above: console log B
				If students get 70 or above: console log C
				If students get 55 or above: console log D
				Any grade lower than 55 is F
				Using switch case, do the following:
				Store a number between 1-7
				If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
				Anything other than 1-7 would default to "Invalid Input"
				Store a number in a variable called num and write an if statement: 
				If num is odd, display "Cool"
				If num is even and between 2-5, display "Not Cool"
				If num is even and between 6-20, display "Cool"
				If num is even and greater than 20, display "Not Cool
*/
			
			// TODO Auto-generated method stub
			System.out.println("Enter a grade");
			int score;
			
			
			if(score >=90 && score >=100) {
				System.out.println("A");
				
			} else if(score >=80 && score >=90) {
					System.out.println("B");
					
			} else	if(score >=70 && score >=80) {
						System.out.println("C");
						
			} else	if(score >=55 && score >=70) {
							System.out.println("D");
							
			} else if(score >= 0 && score <55) {
				System.out.println("F");
				
			} else {
							
							
			
		

	

 

				int weekdays;
Scanner console = new Scanner (System.in);
System.out.print("Enter number between 1 and 7:");
weekdays = console.nextInt();


switch(weekdays) {

case 1:
	System.out.println("monday");
	break;
case 2: 
	System.out.println("tuesday");
	break;
case 3: 
	System.out.println("wednesday");
	break;
case 4:
	System.out.println("thursday");
	break;
case 5:
	System.out.println("friday");
	break;
case 6:
	System.out.println("saturday");
	break;
case 7:
	System.out.println("sunday");
	break;
	default:
	System.out.println("invaild day");
}
//If num is odd, display "Cool"
//If num is even and between 2-5, display "Not Cool"
//If num is even and between 6-20, display "Cool"
//If num is even and greater than 20, display "Not Cool
int num;
Scanner scan = new Scanner (System.in);
System.out.println("choose a number");
num = scan.nextInt();

if (num%2==1) 
{
	System.out.println("cool");
}
if (num%2==0 && num<= 2-5);
{
	System.out.println("Not cool");
}
if (num%2==0 && num<=6-20);
{
	System.out.println("cool");
}
if (num%2==0 && num>=20);
{
	System.out.println("Not cool");
}
	

			
	
			}
		}
}


		
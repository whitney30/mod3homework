package mod3Homework;
import java.util.Scanner;
public class homework3 {


//Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.
//
//
//
//OPTIONS
//
//1. Add
//
//2. Subtract
//
//3. Multiply
//
//4. Divide
//
//5. Exit
//
//
//
//1. Write different methods for each module (add, subtract, multiply, and divide).
//
//2. Use switch/case to call the particular method.
//
//3. Take input inside the methods to perform the related operation.
//
//4. Return the answer and display it inside the main method.
//
//5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user

double num1, num2;

// Take input from the user

Scanner sc = new Scanner(System.in);

System.out.println("Enter the numbers");
//System.out.println("Enter the numbers");

// take the inputs
num1 = sc.nextDouble();

num2 = sc.nextDouble();

System.out.println("Enter the operator (+,-,,/)");

char op = sc.next().charAt(0);

double o = 0;

switch (op) {

// case to add two numbers
case '+':

    o = num1 + num2;

    break;

// case to subtract two numbers
case '-':

    o = num1 - num2;

    break;

// case to multiply two numbers
case '':

    o = num1 * num2;

    break;

// case to divide two numbers
case '/':

    o = num1 / num2;

    break;

default:

    System.out.println("You enter wrong input");

    break;
}

System.out.println("The final result:");

System.out.println();

// print the final result
System.out.println(num1 + " " + op + " " + num2
                   + " = " + o);
}
}










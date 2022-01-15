package phase1Assignment;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		// Java program for simple arithmetic calculator

				// stores two numbers
				double num1, num2;

				// Take input from the user
				Scanner ab = new Scanner(System.in);

				System.out.println("Enter the numbers");

				// take the inputs
				num1 = ab.nextDouble();

				num2 = ab.nextDouble();

				System.out.println("Enter the operator (+,-,*,/)");

				char ch = ab.next().charAt(0);

				double d = 0;

				switch (ch) {

				// case to add two numbers
				case '+':

					d = num1 + num2;

					break;

				// case to subtract two numbers
				case '-':

					d = num1 - num2;

					break;

				// case to multiply two numbers
				case '*':

					d = num1 * num2;

					break;

				// case to divide two numbers
				case '/':

					d = num1 / num2;

					break;

				default:

					System.out.println("You enter wrong input");

					break;
				}

				System.out.println("The final output: ");

				System.out.println();

				// print the final output 
				System.out.println(num1 + " " + ch + " " + num2+ " = " + d);
			}
		}



package IfElse;

import java.util.Scanner;

public class Multiple_Condition_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUM to check divisibility by both conditions: ");
		int Num=sc.nextInt();
		if (Num%2==0 || Num%3==0) { //just change the digit in place of 2&3, to check with other numbers
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divisible");
		}
		sc.close();
		}
	}// it will accept and prints, even if its divisible by one condition. 
	 //For both conditions satisfacation(TRUE) use && operator
package IfElse;

import java.util.Scanner;

public class Divisibility_Check {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a NUM to check divisibility: ");
	int Num=sc.nextInt();
	if (Num%2==0) { //just change the digit in place of 2, to check with other numbers
		System.out.println("Divisible");
	}
	else {
		System.out.println("Not Divisible");
	}
	sc.close();
	}
}

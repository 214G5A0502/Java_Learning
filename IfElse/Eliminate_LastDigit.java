package IfElse;

import java.util.Scanner;

public class Eliminate_LastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int num=sc.nextInt();
		sc.close();
		int eliminated=num/10;
		System.out.println("After elimination of last digit: "+eliminated);
	}
}

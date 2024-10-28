package IfElse;

import java.util.Scanner;

public class Num_Divisible_with_2_5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUM to check divisibility for 2 5 10: ");
		int Num=sc.nextInt();
		if(Num%10==0) {              //	Optimized code
			System.out.println("Divisible by all 2,5,10");
		}else {System.out.println("Not Divisible by all 2,5,10");
//		if (Num%2==0 && Num%5==0 && Num%10==0) { //just change the digit in place of 2, to check with other numbers
//			System.out.println("Divisible by all 2,5,10");
//		}
//		else {
//			System.out.println("Not Divisible by all 2,5,10");
//		}
		sc.close();
	}
	}}

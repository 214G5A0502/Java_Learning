package IfElse;

import java.util.Scanner;

public class Print_Last_Digit_of_num {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num: ");
		int num=sc.nextInt();
		sc.close();
		int lastdigit=num%10;
		System.out.println("last digit of a num: "+lastdigit);
	}
}

package IfElse;

import java.util.Scanner;

public class Find_LastDigit_0_or_other {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		if(a%10==0) {
			System.out.println("ends with 0");
		}else {
			System.out.println("not end with 0");
		}sc.close();
	}
}
/*
OUTPUT:
5456154
not end with 0
*/
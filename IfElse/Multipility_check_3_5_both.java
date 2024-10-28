package IfElse;

import java.util.Scanner;

public class Multipility_check_3_5_both {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println("multiple of both 3 & 5");
		}
		else if(num%3==0) {
			System.out.println("3 multiple");
		}
		else if(num%5==0) {
			System.out.println("5 Multiple");
		}sc.close();
	}

}

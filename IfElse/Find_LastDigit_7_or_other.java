package IfElse;

import java.util.Scanner;

public class Find_LastDigit_7_or_other {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%10==7) {
			System.out.println("ends with 7");			
		}else {
			System.out.println("not ends with 7");
		}sc.close();
	}

}

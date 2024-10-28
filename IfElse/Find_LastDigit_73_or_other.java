package IfElse;

import java.util.Scanner;

public class Find_LastDigit_73_or_other {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%100==73) { 								//ends with 2 digits. so, 100
			System.out.println("ends with 73");
		}else {
			System.out.println("not ends with 73");
		}sc.close();
	}

}

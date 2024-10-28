package IfElse;

import java.util.Scanner;

public class Num_bwn_Ascii_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		if(num>=65 && num<=90) {
			System.out.println("In b/w ASCII value of Uppercase");
		}else {
			System.out.println("Not In b/w ASCII value of Uppercase");
		}sc.close();
	}
}
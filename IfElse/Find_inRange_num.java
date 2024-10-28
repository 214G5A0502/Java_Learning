package IfElse;

import java.util.Scanner;

public class Find_inRange_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		//find num is between 50 and 90
		if(num>=50 && num<90) {
			System.out.println("In b/w of 50 and 90");
		}
		else {
			System.out.println("not in b/w of 50 and 90");
		}
	}
}

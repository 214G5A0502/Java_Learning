package DataTypes;

import java.util.Scanner;

public class SquareOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value: ");
		int a=sc.nextInt();
		int square=a*a;
		System.out.println("square of a is: "+square);
		sc.close();
	}

}

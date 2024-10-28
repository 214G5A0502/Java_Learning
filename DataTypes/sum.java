package DataTypes;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		int a=sc.nextInt();
		System.out.println("enter num2: ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println(sum);
		sc.close();
		
	}

}

package IfElse;
import java.util.Scanner;
public class Eliminate_Last_2Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num: ");
		int num=sc.nextInt();
		sc.close();
		System.out.println("After removal of Last 2digits from num is: "+num/100);
		
	}

}

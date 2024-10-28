package IfElse;
import java.util.Scanner;
public class Find_2Digit_Yes_and_3Digit_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		if(num>=10 && num<100) {
			System.out.println("2 digit num");
		}
		else {
			System.out.println("not 2 digit num");
		}

	}

}

package Loops;
import java.util.Scanner;
public class Mul_table_of_5_with_input_5_till10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num for mutliplication table: ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+i*n);
		}sc.close();
	}

}

package Loops;
import java.util.Scanner;
public class For_loop_nto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num to print upto(Decrmnt): ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();
	}
}

package While_Loop_Prgrms;

import java.util.Scanner;

public class Reverse_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,rev=0;
		int n1=n;// we are storing n value in n1. becoz at last n value will becomes 0, so palindrome condition fails. so for comparison we r storing starting n value in n1. 
		while(n>0) {//this logic works for only post nums
			rem=n%10; //take n value and take a last value
			rev=rev*10+rem;// that last value will be stored in rev, if we add 2nd num it will add gives other num instead of concatination
			n=n/10;// after above 2 steps , we need to remove last digit , becoz of cmpltn of process in last num
		}
		System.out.println(rev);
		System.out.println(n1==rev?"palindrome":"not palindrome");
//		if(n1==rev) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not paalindrome");
//		}
	}
}
// n  123            rev   0+4=4          rem  4
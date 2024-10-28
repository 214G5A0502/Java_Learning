package Methods;

import java.util.Scanner;

public class Print_first_5prime_nums {
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		sc.close();
		for(int i=2;count<n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;				
			}
		}
	}
}

package Multiple_Methods_Creation;

import java.util.Scanner;

public class Print_primeNums_btwn_N_andM {
	
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
	public static void printPrimes(int n, int m){
		for(int i=n;i<=m;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting value(N): ");
		int n=sc.nextInt();
		System.out.println("enter ending value(M): ");
		int m=sc.nextInt();
		sc.close();
		printPrimes(n,m);		
	}
}
/*
======================OUTPUT===================
enter starting value(N): 
2
enter ending value(M): 
10
2 3 5 7 
*/
package Methods;

import java.util.Scanner;

public class Finding_Prime_optimized_way {
	public static String findingPrime(int n){
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}if(count==0) {
			return "prime";
		}else {
			return "not prime";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		String res=findingPrime(n);
		System.out.println(res);
	}

}

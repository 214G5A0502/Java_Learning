package Methods;

import java.util.Scanner;

public class count_Factors_of_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num: ");
		int n=sc.nextInt();
		sc.close();	
		int res=countFactors(n);
		System.out.println("The no. of factors of "+n+" is: "+res);
	}

	public static int countFactors(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}return count;
		
	}

}

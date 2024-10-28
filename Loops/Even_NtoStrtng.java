package Loops;

import java.util.Scanner;

public class Even_NtoStrtng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to print values upto(Decrmnt): ");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}sc.close();
	}
}
/*==============or===============================
for(int i=n;i>=n;i=i-2) {
	System.out.println(i);
}
=================or==============================
for(int i=n;i>=n;i--,i--){
    System.out.println(i);
}
*/
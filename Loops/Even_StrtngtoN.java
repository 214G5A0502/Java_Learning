package Loops;
import java.util.Scanner;
public class Even_StrtngtoN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to print values upto(Incrmnt): ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}sc.close();
	}
}
/*==============or===============================
for(int i=0;i<=n;i=i+2) {
	System.out.println(i);
}
=================or==============================
for(int i=0;i<=n;i++,i++){
    System.out.println(i);
}
*/
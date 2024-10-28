package Loops;
import java.util.Scanner;
public class Multiples_of_2and3_till_N {
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter num to print values upto(Incrmnt): ");
				int n=sc.nextInt();
				for(int i=0;i<=n;i++) {
					if(i%2==0 || i%3==0) {
					System.out.print(i+" ");
					}
				}sc.close();
			}
	}
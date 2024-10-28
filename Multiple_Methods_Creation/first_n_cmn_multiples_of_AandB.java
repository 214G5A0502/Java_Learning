package Multiple_Methods_Creation;

import java.util.Scanner;
public class first_n_cmn_multiples_of_AandB {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			for(int i=1;count<=x;i++) {
				if(i%a==0 && i%b==0) {
					System.out.print(i+" ");
					count++;
				}
			}
		}
}
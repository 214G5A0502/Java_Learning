package Methods;
import java.util.Scanner;

public class Prime_nums_till_N {
		public static boolean findingPrime(int n){
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					return false;
				}
			}return true;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc.close();
			System.out.println("Prime numbers up to " + n + " are:");
			for(int i=2;i<=n;i++) {
				if(findingPrime(i)) {
					System.out.print(i+" ");
			}
		}
}
}
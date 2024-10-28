package Methods;
import java.util.Scanner;

public class Findng_Prime_Most_efficient_way {

			public static String findingPrime(int n){
				for(int i=2;i*i<=n;i++) {
					if(n%i==0) {
						return "not prime";
					}
				}
				return "prime";
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

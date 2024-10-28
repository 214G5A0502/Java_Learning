package DataTypes;
import java.util.Scanner;

public class CtoF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Celsius in INT format: ");
		int c=sc.nextInt();
		float f= (c*9.0f/5)+32;
		System.out.println("CtoF: "+f);
		sc.close();
		
		
	}

}

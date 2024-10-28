package Arrays;

import java.util.Scanner;

public class Printing_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//taking input for Array size
		int n=sc.nextInt();
		//creating an Array
		int[] arr=new int[n];
		//sc.close();
		//for taking input values for Array
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			//System.out.print(arr[i]+" ");======> if we write this stmnt here, immediate after giving input it prints output for each input
		}
		//for printing elements of Array
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

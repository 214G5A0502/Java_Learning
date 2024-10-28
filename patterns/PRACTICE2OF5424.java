package com.anil.patterns;
import java.util.Scanner;

public class PRACTICE2OF5424 {

	public static void main(String[] args) {
		int n=10;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				//if((i==0 || j==0 || i==n-1 || j==n-1 || (i==n/2 && j==n/2)))
				if(i*j==0 || i==n-1 || j==n-1|| (i==n/2 && j==n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	 
		}
}}
package com.anil.patterns;

public class patternU {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		n=n|1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==n-1 || j==n-1)	//  i-j==0 || i+j==n-1
					System.out.print("*");			//(char)(97+(i%26))
				else
					System.out.print(" ");
			}
			System.out.print("\n");		
		}
	}

}

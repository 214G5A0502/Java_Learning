package com.anil.patterns;

public class arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i=0,j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==n/2 || i-j==-n/2 || i+j==(3*n)/2)	//  (i == n-1 && j==n-1)		&& i*j==n-1
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");		
		}
	}

}


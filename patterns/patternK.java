package com.anil.patterns;

public class patternK {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n=5;
	n=n|1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if((i-j==n/2 || i-j==(n/2) || j==0 || i+j==n/2))	//  i-j==0 || i+j==n-1
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("\n");		
	}
}

}
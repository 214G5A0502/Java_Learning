package com.anil.patterns;

public class rightTrianglenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			int r=1;
			for(int j=0;j<n;j++)
			{
				if(i-j>=0) {	//  i-j==0 || i+j==n-1
					System.out.print(r+" ");
				r++;
			}
				else{
					System.out.print(" ");
			}}
			System.out.print("\n");		
		}
	}

}

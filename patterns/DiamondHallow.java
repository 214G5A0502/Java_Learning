package com.anil.patterns;

public class DiamondHallow {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n=10;
				n=n|1;
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						if(i-j>=n/2 || i+j<=n/2 || i-j<=-n/2 || i+j>=3*(n/2))	//  i-j==0 || i+j==n-1
							System.out.print("k");
						else
							System.out.print(" ");
					}
					System.out.print("\n");		
				}
			}

		}
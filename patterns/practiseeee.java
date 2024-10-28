package com.anil.patterns;

public class practiseeee {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n=5,i=0,j=0;
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{	// for "Q" printing ---->>>>i*j==0 && i<=n/2  || j==n-1 && i<=n/2 || i==n/2 ||i-j==0
						if(i*j==0 && i<=n/2  || j==n-1 && i<=n/2 || i==n/2 ||i-j==0)	
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print("\n");		
				}
			}
		}
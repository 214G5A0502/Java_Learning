package com.anil.patterns;

public class StarPattern {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					int n=10,i=0,j=0;
					for(i=0;i<n;i++)
					{
						for(j=0;j<n;j++)
						{
							if(i-j==0 || i+j==n-1 || i==n/2 || j==n/2 )	//  i==0 || j==n-1
								System.out.print("*");
							else
								System.out.print("  ");
						}
						System.out.print("\n");		
					}
				}
			}



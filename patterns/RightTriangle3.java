package com.anil.patterns;

public class RightTriangle3 {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					int n=5,i=0,j=0;
					for(i=0;i<n;i++)
					{
						for(j=0;j<n;j++)
						{
							if((j-i==0))	//  i-j==0 || i+j==n-1
								System.out.print("*");
							else
								System.out.print(" ");
						}
						System.out.print("\n");		
					}
				}

			}

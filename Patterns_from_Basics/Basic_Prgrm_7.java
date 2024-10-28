package Patterns_from_Basics;

public class Basic_Prgrm_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count;
		for(int i=0;i<n;i++) {
			count=i+1;
			for(int j=0;j<n;j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}
}
/*
1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
*/
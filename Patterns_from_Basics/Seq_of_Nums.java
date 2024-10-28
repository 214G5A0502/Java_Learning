package Patterns_from_Basics;

public class Seq_of_Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count=1;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(count+" ");// for printing nums
//				count++;//incrmntng of counting
//			}
//			System.out.println();
//		}
//==========but from 0-9 have single digits so, ========================
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(count<=9) {// if condition for printing "0" before the num
				System.out.print(0);
				}
				System.out.print(count+" ");// for printing nums
				count++;//incrmntng of counting
			}
			System.out.println();
		}

	}

}

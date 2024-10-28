package Triangle_Patterns_from_Basics;

public class Triangle_Prgrm_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}

	}

}
/*

FOR "I" PRINTING
0
11
222
3333
44444

FOR "J" PRINTING
0
01
012
0123
01234

needed output || Expected output --->> "J+1"
1
12
123
1234
12345

*/
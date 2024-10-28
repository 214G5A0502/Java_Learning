package Triangle_Patterns_Spaces_Printing_atFirst;

public class Triangle_Prgrm_4 {
// for printing spaces first, we need to declare one more variable loop "K"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-1-i;k++) {
				System.out.print("-");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/* 

    *
   **
  ***
 ****
*****

*/
package Patterns_from_Basics;

public class Exact_Triangle {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			for(int i=1;i<=5;i++) {
				//FOR PRINTING SPACES
				for(int j=1;j<=5-i;j++) {
					System.out.print(" ");
				}
				//FOR PRINTING STARS
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
/* OUTPUT

	* 
   * * 
  * * * 
 * * * * 
* * * * *   

*/
package Triangle_Patterns_Spaces_Printing_atFirst;

public class Triangle_Prgrm_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-1-i;k++){
				System.out.print("-");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();			
		}
	}
}
/*

just we r adding space in "*" printing line
FROMO THIS TO
    *
   **
  ***
 ****
*****

TO BELOW ONE
----* 
---* * 
--* * * 
-* * * * 
* * * * * 

*/
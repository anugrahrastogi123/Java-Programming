import java.util.Scanner;

/*
   	Print this pattern-
   	n = 4
   	
   	* * * *
   	* * *
   	* * 
   	*
   		
 */
public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

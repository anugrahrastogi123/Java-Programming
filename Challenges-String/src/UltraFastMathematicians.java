import java.util.Scanner;

public class UltraFastMathematicians {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			
			char[] s1 = sc.next().toCharArray();
			char[] s2 = sc.next().toCharArray();
			
			for(int i = 0; i < s1.length; i++) {
				
				if((int)s1[i] - (int)s2[i] == 1 || (int)s1[i] - (int)s2[i] == -1) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}

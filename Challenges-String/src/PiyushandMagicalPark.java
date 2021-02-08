import java.util.Scanner;

public class PiyushandMagicalPark {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		int k = s.nextInt();
		int strength = s.nextInt();
		
		char[][] arr = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.next().charAt(0);
			}
		}
		
		boolean res = willGetLost(arr, n, m, strength, k);
		
		if(res == false)
			System.out.println("No");
		
		s.close();

	}
	
	public static boolean willGetLost(char[][] arr, int n, int m, int strength, int k) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == '.' && j != m-1) {
					strength = strength - 3;
				}
				else if(arr[i][j] == '*' && j != m-1) {
					strength = strength + 4;
				}
				else if(arr[i][j] == '#') {
					break;
				}
				else if(arr[i][j] == '.' && j == m-1) {
					strength = strength - 2;
				}
				else if(arr[i][j] == '*' && j == m-1) {
					strength = strength + 5;
				}
				if(strength < k) {
					return false;
				}
			}
		}
		
		System.out.println("Yes \n" + strength);
		return true;
	}

}

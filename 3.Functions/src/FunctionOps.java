import java.util.Scanner;

public class FunctionOps {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int snum = s.nextInt();
		int db = s.nextInt();
//		int sb = s.nextInt();
//		
//		int res = anybaseToDecimal(snum, sb);
//		System.out.println(res);
		
		int res = decimalToAnybase(snum, db);
		System.out.println(res);

	}
	
	public static int anybaseToDecimal(int snum, int sb) { // snum : source number, sb : source base
		
		int multiplier = 1;
		int ans = 0;
		
		while(snum != 0) {
			int rem = snum % 10;
			snum = snum / 10;
			ans = ans + (rem * multiplier);
			multiplier *= sb;
		}
		
		return ans;
		
	}
	
	public static int decimalToAnybase(int snum, int db) { // snum : source number, db : destination base
		
		int multiplier = 1;
		int ans = 0;
		
		while(snum != 0) {
			int rem = snum % db;
			snum = snum / db;
			ans = ans + (rem * multiplier);
			multiplier *= 10;
		}
		
		return ans;
		
	}

}

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int count = countDigits(num);
		boolean ans = isArmstrong(num, count);
		System.out.println(ans);

	}
	
	public static int countDigits(int num) {
		
		return (int) Math.floor(Math.log10(num) + 1);
	}
	
	public static boolean isArmstrong(int num, int count) {
		
		int actual_num = num;
		int new_num = 0;
		
		while(num != 0) {
			
			int rem = num % 10;
			num = num / 10;
			
			new_num = new_num + (int) Math.pow(rem, count);
		}
		
		if(new_num == actual_num)
			return true;
		
		return false;
	}

}

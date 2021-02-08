import java.util.Scanner;

public class FindingCBNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int len = s.nextInt();
		
		char[] digits = s.next().toCharArray();
		
		int[] prime = new int[(int)Math.pow(10, len)];
		
		for(int i = 3; i < prime.length; i += 2) {
			prime[i] = 1;
		}
		
		for(long i = 3; i < prime.length; i += 2) {
			if(prime[(int)i] == 1) {
				for(long j = i*i; j < prime.length; j = j + i) {
					prime[(int)j] = 0;
				}
			}
		}
		
		prime[2] = 1;
		
		int count = 0;
		
		for(int i = 0; i < len; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = i; j < len; j++) {
				sb.append(digits[j]);
				int num = Integer.parseInt(sb.toString());
				if(prime[num] == 1) {
					System.out.println(sb);
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}

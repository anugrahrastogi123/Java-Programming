
public class PowerLog {

	public static void main(String[] args) {
		
		System.out.println(power(2, 6));

	}
	
	public static int power(int x, int n) {
		
		if(n == 0)
			return 1;
		
		int rec_res = power(x, n/2);
		
		if(n % 2 == 1) {
			return rec_res * rec_res * x;
		}
		
		return rec_res * rec_res;
	}

}

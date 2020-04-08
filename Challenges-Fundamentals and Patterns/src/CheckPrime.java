import java.util.*;

public class CheckPrime {
	
    public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		boolean flag = true;

		for(int i = 2; i*i <= n; i++){
			if(n % i == 0) {
				flag = false;
				break;
			}
		}

		if(flag == true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

    }
}
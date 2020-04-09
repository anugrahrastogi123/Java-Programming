import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		for(int i = 0; i < t; i++) {
			
			int c1 = s.nextInt();
			int c2 = s.nextInt();
			int c3 = s.nextInt();
			int c4 = s.nextInt();
			
			int n = s.nextInt();
			int m = s.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[m];
			
			for(int j = 0; j < n; j++)
				a[j] = s.nextInt();
			
			for(int z = 0; z < m; z++)
				b[z] = s.nextInt();
			
			int rickSum = 0;
			for(int rsum: a)
				rickSum += Math.min(rsum*c1, c2);
			
			int cabSum = 0;
			for(int csum: b)
				cabSum += Math.min(csum*c1, c2);
			
			int totalRickshawCost = Math.min(rickSum, c3);
			int totalCabCost = Math.min(cabSum, c3);
			
			int finalCost = Math.min(totalRickshawCost+totalCabCost, c4);
			
			System.out.println(finalCost);
		
		
		}
	}

}

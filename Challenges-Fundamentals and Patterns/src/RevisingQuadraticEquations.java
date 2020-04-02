import java.util.Scanner;

public class RevisingQuadraticEquations {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int d = b*b - 4*a*c;
		
		if(d > 0) {
			System.out.println("Real and Distinct");
			int root1 = (-b + (int)Math.sqrt(d))/(2*a);
			int root2 = (-b - (int)Math.sqrt(d))/(2*a);
			
			if(root1 < root2) {
				System.out.println(root1 + " " + root2);
			}
			else {
				System.out.println(root2 + " " + root1);
			}
		}
		else if(d == 0) {
			System.out.println("Real and Equal");
			int root = (-b)/(2*a);
			System.out.println(root + " " + root);
		}
		else {
			System.out.println("Imaginary");
		}

	}

}

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		do {
			
			char ch = s.next().charAt(0);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%') {
				int n1 = s.nextInt();
				int n2 = s.nextInt();
				if(ch == '+')
					System.out.println(n1+n2);
				else if(ch == '-')
					System.out.println(n1-n2);
				else if(ch == '*')
					System.out.println(n1*n2);
				else if(ch == '/')
					System.out.println(n1/n2);
				else
					System.out.println(n1%n2);
			}
			else if(ch=='X' || ch=='x')
				break;
			else
				System.out.println("Invalid operation. Try again.");
			
		}while(true);

	}

}

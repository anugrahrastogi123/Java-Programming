import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		
		// append
		sb.append("abc");
		System.out.println(sb);
		
		// insert
		sb.insert(2, "def");
		System.out.println(sb);
		
		sb.insert(sb.length(),  'g');
		System.out.println(sb);
		
		// delete
		sb.delete(2, 5);
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		// update
		sb.setCharAt(1, 'B');
		System.out.println(sb);
		
		// SB to string
		String s = sb.toString();
		System.out.println(s);
		
		

	}

}

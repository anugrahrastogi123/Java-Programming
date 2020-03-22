// 14
public class ForLoop {
	// Demo for For Loop

	public static void main(String[] args) {
		
		for(int counter = 1; counter <= 5; counter++) {
			System.out.println("Hello");
		}
		
		// Valid Syntax
		int c = 1;
		for(; c <= 5; c++) {
			System.out.println("World");
		}
		
		int x = 1;
		for(; x <= 5;) {
			System.out.println("Bye");
			x++;
		}
		
		// Valid Syntax but is an infinite loop
//		for(;;) {
//			
//		}

	}

}

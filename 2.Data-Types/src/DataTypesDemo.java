// 1
public class DataTypesDemo {

	public static void main(String[] args) {

		// Part 1
		byte b = 10;
		int in = 20;
		short sh = 30;
		long ln = 40;
		
		// b = sh;
		// b = in;
		// b = ln;
		
		sh = b;
		// sh = in;
		// sh = ln;
		
		in = b;
		in = sh;
		// in = ln;
		
		ln = b;
		ln = sh;
		ln = in;
		
		// Part 2
		b = 10; // byte b = (byte) 10; implicit conversion
		b = 127;
		// b = 128; cannot convert from int to byte b/c 128 is out of range
		b = (byte) 128; // explicit conversion
		System.out.println(b); // -128
		
		// Part 3
		in = 1000000000; // 10^9
		// in = 10000000000; 10^10 is out of range of int
		ln = 1000000000;
		// ln = 10000000000; This also gives error b/c 10^10 in an int by default
		ln = 10000000000L; // Add L to remove the problem
		System.out.println(ln);
		
		// Part 4
		// implicit conversion by default works for byte and short data types
		sh = 32000;
		
		// Part 5
		// float f = 5.5; cannot convert from double to float
		float f = 5.5f;
		System.out.println(f);
		
		double db = 6.5;
		
		// Part 6
		// in = f; cannot convert from float to int
		in = (int) f; // decimal part is removed and integer is stored
		System.out.println(in);
		
		f = in; // int is converted to float
		System.out.println(f);
		
		// Part 7
		boolean bit = true;
		// bit = 1; cannot convert from int to boolean
		
		if(bit) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Bye");
		}
		
		bit = false;
		if(bit) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Bye");
		}
		
		if(in>0) {
			System.out.println("Greater");
		}
		else {
			System.out.println("Lesser or equal");
		}
		
		// Part 8
		char ch = 'a';
		ch = 99;
		System.out.println(ch); // prints 'c'
		
		// ch = 64000;
		// System.out.println(ch);
		
		// ch = ch + 2; This is not valid
		ch = (char) (ch + 2);
		System.out.println(ch);
		
		in = ch;
		System.out.println(in);
		
		// ch = 68000;
		ch = (char) 68000;
		System.out.println(ch);
		
		// Part 9
		// Predict the output
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 5);
		System.out.println(2 + " " + 5);
		System.out.println("Hello" + '\t' + "World");
		System.out.println("Hello" + "\t" + "World");
		
		
		

	}

}

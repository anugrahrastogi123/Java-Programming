
public class Generics {

	public static void main(String[] args) {
		
		Integer[] arri = {10, 20 ,30 ,40};
		display(arri);
		
		String[] arrs = {"hello", "India", "Noida", "Delhi"};
		display(arrs);

	}

//	public static void display(String[] arr) {
//		
//		for(String val : arr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//		
//	}
//
//	public static void display(Integer[] arr) {
//
//		for(Integer val : arr) {
//			System.out.print(val + " ");
//		}
//		System.out.println();
//		
//	}
	
	// Generic function
	public static <T> void display(T[] arr) {
		
		for(T val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
	}

}


public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int[][] arr;
		arr = new int[3][3];
		
		int[][] a = new int[3][3];
		display(a);
		
		a[0][0] = 10;
		a[2][0] = 20;
		
		System.out.println("******");
		
		display(a);
		
		// int[][] b = new int[][3];
		int[][] b = new int[3][];
		
		// creating jagged array
		System.out.println("******");
		
		b[0] = new int[4];
		b[2] = new int[3];
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		// System.out.println(b[3]); // index out of bound exception
		
		// System.out.println(b[1][2]); // null pointer exception
		
		b[1] = new int[2];
		
		System.out.println("******");
		System.out.println("Jagged Array");
		display(b);

	}
	
	public static void display(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}

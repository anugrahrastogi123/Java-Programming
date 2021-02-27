import java.util.Comparator;

public class GenericBubbleSort {

	public static void main(String[] args) {

		Car[] cars = new Car[5];
		
		cars[0] = new Car(1000, 400, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(500, 900, "Black");
		cars[3] = new Car(300, 30, "Grey");
		cars[4] = new Car(700, 60, "White");
		
		// using Comparable
		// bubbleSort(cars);
		// display(cars);
		
		// using Comparator
		bubbleSort(cars, new CarSpeedComparator());
		display(cars);
		
		bubbleSort(cars, new CarPriceComparator());
		display(cars);
		
		bubbleSort(cars, new CarColourComparator());
		display(cars);

	}

	public static <T> void display(T[] arr) {

		for(T val : arr) {
			System.out.print(val);
		}
		System.out.println();
		
	}
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = 0; j < arr.length-1-i; j++) {
				
				if(arr[j].compareTo(arr[j+1]) > 0) {
					
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = 0; j < arr.length-1-i; j++) {
				
				if(comparator.compare(arr[j], arr[j+1]) > 0) {
					
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}

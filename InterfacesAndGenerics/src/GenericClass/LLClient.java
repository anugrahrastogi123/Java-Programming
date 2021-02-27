package GenericClass;

import CarClass.Car;

public class LLClient {

	public static void main(String[] args) {
		
		LinkedListGenerics<Car> list = new LinkedListGenerics<>();
		
		Car[] cars = new Car[5];
		
		cars[0] = new Car(1000, 400, "Red");
		cars[1] = new Car(2000, 200, "Yellow");
		cars[2] = new Car(500, 900, "Black");
		cars[3] = new Car(300, 30, "Grey");
		cars[4] = new Car(700, 60, "White");
		
		list.addLast(cars[0]);
		list.addLast(cars[1]);
		list.addLast(cars[2]);
		list.addLast(cars[3]);
		list.addLast(cars[4]);
		
		list.display();

	}

}

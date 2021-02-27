package CarClass;

public class Car { // implements Comparable<Car>
	
	int speed;
	int price;
	String colour;
	
	public Car(int speed, int price, String colour) {
		this.speed = speed;
		this.price = price;
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "Speed: " + this.speed + " Price: " + this.price + " Colour: " + this.colour + "\n";
	}

	// compare speed of two cars
//	@Override
//	public int compareTo(Car other) {
//		return this.speed - other.speed;
//		
//		// to compare colour
//		// return this.colour.compareTo(other.colour);
//	}

}

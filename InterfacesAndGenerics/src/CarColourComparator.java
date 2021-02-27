import java.util.Comparator;

public class CarColourComparator implements Comparator<Car>{
	
	@Override
	public int compare(Car tcar, Car ocar) { // tcar : this car ; ocar : other car
		
		return tcar.colour.compareTo(ocar.colour);
		
	}

}

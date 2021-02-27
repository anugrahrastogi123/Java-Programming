import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
	
	@Override
	public int compare(Car tcar, Car ocar) { // tcar : this car ; ocar : other car
		
		return ocar.price - tcar.price;
		
	}

}

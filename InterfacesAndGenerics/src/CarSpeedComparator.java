import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

	@Override
	public int compare(Car tcar, Car ocar) { // tcar : this car ; ocar : other car
		
		return tcar.speed - ocar.speed;
		
	}
	
	

}

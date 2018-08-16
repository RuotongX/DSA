package task1CarParking;
/**
 * This interface shown the method that user can be used, they will be overwrite in 
 * abstract class and basic class which have implement this interface.
 * @author RuotongXu
 *
 * @param <Car>
 */
public interface CarInterface<Car> {
	public Car get(int index);
	public void add(int index, Car car);
	public void remove(int index);
	public boolean hasCar(int index);
	public double timeCalculator(Car car);
	public void priceCalculator(double hour);
	public int AvaliableCar();
	public int OccupiedCar();
}

package task1CarParking;

public interface CarInterface<Car> {
	public Car get(int index);
	public void add(int index, Car car);
	public Car remove(int index);
	public boolean hasCar(int index);
	public double timeCalculator(Car car);
	public void priceCalculator(double hour);
	public int AvaliableCar();
	public int OccupiedCar();
}

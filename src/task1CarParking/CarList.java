package task1CarParking;
/**
 * This class has implement the abstract class and interface, and it create a list for car,
 * this details about How the list work I shown in the word file
 * @author RuotongXu
 *
 */

public class CarList extends AbstractCarList implements CarInterface<Car> {
	private Car[] cardata;
	private int size;
	public CarList() {
		this(20);
		elementCount = 0;
		size = 20;
	}
	public CarList(int initialCapacity) {
		if(initialCapacity < 0) 
			throw new IllegalArgumentException("Illegale Capacity: "+initialCapacity);
		this.cardata = new Car[initialCapacity];
		size = initialCapacity;
		elementCount = 0;
	}
	public Car get(int index) {
		rangeCheck(index);
		return(Car) cardata[index];
	}
	public Car set(int index,Car car) {
		rangeCheck(index);
		Car oldValue = (Car) cardata[index];
		cardata[index] = car;
		return oldValue;
	}
	private void rangeCheck(int index) {
		if(index>=size||index<0)
			throw new IndexOutOfBoundsException("Out Of Bound index");
	}
	public void add(int index, Car car) {
		rangeCheck(index);
		if(elementCount+1<size) {
			for(int i=elementCount-1;i>=index;i--) 
				cardata[i+1]=cardata[i];
				cardata[index] = car;
				elementCount++;
			
		} else {
			System.out.println("Sorry, this car park is full, this car information will not store in Car park system.");
		}
	}
	public void remove(int index) { 
        rangeCheck(index); 
        cardata[index]=null;
        elementCount --;
    }
	public boolean hasCar(int index) {
		rangeCheck(index);
		if(cardata[index] == null) {
			return false;
		}
		else {
			return true;
		}
	}
	public Car indexOf(int index) {
		rangeCheck(index);
		Car car = cardata[index];
		return car;
	}
	public int OccupiedCar() {
		return elementCount;
	}
	public int AvaliableCar() {
		return size-elementCount-1;
	}
	public int[] occupiedplace() {
		int[] op = new int[elementCount];
		int temp = 0;
		for(int i = 0;i<size;i++) {
			if(this.hasCar(i)) {
			   op[temp] = i;
			   temp++;
			}
		}
		return op;
	}
}

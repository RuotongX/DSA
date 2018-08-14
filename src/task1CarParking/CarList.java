package task1CarParking;

import java.time.LocalTime;
import java.util.Scanner;

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
		if(elementCount+1<=size) {
			for(int i=elementCount-1;i>=index;i--) {
				cardata[i+1]=cardata[i];
				cardata[index] = car;
				elementCount++;
			}
		}
	}
	public Car remove(int index) { 
        rangeCheck(index); 
        Car oldValue = (Car) cardata[index]; 
        for (int i=index; i<elementCount; i++)
                cardata[i]=cardata[i+1];

        cardata[--elementCount]=null;
        return oldValue; 
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
		return size-elementCount;
	}
	public int[] occupiedplace() {
		int[] op = new int[elementCount];
		int temp = 0;
		for(int i = 0;i<20;i++) {
			if(this.hasCar(i)) {
				op[temp] = i;
			}
		}
		return op;
	}
}

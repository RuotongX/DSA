package task1CarParking;
/**
 * This class is an abstract class which implements the interface, just like the assignment required.
 * @author RuotongXu
 *
 */
public abstract class AbstractCarList implements CarInterface<Car>{
	protected int elementCount;
	public boolean isEmpty() {
		return elementCount == 0;
	}
	public double timeCalculator(Car car) {
		String[] tokenStart = car.getStarttime().split(":");
		String[] tokenEnd = car.getEndtime().split(":");
		int timeStart = Integer.valueOf(tokenStart[0])*3600+
				Integer.valueOf(tokenStart[1])*60+
				Integer.valueOf(tokenStart[2]);
		int timeEnd = Integer.valueOf(tokenEnd[0])*3600+
				Integer.valueOf(tokenEnd[1])*60+
				Integer.valueOf(tokenEnd[2]);
		int parkTime = 0;
		double parkHour = 0;
		if(timeEnd<timeStart) {
			parkTime = 86400 - timeStart +timeEnd;
		}
		else {
			parkTime = timeEnd - timeStart;
		}
		parkTime = parkTime*100;
		parkHour = parkTime/3600;
		System.out.println("You have parked "+parkHour+" hours");
		return parkHour;
	}
	public void priceCalculator(double hour) {
		if(hour<=1&&hour>=0) {
			System.out.println("The parking price is $4");
		}
		else if(hour<=2&&hour>1) {
			System.out.println("The parking price is $8");
		}
		else if(hour<=3&&hour>2) {
			System.out.println("The parking price is $12");
		}
		else if(hour<=4&&hour>3) {
			System.out.println("The parking price is $16");
		}
		else if(hour<=5&&hour>4) {
			System.out.println("The parking price is $20");
		}
		else if(hour>5) {
			System.out.println("The parking price is $24");
		}
		else {
			System.out.println("The parking price is unknow, coz the parking hour is"+hour);
		}
	}
}

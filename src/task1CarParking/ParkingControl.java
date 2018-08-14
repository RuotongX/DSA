package task1CarParking;

import java.util.Scanner;

public class ParkingControl {
	public static void main(String[] args) {
		CarList carlist = new CarList();
		boolean keepparking = true;
		Scanner sc = new Scanner(System.in);
		while (keepparking == true) {
			System.out.println("Hi, please select what you want to do");
			System.out.println("1.Park your car.");
			System.out.println("2.Check the number of available car parks");
			System.out.println("3.Check the number of occupid car parks");
			System.out.println("4.Show all locations of the car park.");
			System.out.println("5.Check the parking time.");
			System.out.println("6.Leave and pay the cost.");
			System.out.println("7.Exit.");
			try {
				int order = sc.nextInt();
				switch (order) {
				case 1:
					parkcar(carlist);
					break;
				case 2:
					System.out.println("The available car parks is " + carlist.AvaliableCar());
					break;
				case 3:
					System.out.println("The occupid car parks is " + carlist.OccupiedCar());
					break;
				case 4:
					CarPark carpark = new CarPark(carlist);
					break;
				case 5:
					System.out.println("Please input your the number of the car on the car park");
					order = sc.nextInt()-1;
					if (carlist.hasCar(order)) {
						carlist.indexOf(order).EndParking();
						System.out.println("Car registration number " + carlist.indexOf(order).getRegistration());
						double time = carlist.timeCalculator(carlist.indexOf(order));
					} else {
						System.out.println("Sorry this car does not exsit");
					}
					break;
				case 6:
					System.out.println("Please input your the number of the car on the car park");
					order = sc.nextInt()-1;
					if (carlist.hasCar(order)) {
						carlist.indexOf(order).EndParking();
						System.out.println("Car registration number " + carlist.indexOf(order).getRegistration());
						double time = carlist.timeCalculator(carlist.indexOf(order));
						carlist.priceCalculator(time);
						carlist.remove(order);
					} else {
						System.out.println("Sorry this car does not exsit");
					}
					break;
				case 7:
					keepparking = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid input");
				System.err.println(e);
			}
		}
	}

	private static void parkcar(CarList carlist) {
		boolean occ = false;
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		System.out.println("Please input your car registration number");
		try {
			int number = sc.nextInt();
			car.setRegistration(number);
			System.out.println("Please type the place that you want to park.");
			CarPark carpark = new CarPark(carlist);
			while (occ == false) {
				number = sc.nextInt();
				if (carlist.hasCar(number-1)) {
					occ = false;
					System.out.println("This place has car! please input another place");
				} else {
					occ = true;
				}
			}
			carlist.add(number-1, car);
			car.StartParking();
			
			CarPark carpark1 = new CarPark(carlist);
			System.out.println("Parking successfully! You park time is " + car.getStarttime());
		} catch (Exception e) {
			System.out.println("Invaild input");
			System.err.println(e);
		}
	}
}

package task1CarParking;
/**
 * This class is used to display the car park( how many car in the car park and which position that car lies)
 * The console output screen shot will show in the word file.
 * @author RuotongXu
 *
 */
public class CarPark {
	private int column = 19;
	private String[] park = new String[column];

	public CarPark(CarList carlist) {
		for (int j = 0; j < column; j++) {
			int temp = j + 1;
			park[j] = temp + "";
		}
		for (int k = 0; k < carlist.elementCount; k++) {
			park[carlist.occupiedplace()[k]] = "OCCUP";
		}
		for (int c = 0; c < column; c++) {
			System.out.print("["+this.park[c]+"]");
		}
		System.out.println();
	}
}

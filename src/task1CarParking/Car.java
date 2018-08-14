package task1CarParking;

import java.time.LocalTime;

public class Car {
	private String starttime;
	private String endtime;
	private int time;
	private int cost;
	private int row;
	private int column;
	private int registration;
	private boolean occupied;
	
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public void StartParking() {
		LocalTime localTime = LocalTime.now(); 
		this.setStarttime(localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond());
	}
	public void EndParking() {
		LocalTime localTime = LocalTime.now(); 
		this.setStarttime(localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond());
	}
}

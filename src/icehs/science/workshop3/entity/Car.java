package icehs.science.workshop3.entity;

public class Car extends Vehicle{
	
	private int mileage;
	
	

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 평균연비: " + mileage + "km/l");
	}
}

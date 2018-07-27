package icehs.science.workshop3.entity;

public class Airplane extends Vehicle {
	
	private Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine){
		super(modelName, maxSpeed, numberLimit);
		this.numOfEngine = numOfEngine;
	}
	
	private int numOfEngine;

	public int getNumOfEngine() {
		return numOfEngine;
	}



	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}


	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}

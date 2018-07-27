package icehs.science.workshop3.entity;

public class Ship extends Vehicle{
	
	private int replacement;
	
	

	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

	

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 배수량: " + replacement + "톤");
	}
}
package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
		
	public void moveElevator() {
		System.out.println("엘리베이터를"+ totalFloor +"층 까지 운영합니다.");
	}
	
	public void changeAddress(String newAddress) {
		address = newAddress;

	}

}

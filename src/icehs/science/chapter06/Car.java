package icehs.science.chapter06;

public class Car {
	String name = "ICE카";
	int oilAmount;
	double distance;
	
//	출발지와 목적지 그리고 거리를 받아서 계산하는 메서드
	void driveCar(String start, String end, double driveDistance) {
		distance += driveDistance;
		oilAmount -= (driveDistance / 20);
		System.out.println(start +"에서 "+ end +"까지 "+ driveDistance +"km 주행하였습니다.");
	}
//	기름 주유 메서드
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("휘발유 "+ oil +"L 주유합니다.");
	}
//	남은 기름으로 갈 수 있는 거리를 계산하는 메서드
	void calculateDrivingDistance(){
		System.out.println("주행 가능한 거리는 약"+ ((double)oilAmount * 20) +"km 입니다.");
	}
//	자동차의 정보를 출력해주는 메서드
	void printCarInfo() {
		System.out.println("["+ name +"~] 남은 기름의 양 "+ oilAmount +"L, 총 주행거리 :"+ distance +"km");
	}

}

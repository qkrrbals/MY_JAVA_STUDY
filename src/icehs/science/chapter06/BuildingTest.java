package icehs.science.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building sunin = new Building();
		sunin.name = "���ΰ�";
		sunin.address = "��ȭ��";
		sunin.totalFloor = 4;
		
		System.out.println("�ǹ��� : " + sunin.name);
		System.out.println("�ּ� : " + sunin.address);
		System.out.println("��ü ���� : " + sunin.totalFloor);
		
		sunin.moveElevator();
		sunin.changeAddress("�ڹ���");
		System.out.println("�ּ� : " + sunin.address);
		
		
		Building inhwa = new Building();
		inhwa.name = "��ȭ����";
		inhwa.address = "��ȭ��";
		inhwa.totalFloor = 5;
		
		System.out.println("�ǹ��� : " + inhwa.name);
		System.out.println("�ּ� : " + inhwa.address);
		System.out.println("��ü���� : " + inhwa.totalFloor);
		
		inhwa.moveElevator();
		inhwa.changeAddress("��ȭ��");
		System.out.println("�ּ� : " + inhwa.address);
		
		
		
		
		

	}

}

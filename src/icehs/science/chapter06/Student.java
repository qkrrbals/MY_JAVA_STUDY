package icehs.science.chapter06;

public class Student {
	String name;
	String stuID;
	int korean;
	int english;
	int math;
	double average;
	
	void calculateAVG() {
		average = (double)(korean + english + math) / 3;
		System.out.println("��� : " + average);
	}
	
	void printStudentInfo() {
		System.out.println("�л��� : " + name);
		System.out.println("�й� :" + stuID);
		System.out.println("���� ���� :" + korean);
		System.out.println("���� ���� :" + english);
		System.out.println("���� ����:" + math);
	}
	
	void changeStudentID(String newStuID) {
		stuID = newStuID;
	}

}

package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int gildongScore = 92;
		
		if(gildongScore >= 90 && gildongScore <= 100) {
			System.out.println("A�����Դϴ�.");
		} else if (gildongScore >= 80 && gildongScore <90) {
			System.out.println("B�����Դϴ�.");
		} else if (gildongScore >= 70 && gildongScore <80) {
			System.out.println("C�����Դϴ�.");
		} else if (gildongScore >= 60 && gildongScore <70) {
			System.out.println("D�����Դϴ�.");
		} else if (gildongScore < 60 && gildongScore >= 0) {
			System.out.println("F�����Դϴ�.");
		} else {
			System.out.println("������ �� ���� �����ϴ�. ������ �߸��Է��ϼ̽��ϴ�.");
		}

	}

}

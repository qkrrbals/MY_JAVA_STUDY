package iches.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int firstNum = 2;
		int secondNum = 3;
		int thirdNum = 4;
		int forthNum = 5;
		int fifthNum = 23;
		int sixthNum = 96;
		int seventhNum = 4;
		int eighthNum = -3;
		
		int result = firstNum * secondNum;
		
		if(result >= 100) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : ������ Ȯ������ �ʽ��ϴ�.");
		}
		
		firstNum = thirdNum;
		secondNum = forthNum;
		result = firstNum * secondNum;
		
		if(result >= 100) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : ������ Ȯ������ �ʽ��ϴ�.");
		}
		
		firstNum = fifthNum;
		secondNum = sixthNum;
		result = firstNum * secondNum;
		
		if(result >= 100) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : ������ Ȯ������ �ʽ��ϴ�.");
		}
		
		firstNum = seventhNum;
		secondNum = eighthNum;
		result = firstNum * secondNum;
		
		if(result >= 100) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : ���ڸ����Դϴ�.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : ������ Ȯ������ �ʽ��ϴ�.");
		}

	}

}

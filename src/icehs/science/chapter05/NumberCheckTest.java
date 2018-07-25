package icehs.science.chapter05;

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
			System.out.println(firstNum + " * " + secondNum + " : 세자리수입니다.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : 두자리수입니다.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : 한자리수입니다.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : 음수는 확인하지 않습니다.");
		}
		
		firstNum = thirdNum;
		secondNum = forthNum;
		result = firstNum * secondNum;
		
		if(result >= 100) {
			System.out.println(firstNum + " * " + secondNum + " : 세자리수입니다.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : 두자리수입니다.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : 한자리수입니다.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : 음수는 확인하지 않습니다.");
		}
		
		firstNum = fifthNum;
		secondNum = sixthNum;
		result = firstNum * secondNum;
		
		if(result >= 100) {
			System.out.println(firstNum + " * " + secondNum + " : 세자리수입니다.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : 두자리수입니다.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : 한자리수입니다.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : 음수는 확인하지 않습니다.");
		}
		
		firstNum = seventhNum;
		secondNum = eighthNum;
		result = firstNum * secondNum;
		
		if(result >= 100) {
			System.out.println(firstNum + " * " + secondNum + " : 세자리수입니다.");
		} else if(result >= 10) {
			System.out.println(firstNum + " * " + secondNum + " : 두자리수입니다.");
		} else if(result > 0) {
			System.out.println(firstNum + " * " + secondNum + " : 한자리수입니다.");
		} else {
			System.out.println(firstNum + " * " + secondNum + " : 음수는 확인하지 않습니다.");
		}

	}

}

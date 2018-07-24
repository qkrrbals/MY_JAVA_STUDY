package iches.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		int hundNumber = number / 100;
		int tenNumber = number % 100 / 10;
		int oneNumber = number % 10;
		
		System.out.println("숫자 : " + number);
		System.out.println("백의 자리 수 : " + hundNumber);
		System.out.println("십의 자리 수 : " + tenNumber);
		System.out.println("일의 자리 수 : " + oneNumber);

	}

}

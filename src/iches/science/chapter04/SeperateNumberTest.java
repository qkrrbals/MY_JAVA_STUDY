package iches.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		int hundNumber = number / 100;
		int tenNumber = number % 100 / 10;
		int oneNumber = number % 10;
		
		System.out.println("���� : " + number);
		System.out.println("���� �ڸ� �� : " + hundNumber);
		System.out.println("���� �ڸ� �� : " + tenNumber);
		System.out.println("���� �ڸ� �� : " + oneNumber);

	}

}

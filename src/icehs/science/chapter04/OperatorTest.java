package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int number = 64;
		
		boolean isJjak = number % 2 ==0;
		boolean isMultiOf3 = number % 3 == 0;
		boolean isMultiOf2and7 = (number % 2 == 0) && (number % 7 == 0);
		boolean isMultiOf2or7 = (number % 2 == 0) || (number % 7 == 0);
				
		
		System.out.println("¦���Դϱ�? : " + isJjak);
		System.out.println("3�� ����Դϱ�? : " + isMultiOf3);
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : " + isMultiOf2and7);
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : " + isMultiOf2or7);

	}

}

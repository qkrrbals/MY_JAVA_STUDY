package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumTotal = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
//		짝수와 홀수의 합을 for문과 if문을 사용해서 구성하시오.
		for(int i =1; i <= 1000; i++) {
			if(i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		
		sumTotal = sumOdd + sumEven;
		
		System.out.println("1부터 1000까지의 합 : " + sumTotal);
		System.out.println("1부터 1000까지 짝수의 합 : " + sumEven);
		System.out.println("1부터 1000까지 홀수의 합 : " + sumOdd);

	}

}

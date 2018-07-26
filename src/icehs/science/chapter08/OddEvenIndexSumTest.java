package icehs.science.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int [] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		int oddSum = 0;	//홀수번째 수 합계
		int evenSum = 0;	//짝수번째 수 합계
		
		for(int i = 0; i < arr.length; i++) {
			if((i+1) % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		System.out.println("홀수 번째 정수의 합 : "+ oddSum);
		System.out.println("짝수 번째 정수의 합 : "+ evenSum);
	}

}

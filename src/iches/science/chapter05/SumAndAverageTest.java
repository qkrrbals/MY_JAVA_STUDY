package iches.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= 500; i++) {
			sum += i;
		}
//		Æò±Õ±¸ÇÏ´Â ½Ä
		avg = (double)sum / 500;
		
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + avg);

	}

}

package icehs.science.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int j = 1;
		
		while(sum <= 100) {
			if(i % 5 == 0) {
				sum += i;
				System.out.println(j + ". ( + " + i +")" + sum);
				j++;
			}
			i++;
		}

	}

}

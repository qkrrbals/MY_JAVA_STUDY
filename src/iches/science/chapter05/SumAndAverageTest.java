package iches.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= 500; i++) {
			sum += i;
		}
//		��ձ��ϴ� ��
		avg = (double)sum / 500;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);

	}

}

package iches.science.chapter05;
// 1부터 100까지 점수를 출력한다.
public class ForEx {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);

	}

}

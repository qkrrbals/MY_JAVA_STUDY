package iches.science.chapter05;

// 나이가 19세 이상이면 "입장하세요." 라는 문자열을 출력하려고 한다.
public class ConditionIfEx {

	public static void main(String[] args) {
		int age =20;
		
		if (age < 19) {
			System.out.println("19세 이상만 입장 가능합니다.");
			System.out.println("죄송합니다.");
		}
		
		if (age >= 19) {
			System.out.println("성인입니다.");
			System.out.println("입장하세요.");
		}

	}

}

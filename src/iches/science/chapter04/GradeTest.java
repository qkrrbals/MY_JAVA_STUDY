package iches.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int score = 75;
		
		boolean aGrade = (score >= 90) && (score <= 100);
		boolean bGrade = (score >= 80) && (score <= 89);
		boolean cGrade = (score >= 70) && (score <= 79);
		boolean dGrade = (score >= 60) && (score <= 69);
		
		System.out.println("A학점 : " + aGrade);
		System.out.println("B학점 : " + bGrade);
		System.out.println("c학점 : " + cGrade);
		System.out.println("D학점 : " + dGrade);

	}

}

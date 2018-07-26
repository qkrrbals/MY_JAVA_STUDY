package icehs.science.chapter07;

public class personTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.NUMBER_OF_PERSONS++;
		System.out.println("사람 수 : "+ p1.NUMBER_OF_PERSONS);
		System.out.println("이름 : "+ p1.name);
		
		Person p2 = new Person();
		p2.name = "홍길순";
		p2.NUMBER_OF_PERSONS++;
		System.out.println("사람 수 : "+ p2.NUMBER_OF_PERSONS);
		System.out.println("이름 : "+ p2.name);
		
		Person p3 = new Person();
		p3.name = "홍길기";
		p3.NUMBER_OF_PERSONS++;
		System.out.println("사람 수 : "+ p3.NUMBER_OF_PERSONS);
		System.out.println("이름 : "+ p3.name);
		
		System.out.println(p1.NUMBER_OF_PERSONS);
		System.out.println(p2.NUMBER_OF_PERSONS);
		System.out.println(p3.NUMBER_OF_PERSONS);
	}

}

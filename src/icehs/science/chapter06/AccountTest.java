package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account gildong = new Account();
		gildong.accName = "ȫ�浿";
		gildong.accNo = "123-456789";
		gildong.balance = 10000;
		gildong.printAccountInfo();
		
		System.out.println("20000���� �Ա��մϴ�.");
		gildong.deposit(20000);
		
		System.out.println("�ܾ� : "+ gildong.balance +"��");
		
		System.out.println("-20000���� �Ա��մϴ�.");
		gildong.deposit(-20000);
		
		System.out.println("�ܾ� : "+ gildong.balance +"��");
		
		System.out.println("-20000���� ����մϴ�.");
		gildong.withdraw(-20000);
		
		System.out.println("�ܾ� : "+ gildong.balance +"��");
		
		System.out.println("45000���� ����մϴ�.");
		gildong.withdraw(45000);
		
		System.out.println("�ܾ� : "+ gildong.balance +"��");

	}

}

package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "아메리카노";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee makiatto = new Coffee();
		makiatto.name = "마키아또";
		makiatto.price = 4500;
		
		int totalPrice = americano.getPrice() + latte.getPrice() + makiatto.getPrice();
		
		System.out.println("총 금액 : "+ totalPrice +"원");

	}

}

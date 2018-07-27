package icehs.science.chapter10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile[] mo = {new Galaxy(),
				new IPhone()
		};
		
		mo[0].setProduction("Galaxy");
		((Galaxy)mo[0]).setOsVersion("안드로이드 오레오");
		mo[0].call(5);
		mo[0].charge(30);
		
		mo[1].setProduction("IPhone");
		((IPhone)mo[1]).setColor("흰색");
		mo[1].call(10);
		mo[1].charge(15);
		
	}
}

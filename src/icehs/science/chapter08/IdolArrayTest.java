package icehs.science.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol[] idols = new Idol[4];
		
		idols[0] = new Idol("소녀시대", "태연");
		idols[1] = new Idol("시스타", "보라");
		idols[2] = new Idol("빅뱅", "지드래곤");
		idols[3] = new Idol("비스트", "양요섭");
		
		for(int i = 0; i < idols.length; i++) {
			System.out.println(idols[i].getGroup() + " : " + idols[i].getName());
		}
	/*	
		System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
		System.out.println(idols[1].getGroup() + " : " + idols[1].getName());
		System.out.println(idols[2].getGroup() + " : " + idols[2].getName());
		System.out.println(idols[3].getGroup() + " : " + idols[3].getName());*/
	}
}

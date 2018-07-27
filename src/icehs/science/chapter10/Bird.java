package icehs.science.chapter10;

public class Bird extends Animal implements Flyable {
	private String habitat;
	public Bird(String kind, int age, String habitat) {
		super(age, kind);
		this.habitat =habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void Fly() {
		System.out.println("날개를 펼친다.");
		
	}
	@Override
	public void spreadWinds() {
		System.out.println("날아간다.");
		
	}
	
}

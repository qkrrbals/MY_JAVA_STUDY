package icehs.science.chapter10;

public class IPhone extends Mobile {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println(this.getProduction() +" : "+ this.color);
	}
	
	@Override
	public void charge(int time) {
		System.out.println(this.getProduction() +" : 보조배터리 "+ time +"분 충전");
	}
}

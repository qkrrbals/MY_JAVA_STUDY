package icehs.science.chapter08;

public class Student {
	private String name;
	private String stuId;
	private String phoneNo;
	
	public Student(String name, String stuId, String phoneNo) {
		super();
		this.name = name;
		this.stuId = stuId;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}

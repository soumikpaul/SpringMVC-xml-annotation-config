package com.example.Student;

public class Student {
	private String name;
	private int StdId,age;
	gender g;
	private enum gender{
		Male, Female;
	};
	public String getName() {
		return name;
	}
	public void setGender(gender gender)
	{
		this.g=gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "I am "+this.name+" age is "+this.age+" ID is "+this.StdId+" gender "+this.g;
	}
	
}

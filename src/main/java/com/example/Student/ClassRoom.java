package com.example.Student;

public class ClassRoom {
	Student st1;
	private Student[] s;
	public void setStudents(Student[] students) {
		this.s = students;
	}
	public void display() {

		for(Student std: s) {
			System.out.println(std);
			//System.out.println(std.getName());
		}
	}
}

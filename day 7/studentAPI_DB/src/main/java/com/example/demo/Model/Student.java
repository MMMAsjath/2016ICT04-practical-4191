package com.example.demo.Model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	@Id
	private String studentid;
	@Column(name="student_name")
	private String name;
	private int age;
	private double GPA;
	private String course;
	
	public Student()
	{}
	
	public Student(String studentid, String name, int age, double gPA, String course) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		GPA = gPA;
		this.course = course;
	}
	
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}

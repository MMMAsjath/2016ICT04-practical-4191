package com.example.demo.Model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Student {

	@Id
	private String id;
	private String lastname;
	private String firstmidname;
	private String entrollmentDate;
	@OneToMany(mappedBy = "student")
	private List<Entrolment> entrollments;
	
	public Student()
	{}
	public Student(String id, String lastname, String firstmidname, String entrollmentDate,
			List<Entrolment> entrollments) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstmidname = firstmidname;
		this.entrollmentDate = entrollmentDate;
		this.entrollments = entrollments;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstmidname() {
		return firstmidname;
	}
	public void setFirstmidname(String firstmidname) {
		this.firstmidname = firstmidname;
	}
	public String getEntrollmentDate() {
		return entrollmentDate;
	}
	public void setEntrollmentDate(String entrollmentDate) {
		this.entrollmentDate = entrollmentDate;
	}
	public List<Entrolment> getEntrollments() {
		return entrollments;
	}
	public void setEntrollments(List<Entrolment> entrollments) {
		this.entrollments = entrollments;
	}
	
	
	
}

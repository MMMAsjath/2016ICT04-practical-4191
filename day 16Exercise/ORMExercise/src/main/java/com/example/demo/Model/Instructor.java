package com.example.demo.Model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Instructor {
	
	@Id
	private String id;
	private String lastname;
	private String firstmidname;
	private String hireDate;
	
	@OneToMany(mappedBy = "instructor")
	private List<Department> departments;
	
	@OneToOne(mappedBy = "instructor")
	private OfficeAssinment officeassignment;
	
	
	
	
	
	private List<Course> courses;

	public Instructor() {}

	public Instructor(String id, String lastname, String firstmidname, String hireDate, List<Department> departments,
			OfficeAssinment officeassignment, List<Course> courses) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstmidname = firstmidname;
		this.hireDate = hireDate;
		this.departments = departments;
		this.officeassignment = officeassignment;
		this.courses = courses;
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



	public String getHireDate() {
		return hireDate;
	}



	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}



	public List<Department> getDepartments() {
		return departments;
	}



	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}



	public OfficeAssinment getOfficeassignment() {
		return officeassignment;
	}



	public void setOfficeassignment(OfficeAssinment officeassignment) {
		this.officeassignment = officeassignment;
	}



	public List<Course> getCourses() {
		return courses;
	}



	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	



}

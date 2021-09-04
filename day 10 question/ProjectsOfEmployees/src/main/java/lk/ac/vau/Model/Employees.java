package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employees {
	
	@Id
	private int Eid;
	private String name;
	private String type;
	private Double salary;
	@ManyToOne
	@JoinColumn(name= "project ID", referencedColumnName = "PID")
	private project proj;
	
	
	
	public Employees()
	{}
	public Employees(int eid, String name, String type, Double salary) {
		super();
		Eid = eid;
		this.name = name;
		this.type = type;
		this.salary = salary;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}

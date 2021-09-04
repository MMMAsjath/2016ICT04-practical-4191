package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
	private int Id;
	private String Name;
	private String Designation;
	private String Emp_type;
	
	public Employee()
	{}

	public Employee(int id, String name, String designation, String emp_type) {
		super();
		Id = id;
		Name = name;
		Designation = designation;
		Emp_type = emp_type;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getEmp_type() {
		return Emp_type;
	}

	public void setEmp_type(String emp_type) {
		Emp_type = emp_type;
	}
}

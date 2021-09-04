package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private int Id;
	private String Name;
	private String Faculty;
	private int NoofStaff;
	
	public Department()
	{}

	public Department(int id, String name, String faculty, int noofStaff) {
		super();
		Id = id;
		Name = name;
		Faculty = faculty;
		NoofStaff = noofStaff;
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

	public String getFaculty() {
		return Faculty;
	}

	public void setFaculty(String faculty) {
		Faculty = faculty;
	}

	public int getNoofStaff() {
		return NoofStaff;
	}

	public void setNoofStaff(int noofStaff) {
		NoofStaff = noofStaff;
	}
}

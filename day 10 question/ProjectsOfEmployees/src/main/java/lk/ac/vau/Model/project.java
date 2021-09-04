package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class project {
	
	@Id
	private String PID;
	private String Pname;
	
	
	@OneToMany(mappedBy = "proj") 
	public List<Employees> employees;
	
	@OneToOne(mappedBy = "proj")
	public List<Client> client;
	
	public project(String pID, String pname) {
		super();
		PID = pID;
		Pname = pname;
		
		
	}


	public String getPID() {
		return PID;
	}


	public void setPID(String pID) {
		PID = pID;
	}


	public String getPname() {
		return Pname;
	}


	public void setPname(String pname) {
		Pname = pname;
	}
	
	

}

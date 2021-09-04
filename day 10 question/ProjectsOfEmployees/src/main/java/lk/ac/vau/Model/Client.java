package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	private int CID;
	private String Cname;
	
	
	public Client(String cname, int cID) {
		super();
		Cname = cname;
		CID = cID;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}
	
	

}

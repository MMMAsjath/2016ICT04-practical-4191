package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {
	@Id
	@GeneratedValue
	private long ID;
	@ManyToOne
	@JoinColumn(name="W_ID",referencedColumnName = "workerId")
	private Worker workerr;
	@ManyToOne
	@JoinColumn(name="B_ID",referencedColumnName = "buildinId")
	private Building buildingg;
	
	private int workingHours;
	private int payment;
	
	public Assignment()
	{}
	
	
	
	public Assignment(long iD, Worker workerr, Building buildingg, int workingHours, int payment) {
		super();
		ID = iD;
		this.workerr = workerr;
		this.buildingg = buildingg;
		this.workingHours = workingHours;
		this.payment = payment;
	}



	public long getID() {
		return ID;
	}



	public void setID(long iD) {
		ID = iD;
	}



	public Worker getWorkerr() {
		return workerr;
	}



	public void setWorkerr(Worker workerr) {
		this.workerr = workerr;
	}



	public Building getBuildingg() {
		return buildingg;
	}



	public void setBuildingg(Building buildingg) {
		this.buildingg = buildingg;
	}



	public int getWorkingHours() {
		return workingHours;
	}



	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}



	public int getPayment() {
		return payment;
	}



	public void setPayment(int payment) {
		this.payment = payment;
	}
	

}

package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Building {
	@Id
	private String buildinId;
	private String address;
	private int floor;
	@OneToMany(mappedBy = "buildingg")
	private List<Assignment>worker;
	
	public Building()
	{}

	public Building(String buildinId, String address, int floor, List<Assignment> worker) {
		super();
		this.buildinId = buildinId;
		this.address = address;
		this.floor = floor;
		this.worker = worker;
	}

	public String getBuildinId() {
		return buildinId;
	}

	public void setBuildinId(String buildinId) {
		this.buildinId = buildinId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public List<Assignment> getWorker() {
		return worker;
	}

	public void setWorker(List<Assignment> worker) {
		this.worker = worker;
	}
	
	
	

}

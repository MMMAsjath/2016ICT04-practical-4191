package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Worker {
	@Id
	private String workerId;
	private String name;
	private String job;
	
	@OneToMany(mappedBy = "workerr")
	private List<Assignment>buildings;
	
	public Worker()
	{}
	
	public Worker(String workerId, String name, String job, List<Assignment> buildings) {
		super();
		this.workerId = workerId;
		this.name = name;
		this.job = job;
		this.buildings = buildings;
	}


	public String getWorkerId() {
		return workerId;
	}


	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public List<Assignment> getBuildings() {
		return buildings;
	}


	public void setBuildings(List<Assignment> buildings) {
		this.buildings = buildings;
	}
	
	
	

}

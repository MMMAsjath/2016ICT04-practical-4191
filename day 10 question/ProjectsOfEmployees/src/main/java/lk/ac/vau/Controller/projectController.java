package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import lk.ac.vau.Model.project;
import lk.ac.vau.Repo.projectRepo;

@RestController
public class projectController {
	
	@Autowired
	projectRepo context;
	
	@GetMapping
	public List<project> getAll()
	{
		return context.findAll();
	}
	
	
	
	@GetMapping("/{id}")
	public project get(@PathVariable("id") String PID)
	{
		return context.findById(PID).get();
	}
	
	@PostMapping
	public void add(@RequestBody project cl)
	{
		context.save(cl);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String PId)
	{
		context.deleteById(PId);
	}

}

package com.example.demo.Controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Repo.studentRepo;

@RestController
//@Produces(MediaType.application_XML)
@RequestMapping("/student")
public class studentController {
	@Autowired
	studentRepo context;
	@GetMapping
	public List<Student> getAll()
	{
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id)
	{
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Student student)
	{
		context.save(student);
	}
	
	@PutMapping
	public void update(@RequestBody Student student)
	{
		context.save(student);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		context.deleteById(id);
	}
		
	

}

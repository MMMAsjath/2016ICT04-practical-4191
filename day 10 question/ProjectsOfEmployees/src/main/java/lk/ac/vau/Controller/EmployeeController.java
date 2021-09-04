package lk.ac.vau.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Employees;
import lk.ac.vau.Repo.EmployeesRepo;

@RestController
@RequestMapping("/Employees")

public class EmployeeController {
	
	@Autowired
	EmployeesRepo context;
	
	
	@GetMapping("/{id}")
	public Employees get(@PathVariable("id") int eid)
	{
		return context.findById(eid).get();
	}
	
	@PostMapping
	public void add(@RequestBody Employees employees)
	{
		context.save(employees);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int eid)
	{
		context.deleteById(eid);
	}

}

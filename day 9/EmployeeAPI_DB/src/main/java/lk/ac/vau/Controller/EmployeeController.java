package lk.ac.vau.Controller;

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

import lk.ac.vau.Model.Employee;
import lk.ac.vau.Repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo context;
	@GetMapping
	
	public List<Employee> getAll()
	{
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee get(@PathVariable("id") Integer id)
	{
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Employee employee)
	{
		context.save(employee);
	}
	
	@PutMapping
	public void update(@RequestBody Employee employee)
	{
		context.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id)
	{
		context.deleteById(id);
	}
	
}

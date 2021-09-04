package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Client;
import lk.ac.vau.Repo.ClientRepo;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	ClientRepo context;
	
	@GetMapping
	public List<Client> getAll()
	{
		return context.findAll();
	}
	
	
	
	@GetMapping("/{id}")
	public Client get(@PathVariable("id") int DID)
	{
		return context.findById(DID).get();
	}
	
	@PostMapping
	public void add(@RequestBody Client cl)
	{
		context.save(cl);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer CId)
	{
		context.deleteById(CId);
	}
	

}

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

import com.example.demo.Model.Comment;
import com.example.demo.Repo.CommentRepo;





@RestController
@RequestMapping("/comment")


public class CommentController {
	
	@Autowired
	CommentRepo context;
	
	@GetMapping
	public List<Comment> getAll()
	{
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Comment get(@PathVariable("id") long id)
	{
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Comment comment)
	{
		context.save(comment);
	}
	
	@PutMapping
	public void update(@RequestBody Comment user)
	{
		context.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id)
	{
		context.deleteById(id);
	}
}

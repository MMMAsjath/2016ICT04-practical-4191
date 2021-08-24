package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Message;

@RestController

public class MessageController {
	
	@GetMapping("/helmsg")
	public Message getMessage()
	{
		return new Message(1, "Hello springboot");
	}
	
	@GetMapping("/helmsg/{m}")
	public Message myMessage(@PathVariable("m") String message)
	{
		return new Message(1,message);
	}
	@GetMapping("/sum/{n1}/{n2}")
	public double sum(@PathVariable("n1") double num1,@PathVariable("n2") double num2)
	{
		return num1+num2;
	}

}

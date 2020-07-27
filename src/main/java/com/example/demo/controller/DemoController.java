package com.example.demo.controller;

import com.example.demo.repo.Demo;
import com.example.demo.repo.DemoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoRepository repository;
	
	@PostMapping("/create")
	public Demo createDemo(@RequestBody Demo demo){
		return repository.save(demo);
	}
	
	@GetMapping("/{id}")
	public Optional<Demo> getDemo(@PathVariable String id){
		return repository.findById(id);
	}
}

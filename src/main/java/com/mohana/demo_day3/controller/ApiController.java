package com.mohana.demo_day3.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohana.demo_day3.model.*;
import com.mohana.demo_day3.service.*;

@RestController
public class ApiController {

	@Autowired
	serve sev;
	
	@PostMapping("setDetails")
	public Employee add(@RequestBody Employee e) {
		return sev.setValues(e);
	}
	
	@GetMapping("/showDetails")
	public List<Employee> show(){
		return sev.showValues();
	}
	
	@GetMapping("/showEmployee/{id}")
	public Optional<Employee> showEmployee(@PathVariable(value = "id") int id) {
		return sev.showEmployee(id);
	}
}

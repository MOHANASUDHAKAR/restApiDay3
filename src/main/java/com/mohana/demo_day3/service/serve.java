package com.mohana.demo_day3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohana.demo_day3.model.*;
import com.mohana.demo_day3.repository.*;

@Service
public class serve {

	@Autowired
	Rep er;
	
	public Employee setValues(Employee e) {
		return er.save(e);
	}
	
	public List<Employee> showValues() {
		return er.findAll();
	}
	
	public Optional<Employee> showEmployee(int id) {
		return er.findById(id);
	}
}

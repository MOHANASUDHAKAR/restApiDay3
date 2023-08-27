package com.mohana.demo_day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohana.demo_day3.model.*;

public interface Rep extends JpaRepository<Employee, Integer> {

}

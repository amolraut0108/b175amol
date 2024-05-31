package com.cjc.Employee_Mangement_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.Employee_Mangement_App.model.Employee;
import com.cjc.Employee_Mangement_App.servicei.EmployeeI;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeI ei;

	@PostMapping("/createEmployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee ee) {

		Employee employee = ei.saveEmployee(ee);

		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}

}

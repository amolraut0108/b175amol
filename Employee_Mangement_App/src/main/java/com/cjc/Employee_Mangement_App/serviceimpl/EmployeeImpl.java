package com.cjc.Employee_Mangement_App.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Employee_Mangement_App.model.Employee;
import com.cjc.Employee_Mangement_App.repository.EmployeeRepository;
import com.cjc.Employee_Mangement_App.servicei.EmployeeI;

@Service
public class EmployeeImpl implements EmployeeI {
	
	@Autowired
	EmployeeRepository  er;

	@Override
	public Employee saveEmployee(Employee ee) {
		
		Employee emp = er.save(ee);

		
		return emp;
	}
	

}

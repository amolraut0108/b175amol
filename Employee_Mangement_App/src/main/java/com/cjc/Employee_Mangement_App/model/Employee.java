package com.cjc.Employee_Mangement_App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	
    @Id
	private int empid;
	private String empName;
	private String empAddress;
	private String empMobileno;

}

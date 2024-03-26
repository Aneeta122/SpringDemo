package com.example.demo.model;

import com.example.demo.CustomValidator.CustomValidation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employee_data")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	private Integer employee_id;
	@NotNull
	@Size(min=3, max=30)
	 @NotBlank(message = "firstname is mandatory")
	private String firstname;
	 @NotBlank(message = "lastname is mandatory")
	 @Size(min=3, max=30)
	private String lastname;
    @NotNull
//	 @DecimalMin
//		(value= "0.1",message= "Age must be greater than 0.1")
//	 @DecimalMax
//		(value= "100.12",message= "Age must be greater than 0.1")
//		
////     @DecimalMin(value= "0.1",message= "Age must be greater than 0.1")
    
    @CustomValidation
     private java.math.BigDecimal employee_age;
//	 private static final String AGE_PATTERN = "";  // Regex for a number with decimal part between 0.1 and 0.12
		

	public Integer getId() {
		return employee_id;
	}

	public void setId(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
//	public void setAgeFromString(@Pattern(regexp = AGE_PATTERN, message = "Invalid age format") String age) {
//        this.employee_age = new BigDecimal(age);
//    }

	public java.math.BigDecimal getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(java.math.BigDecimal employee_age) {
		this.employee_age = employee_age;
	}

}

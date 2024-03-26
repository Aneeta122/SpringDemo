package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	 @Autowired
    private  EmployeeRepository empRepository ;
    
  
   
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Employee> getAllUsers() {
      // This returns a JSON or XML with the users
      return empRepository.findAll();
    }
//   
//    	@PostMapping(path = "/add") // Map ONLY POST Requestsy
//    	 ResponseEntity<@Valid Employee> addUser(@Valid @RequestBody Employee emp,BindingResult bindingResult) {
//    		if (bindingResult.hasErrors()) {
//                return ResponseEntity.badRequest().body(emp);
//            }
//            
//            return ResponseEntity.ok(emp);
//        }
//    	@PostMapping(path = "/add") // Map ONLY POST Requests
//        public @ResponseBody Employee addNewEmployee( @Valid @RequestBody Employee emp) {
//            return empRepository.save(emp);
//            
//        }
    	@PostMapping(path = "/add")
    	ResponseEntity<Employee> addSalary(@Valid @RequestBody Employee emp) {
            Employee savedData = empRepository.save(emp);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedData);
    	}
//    		

}


package com.knolx.springsecurity;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * @author Anuradha
 *
 */
@RestController
public class EmployeeController {
    
  public EmployeeController() { 

  }
  
  //method returns list of employee.
  @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
    return Arrays.asList(
                new Employee(1432, "anuradha", "kumari", "anuradha.kumari@knoldus.com"));  
  }
} 


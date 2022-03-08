package com.knolx.springsecurity;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringsecurityApplicationTests {

  @Autowired
  private EmployeeController employeeController;
  
  public SpringsecurityApplicationTests() { 

  }

  //create list of employee
  Employee employee = new Employee(1432, "anuradha", "kumari", "anuradha.kumari@knoldus.com");
  List<Employee> list = Arrays.asList(employee);

  @Test
  void contextLoads() {
      
    //check firstName.
    Assertions.assertEquals(list.get(0).getFirstName(), employeeController.getAllEmployee()
             .get(0).getFirstName());
    
    //check lastName
    Assertions.assertEquals(list.get(0).getLastName(), employeeController.getAllEmployee()
             .get(0).getLastName());
  }
}

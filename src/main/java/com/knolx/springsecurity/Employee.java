package com.knolx.springsecurity;

/**
 * Hero is the main entity we'll be using to . . ..
 * 
 * @author Anuradha
 *
 */

public class Employee {


  public Employee() { 

  }

  /** Creates an employee with the specified name.
   * @param id The employee's id.
   * @param lastName The employee’s last name.
   * @param firstName The employee’s first name.
   * @param email The employee's email.
  */  
  public Employee(final Integer id, final String firstName, final String lastName,
       final String email) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  private Integer id;
  private String firstName;
  private String lastName;
  private String email;


  //getters and setters
  public Integer getId() {
    return id;
  }
 
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
 
  public String getLastName() {
    return lastName;
  }
   
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public String getEmail() {
    return email;
  }
  
  public void setEmail(final String email) {
    this.email = email;
  }

  //Overriding toString() method
  @Override
    public String toString() {
    return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
  }

}

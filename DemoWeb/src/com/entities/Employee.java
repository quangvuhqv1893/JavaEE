/**
 *
 */

package com.entities;

/**
 * @description: .
 * @author User
 * @create: Dec 4, 2017
 */
public class Employee {
  private String employeeID;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String gender;
  private String description;
  private String vehicle;
  private String way;
  private String img;
  
  
  /**
   * @return the employeeID to set
   */
  public String getEmployeeID() {
    return employeeID;
  }
  /**
   * @param employeeID the employeeID to set
   */
  public void setEmployeeID(String employeeID) {
    this.employeeID = employeeID;
  }
  /**
   * @return the firstName to set
   */
  public String getFirstName() {
    return firstName;
  }
  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  /**
   * @return the lastName to set
   */
  public String getLastName() {
    return lastName;
  }
  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  /**
   * @return the phoneNumber to set
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }
  /**
   * @param phoneNumber the phoneNumber to set
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  /**
   * @return the gender to set
   */
  public String getGender() {
    return gender;
  }
  /**
   * @param gender the gender to set
   */
  public void setGender(String gender) {
    this.gender = gender;
  }
  /**
   * @return the description to set
   */
  public String getDescription() {
    return description;
  }
  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }
  /**
   * @return the vehicle to set
   */
  public String getVehicle() {
    return vehicle;
  }
  /**
   * @param vehicle the vehicle to set
   */
  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }
  /**
   * @return the way to set
   */
  public String getWay() {
    return way;
  }
  /**
   * @param way the way to set
   */
  public void setWay(String way) {
    this.way = way;
  }
  /**
   * @return the img to set
   */
  public String getImg() {
    return img;
  }
  /**
   * @param img the img to set
   */
  public void setImg(String img) {
    this.img = img;
  }
  /**
   * @description: .
   * @author User
   * @create: Dec 4, 2017
   * @modifier:
   * @modified date:
   * @param firstName
   * @param lastName
   * @param phoneNumber
   * @param gender
   * @param description
   * @param vehicle
   * @param way
   * @param img
   */
  public Employee(String employeeID,String firstName, String lastName, String phoneNumber, String gender, String description,
      String vehicle, String way, String img) {
    super();
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
    this.description = description;
    this.vehicle = vehicle;
    this.way = way;
    this.img = img;
  }
  /**
   * @description: .
   * @author User
   * @create: Dec 4, 2017
   * @modifier:
   * @modified date:
   */
  public Employee() {
    super();
  }

}

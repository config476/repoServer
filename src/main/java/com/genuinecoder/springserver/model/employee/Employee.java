package com.genuinecoder.springserver.model.employee;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "Username")
  private String name;
  @Column(name = "Time")
  private String location;
  @Column(name = "Activity")
  private String branch;

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  @Column(name = "PackageName")
  private String salary;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", Username='" + name + '\'' +
        ", Time='" + location + '\'' +
        ", Activity='" + branch + '\'' +
        ", Location='" + salary + '\'' +
        '}';
  }
}

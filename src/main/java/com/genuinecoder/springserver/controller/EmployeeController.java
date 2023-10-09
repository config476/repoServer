package com.genuinecoder.springserver.controller;

import com.genuinecoder.springserver.model.employee.Employee;
import com.genuinecoder.springserver.model.employee.EmployeeDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

  @Autowired
  private EmployeeDao employeeDao;

  @GetMapping("/employee/get-all")
  public List<Employee> getAllEmployees() {
    return employeeDao.getAllEmployees();
  }

  @GetMapping("/employee/get-all2")
  public String getAllEmployees(Model model) {
    List<Employee> employees = employeeDao.getAllEmployees();
    model.addAttribute("employees", employees);
    System.out.println("Number of employees: " + employees.size()); // Add this line
    return "employees";
  }

  @PostMapping("/employee/save")
  public Employee save(@RequestBody Employee employee) {
    return employeeDao.save(employee);
  }



}

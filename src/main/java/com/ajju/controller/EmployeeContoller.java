package com.ajju.controller;

import com.ajju.entities.Employee;
import com.ajju.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeContoller {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/home")
    public String home()
    {
        return "welcome to Employee Management System";
    }

    @PostMapping("/addEmp")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.addEmployee(employee);
    }

    @GetMapping("/Allemployees")
    public List<Employee> getAllEmployee()
    {
        return this.employeeService.getAllEmployee();
    }

    @GetMapping("/Allempoyees/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return this.employeeService.getEmpById(id);
    }

    @PutMapping("/AllEmployees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/AllEmployees/{id}")
    public void  deleteEmployee(@PathVariable String id)
    {
        employeeService.deleteEmployee(id);

    }
}

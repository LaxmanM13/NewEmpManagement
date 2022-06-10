package com.ajju.service;

import com.ajju.entities.Employee;

import java.util.List;

public interface EmployeeService {


    public List<Employee> getAllEmployee();
    
    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public String deleteEmployee(String  id);

    Employee getEmpById(String id) throws Exception ;
}

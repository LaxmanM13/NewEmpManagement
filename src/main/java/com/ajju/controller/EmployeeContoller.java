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

//    @PostMapping("/addEmp")
    @RequestMapping(value = "/addEmp", method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.addEmployee(employee);
    }

    @GetMapping("/Allemployees")
    public List<Employee> getAllEmployee()
    {
        return this.employeeService.getAllEmployee();
    }
    
    
    
//    @GetMapping("/employees")
//  public Employee getEmployee() throws Exception {
//      return this.employeeService.getEmpById("301");
//  }
//    
    
//    @GetMapping("/employees")
//  public Employee getEmployee() throws Exception {
//      return this.employeeService.getEmpById("62a05d963746ea41b29972e1");
//  }
//    

    @GetMapping("/Allemployees/{id}")
    public Employee getEmployee(@PathVariable ("id")String id) throws Exception {
        return this.employeeService.getEmpById(id);
    }

    @PutMapping("/Allemployees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.updateEmployee(employee);
    }

  @DeleteMapping("/Allemployees/{id}")
   // @RequestMapping(value = "/Allemployees/{id}", method = RequestMethod.DELETE)
    public String  deleteEmployee(@PathVariable("id") String id)
 {
       return employeeService.deleteEmployee(id);
       

   }
}

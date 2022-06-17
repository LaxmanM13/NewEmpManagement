package com.ajju.controller;

import com.ajju.entities.Employee;

import com.ajju.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeContoller {
	
//	@Autowired
//	private EmployeeService employeeService;
//	

    private final EmployeeService employeeService;
  
	public EmployeeContoller(EmployeeService employeeService) {
	 
	this.employeeService = employeeService;
}

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

    public String  deleteEmployee(@PathVariable("id") String id)
 {
       return employeeService.deleteEmployee(id);
       

   }
}

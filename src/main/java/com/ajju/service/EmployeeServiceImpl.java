package com.ajju.service;

import com.ajju.entities.Employee;
import com.ajju.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();
    }
//
//    @Override
//    public Employee getEmpById(String id) {
//
//        return employeeRepository.findById(id).get();
//    }
//    
    @Override
    public Employee getEmpById(String id) throws Exception {
        Optional<Employee> employee =employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else {
            throw new Exception("Product not found");
        }
    }
    

  @Override
  public Employee addEmployee(Employee employee) {
      return employeeRepository.save(employee);
  }
 @Override
  public Employee updateEmployee(Employee employee) {
      return employeeRepository.save(employee);
   }

    @Override
    public String deleteEmployee(String  id) {
        employeeRepository.deleteById(id);
        return "Deleted sucessfully";

    }
}

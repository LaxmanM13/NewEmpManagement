package com.ajju.repository;

import com.ajju.entities.Employee;


import java.util.Optional;

//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface EmployeeRepository extends MongoRepository<Employee, String> {
//
//}

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
}
package crudoperation.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import crudoperation.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

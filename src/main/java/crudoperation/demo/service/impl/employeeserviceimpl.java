package crudoperation.demo.service.impl;



import java.util.List;


import org.springframework.stereotype.Service;

import crudoperation.demo.exception.ResourceUnavailable;
import crudoperation.demo.model.Employee;
import crudoperation.demo.repository.employeerepository;
import crudoperation.demo.service.employeeservice;

@Service
public class employeeserviceimpl implements employeeservice{

	private employeerepository employeeRepository;
	
	public employeeserviceimpl(employeerepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {

		return employeeRepository.findById(id).orElseThrow(() -> 
						new ResourceUnavailable("Employee", "Id", id));
		
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		
		
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				() -> new ResourceUnavailable("Employee", "Id", id)); 
	
	existingEmployee.setFirstName(employee.getFirstName());
	existingEmployee.setLastName(employee.getLastName());
	existingEmployee.setEmail(employee.getEmail());
		
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.findById(id).orElseThrow(() -> 
								new ResourceUnavailable("Employee", "Id", id));
		employeeRepository.deleteById(id);
	}
	
}
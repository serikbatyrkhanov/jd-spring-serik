package com.serik;

import com.serik.repository.DepartmentRepository;
import com.serik.repository.EmployeeRepository;
import com.serik.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SerikApplication {

	@Autowired
	RegionRepository regionRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SerikApplication.class, args);
	}

	@PostConstruct
	public void testEmployees(){

		System.out.println("---------Employee start------------");

		System.out.println(employeeRepository.getEmployeeDetail());

		System.out.println(employeeRepository.getEmployeeSalary());

		System.out.println(employeeRepository.getEmployeeByEmail("dtrail8@tamu.edu"));

		System.out.println(employeeRepository.getEmployeeByEmailAndSalary("dtrail8@tamu.edu", 82753));

		System.out.println(employeeRepository.getEmployeeBySalary(82753));

		System.out.println(employeeRepository.getEmployeeByFirstNameOrSalary("dtrail8@tamu.edu", 82753));

		employeeRepository.updateEmployeeJPQL(1);

		System.out.println(employeeRepository.getEmployeeDetail());
		System.out.println(employeeRepository.getEmployeeSalary());
		System.out.println(employeeRepository.getEmployeeByEmail("myakovlivf@ucsd.edu").get());
		employeeRepository.updateEmployeeJPQL(1);

		System.out.println(employeeRepository.retrieveEmployeeSalaryGreaterThan(100000));

		System.out.println(departmentRepository.findOzzyDepartment("Kids"));

		System.out.println(departmentRepository.countAllDepartments());
		System.out.println("---------Employee End------------");

	}
}

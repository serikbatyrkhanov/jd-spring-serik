package com.derivedqueries.repository;

import com.derivedqueries.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmail(String email);

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    List<Employee> findByFirstNameIsNot(String firstName);

    List<Employee> findByLastNameStartingWith(String lastName);

    List<Employee> findBySalaryGreaterThan(Integer salary);

    List<Employee> findAllByHireDateBetween(LocalDate date1, LocalDate date2);

    List<Employee> findByEmailIsNull();



}

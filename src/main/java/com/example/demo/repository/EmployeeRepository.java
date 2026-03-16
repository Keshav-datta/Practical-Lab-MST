package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentAndSalaryGreaterThan(String department, double salary);

    List<Employee> findTop3ByOrderBySalaryDesc();
}
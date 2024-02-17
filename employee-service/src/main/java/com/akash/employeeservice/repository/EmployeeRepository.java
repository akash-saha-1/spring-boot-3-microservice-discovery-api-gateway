package com.akash.employeeservice.repository;

import com.akash.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public Employee add(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee findById(Long id){
        return employees.stream().filter(emp -> emp.id().equals(id)).findFirst().orElse(null);
    }

    public List<Employee> findAll() {
        return employees;
    }

    public List<Employee> findByDepartment(Long departmentId){
        return employees.stream().filter(emp -> emp.departmentId().equals(departmentId)).toList();
    }
}


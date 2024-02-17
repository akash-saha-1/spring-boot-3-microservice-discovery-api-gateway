package com.akash.departmentservice.repository;

import com.akash.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DepartmentRepository {

    private List<Department> departments = new ArrayList<>();

    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }

    public Department findById(Long id){
        return departments.stream().filter(dept -> dept.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Department> findAll() {
        return departments;
    }
}

package com.mftplus.automationsystem.organization.service;

import com.mftplus.automationsystem.organization.model.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);
    void deleteDepartment(Department department);
    void updateDepartment(Department department);
    List<Department> findAllDepartments();
    Department findDepartmentById(Long id);
    List<Department> findDepartmentByTitle(String title);
    List<Department> findByParentDepartment(Department department);
    List<Department> findDepartmentByTitleParentDepartment(String title);

}

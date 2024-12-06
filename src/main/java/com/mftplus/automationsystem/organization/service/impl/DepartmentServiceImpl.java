package com.mftplus.automationsystem.organization.service.impl;

import com.mftplus.automationsystem.organization.model.Department;
import com.mftplus.automationsystem.organization.repository.DepartmentRepository;
import com.mftplus.automationsystem.organization.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);

    }

    @Override
    public void deleteDepartment(Department department) {
//        if(department.getChildDepartmentList().isEmpty()) {
//            departmentRepository.delete(department);
//        }
    }

    @Override
    public void updateDepartment(Department department) {
        departmentRepository.save(department);

    }

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Department> findDepartmentByTitle(String title) {
        return departmentRepository.findByTitleIsLike(title);
    }

    @Override
    public List<Department> findByParentDepartment(Department department) {
        return null; //departmentRepository.findByParentDepartmentId(department.getId());
    }

    @Override
    public List<Department> findDepartmentByTitleParentDepartment(String title) {
        return null; //departmentRepository.findByParentDepartment_TitleIsLike(title);
    }


}

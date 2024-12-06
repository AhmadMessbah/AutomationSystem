package com.mftplus.automationsystem.organization.repository;

import com.mftplus.automationsystem.organization.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByTitleIsLike(String title);
    List<Department> findByParentDepartmentId(Long parentSectionId);
    List<Department> findByParentDepartment_TitleIsLike(String parentSectionTitle);
    Department findById(long id);


}

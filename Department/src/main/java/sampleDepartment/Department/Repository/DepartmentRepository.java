package sampleDepartment.Department.Repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sampleDepartment.Department.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


}

package sampleDepartment.Department.Service;

import java.util.List;

import sampleDepartment.Department.Entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getAllDepartments();

}

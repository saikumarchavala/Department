package sampleDepartment.Department.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sampleDepartment.Department.Entity.Department;
import sampleDepartment.Department.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
    @Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
//		department.setAddMore(department.getAddMore());
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		List<Department> deparment =departmentRepository.findAll();   
		return deparment;
}
}

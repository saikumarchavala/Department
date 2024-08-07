package com.Infosys.in.Sample.of.Messaging.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infosys.in.Sample.of.Messaging.Entity.Department;
import com.Infosys.in.Sample.of.Messaging.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		
		department.setDepartmentName(department.getDepartmentName());
		department.setDepartmentId(department.getDepartmentId());
		department.setDepartmentAddress(department.getDepartmentAddress());
		department.setDepartmentCode(department.getDepartmentCode());
		department.setDate(department.getDate());
		
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).get();
	}

/*	@Override
	public List<Department> updateAllDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepository.update();
	}*/


	

}

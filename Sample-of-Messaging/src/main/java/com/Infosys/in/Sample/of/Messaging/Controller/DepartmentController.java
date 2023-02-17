package com.Infosys.in.Sample.of.Messaging.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Infosys.in.Sample.of.Messaging.Entity.Department;
import com.Infosys.in.Sample.of.Messaging.Entity.User;
import com.Infosys.in.Sample.of.Messaging.Service.DepartmentService;
import com.Infosys.in.Sample.of.Messaging.Service.UserService;

@RestController
public class DepartmentController {
	
	
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/departments",produces="{application/json}")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/departments")
	public List<Department> getAllDepartmentList(){
		return departmentService.getAllDepartmentList();
	}
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable ("id") Long departmentId ) {
    	return departmentService.getDepartmentById(departmentId);
    }
	@PostMapping("/value")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
    
    
    
    
    /*@PutMapping("/departments/{id}")
	public List<Department> updateAllDepartmentList() {
		try {
			Department dp=new Department();
			((DepartmentService) dp.DepartmentService).updateAllDepartmentList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dp;
	}
	@PutMapping("/departments/{id}")
	public Department updateDepartmentById(@PathVariable ("id") Long departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}
//	@DeleteMapping("/departments/{id}")
//	public Department deleteDepartementById(@PathVariable ("id") Long departmentId) {
//		return departmentService.deleteDepartmentById(departmentId);
//	}*/
	
	
}

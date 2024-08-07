package com.Infosys.in.Sample.of.Messaging.Controller;

import java.util.List;

import org.apache.log4j.SimpleLayout;
import org.slf4j.LoggerFactory;
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

import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.Layout;

@RestController
public class DepartmentController {
	
	private static Logger logger=(Logger) LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private UserService userService;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		logger.info("Post method of Department Controller Class");
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/departments")
	public List<Department> getAllDepartmentList(){
		logger.debug("Get method of DepartmentController");
		SimpleLayout layout=new SimpleLayout();
		Appender ap=new ConsoleAppender();
		
		return departmentService.getAllDepartmentList();
	}
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable ("id") Long departmentId ) {
    	logger.warn("GetById method of Department Controler");
    	return departmentService.getDepartmentById(departmentId);
    }
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		logger.trace("Post Mapping of User");
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

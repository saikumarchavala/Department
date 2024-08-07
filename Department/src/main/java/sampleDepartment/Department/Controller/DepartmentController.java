package sampleDepartment.Department.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sampleDepartment.Department.Entity.Department;
import sampleDepartment.Department.Service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping( value="/departments")
	public Department saveDepartment(@RequestBody Department department) {
		Date date=department.getDate();
	    SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	    String date1=outputDateFormat.format(date);
	    try {
			Date date2=new SimpleDateFormat("DD-MM-YYYY").parse(date1);
			department.setDate(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping(value="/all")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}
    
	
	
	
	
}

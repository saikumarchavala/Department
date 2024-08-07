package com.Infosys.in.Sample.of.Messaging.Dto;

import com.Infosys.in.Sample.of.Messaging.Entity.Department;
import com.Infosys.in.Sample.of.Messaging.Entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponse {
	private Department department;
	private User user;
	
	

}

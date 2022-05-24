package com.capgemini.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.dto.DepartmentDto;
import com.capgemini.model.dto.OperatorDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
		
			@Autowired
			private AdminService adminService;
			
			@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
			//public boolean addDepartment(@RequestBody DepartmentDto dept) {
			public Response<DepartmentDto> addDepartment(@RequestBody DepartmentDto dept){
				return adminService.addDepartment(dept);
			}
			
			@DeleteMapping()
			public Response <DepartmentDto>removeDepartment(@RequestBody int deptId) {
				return adminService.removeDepartment(deptId);
			}
			
			@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
			public Response<DepartmentDto> modifyDepartment(@RequestBody DepartmentDto dept){
				return adminService.modifyDepartment(dept);
			}
			
			@GetMapping(value="/{departmentId}", produces = MediaType.APPLICATION_JSON_VALUE)
			public Response<DepartmentDto> findByDepartmentId(@PathVariable("deptId") int deptId){
				return adminService.findByDepartmentId(deptId);
			}
			
			@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
			public boolean addOperator(@RequestBody OperatorDto operator) {
				return adminService.addOperator(operator);
			}
			
			@DeleteMapping(value="/{operatorId}", produces = MediaType.APPLICATION_JSON_VALUE)
			public boolean removeOperator(@PathVariable("operatorId") Integer operatorId) {
				return adminService.removeOperator(operatorId);
			}
			
			@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
			public Response<OperatorDto> modifyOperator(@RequestBody OperatorDto operator){
				return adminService.modifyOperator(operator);
			}
			
			@GetMapping(value="/{operatorId}", produces = MediaType.APPLICATION_JSON_VALUE)
			public Response<List<OperatorDto>> findOperatorById(@PathVariable("operatorId") int operatorId){
				return adminService.findOperatorById(operatorId);
			}
			
			@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
			public Response<List<OperatorDto>> findAllOperators(){
				return adminService.findAllOperators();
			}
			
}

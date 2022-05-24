package com.capgemini.model.service;

import java.util.List;

import com.capgemini.model.dto.DepartmentDto;
import com.capgemini.model.dto.OperatorDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.entity.Department;

public interface AdminService {
		public boolean addDepartment(DepartmentDto dept);
		public Response<DepartmentDto> removeDepartment(int deptId);
		public Response<DepartmentDto> modifyDepartment(DepartmentDto dept);
		public Response<DepartmentDto> findByDepartmentId(int deptId);
		public boolean addOperator(OperatorDto operator);
		public boolean removeOperator(int operatorId);
		public Response<OperatorDto> modifyOperator(OperatorDto operator);
		public Response<List<OperatorDto>> findOperatorById(int operatorId);
		public Response<List<OperatorDto>> findAllOperators();
		Response<Department> addDepartment(Department department);
		
}

package com.capgemini.model.service;

import java.util.List;

import com.capgemini.model.dto.DepartmentDto;
import com.capgemini.model.dto.OperatorDto;
import com.capgemini.model.dto.Response;

public interface AdminService {
		public boolean addDepartment(DepartmentDto dept);
		public boolean removeDepartment(int deptId);
		public Response<DepartmentDto> modifyDepartment(DepartmentDto dept);
		public Response<DepartmentDto> findByDepartmentId(int deptId);
		public boolean addOperator(OperatorDto operator);
		public boolean removeOperator(int operatorId);
		public Response<OperatorDto> modifyOperator(OperatorDto operator);
		public Response<OperatorDto> findOperatorById(int operatorId);
		public Response<List<OperatorDto>> findAllOperators();
		
}

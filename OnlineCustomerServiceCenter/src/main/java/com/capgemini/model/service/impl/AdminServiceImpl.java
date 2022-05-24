package com.capgemini.model.service.impl;

import java.util.List;

import com.capgemini.model.dto.DepartmentDto;
import com.capgemini.model.dto.OperatorDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public boolean addDepartment(DepartmentDto dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeDepartment(int deptId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<DepartmentDto> modifyDepartment(DepartmentDto dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<DepartmentDto> findByDepartmentId(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addOperator(OperatorDto operator) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeOperator(int operatorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<OperatorDto> modifyOperator(OperatorDto operator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<OperatorDto> findOperatorById(int operatorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<List<OperatorDto>> findAllOperators() {
		// TODO Auto-generated method stub
		return null;
	}

}

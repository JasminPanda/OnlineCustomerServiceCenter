package com.capgemini.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Operator;

import com.capgemini.model.dao.DepartmentDao;
import com.capgemini.model.dao.OperatorDao;
import com.capgemini.model.dto.AppError;
import com.capgemini.model.dto.DepartmentDto;
import com.capgemini.model.dto.OperatorDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.entity.Department;
import com.capgemini.model.entity.OperatorEntity;
import com.capgemini.model.service.AdminService;



@Service
public class AdminServiceImpl implements AdminService {

	
    @Autowired
    private DepartmentDao deparmentDao;
    @Autowired
	private Department department;
    @Autowired
    private OperatorDao operatorDao;
    @Autowired
    private OperatorEntity operator;
    
		
		public Response<DepartmentDto> addDepartment(DepartmentDto dept) {
		Response<Department> response=new Response<>();	
		
	 try {
     Department entity=new Department();
     entity.setDepartmentId(department.getDeptId());
	 entity.setDepartmentName(department.getDeptName());
	 
		deparmentDao.save(entity);
		Department newDepartment= new Department();
		newDepartment.setDepartmentId(entity.getDeptId());
		newDepartment.setDepartmentName(entity.getDeptName());
		response.setData(department);
	
	 } catch(Exception e) {
		 AppError error = new AppError();
			error.setCode("ERR_ADD_DEPARTMENT");
			error.setMessage(e.getMessage());
		 
	 }
		return null;
	}

	@Override
	public Response<DepartmentDto> removeDepartment(int deptId) {
		Response<Department> response=new Response<>();	
		
		 try {
	     Department entity=new Department();
	     entity.setDepartmentId(department.getDeptId());
		 entity.setDepartmentName(department.getDeptName());
		 
			deparmentDao.save(entity);
			Department newDepartment= new Department();
			newDepartment.setDepartmentId(entity.getDeptId());
			newDepartment.setDepartmentName(entity.getDeptName());
			response.setData(department);
		
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_ADD_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		return null;
	}

	@Override
	public Response<DepartmentDto> modifyDepartment(DepartmentDto dept) {
		Response<Department> response=new Response<>();	
		
		 try {
	     Department entity=new Department();
	     entity.setDepartmentId(department.getDeptId());
		 entity.setDepartmentName(department.getDeptName());
		 
			deparmentDao.save(entity);
			Department newDepartment= new Department();
			newDepartment.setDepartmentId(entity.getDeptId());
			newDepartment.setDepartmentName(entity.getDeptName());
			response.setData(department);
		
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_Modify_DEPARTMENT");
				error.setMessage(e.getMessage());
		 } 
		
		return null;
	}

	@Override
	public Response<DepartmentDto> findByDepartmentId(int deptId) {
		Response<Department> response=new Response<>();	
		
		 try {
	     Department entity=new Department();
	     entity.setDepartmentId(department.getDeptId());
		 entity.setDepartmentName(department.getDeptName());
		 
			deparmentDao.save(entity);
			Department newDepartment= new Department();
			newDepartment.setDepartmentId(entity.getDeptId());
			newDepartment.setDepartmentName(entity.getDeptName());
			response.setData(department);
		
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_FINDING_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		return null;
	}

	@Override
	public boolean addOperator(OperatorDto operator) {
		Response<OperatorDto> response=new Response<>();	

		 try {
	    OperatorEntity entity=new  OperatorEntity();
	     entity.setOperatorId(operator.getOperatorId());
	     entity.setFirstName(operator.getFirstName());
	     entity.setLastName(operator.getLastName());
	     entity.setEmail(operator.getEmail());
	     entity.setMobile(operator.getMobile());
	     entity.setCity(operator.getCity());
	     
			OperatorDto.save(entity);
			 OperatorEntity newOperator= new OperatorEntity();
			
			((OperatorEntity) newOperator).setOperatorId(entity.getOperatorId());
			newOperator.setFirstName(entity.getFirstName());
			newOperator.setLastName(entity.getLastName());
			newOperator.setEmail(entity.getEmail());
			newOperator.setMobile(entity.getMobile());
			newOperator.setCity(entity.getCity());
			response.setData(department);
			
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_ADD_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		return false;
	}

	@Override
	public boolean removeOperator(int operatorId) {
		Response<OperatorDto> response=new Response<>();	

		 try {
	    OperatorEntity entity1=new  OperatorEntity();
	     entity1.setOperatorId(operator.getOperatorId());
	     entity1.setFirstName(operator.getFirstName());
	     entity1.setLastName(operator.getLastName());
	     entity1.setEmail(operator.getEmail());
	     entity1.setMobile(operator.getMobile());
	     entity1.setCity(operator.getCity());
	     
			OperatorDto.save(entity1);
			 OperatorEntity newOperator= new OperatorEntity();
			
			((OperatorEntity) newOperator).setOperatorId(entity1.getOperatorId());
			newOperator.setFirstName(entity1.getFirstName());
			newOperator.setLastName(entity1.getLastName());
			newOperator.setEmail(entity1.getEmail());
			newOperator.setMobile(entity1.getMobile());
			newOperator.setCity(entity1.getCity());
			response.setData(department);
			
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_ADD_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		return false;
	}

	@Override
	public Response<OperatorDto> modifyOperator(OperatorDto operator) {
		Response<OperatorDto> response=new Response<>();	
		
		 try {
	    OperatorEntity entity=new  OperatorEntity();
	     entity.setOperatorId(operator.getOperatorId());
	     entity.setFirstName(operator.getFirstName());
	     entity.setLastName(operator.getLastName());
	     entity.setEmail(operator.getEmail());
	     entity.setMobile(operator.getMobile());
	     entity.setCity(operator.getCity());
	     
			OperatorDto.save(entity);
			 OperatorEntity newOperator= new OperatorEntity();
			newOperator.setOperatorId(entity.getOperatorId());
			newOperator.setFirstName(entity.getFirstName());
			newOperator.setLastName(entity.getLastName());
			newOperator.setEmail(entity.getEmail());
			newOperator.setMobile(entity.getMobile());
			newOperator.setCity(entity.getCity());
			response.setData(operator);
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_MODIFY_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		return null;
	}

	@Override
	public Response<List<OperatorDto>>findOperatorById(int operatorId) {
		Response<OperatorDto> response=new Response<>();	
		
		 try {
	    
			 List<OperatorEntity> entities= operatorDao.findAll();
			List<Operator> operators= new ArrayList<>();
			 if(entities != null) {
				 for(OperatorEntity   entity: entities) {
				 OperatorEntity newOperator= new OperatorEntity();
					
					newOperator.setOperatorId(entity.getOperatorId());
					newOperator.setFirstName(entity.getFirstName());
					newOperator.setLastName(entity.getLastName());
					newOperator.setEmail(entity.getEmail());
					newOperator.setMobile(entity.getMobile());
					newOperator.setCity(entity.getCity());
					operators.add(null);
				 }
				 
			 }
			 response.setData(department);	
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_GETTING_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		
		
		return null;
	}

	@Override
	public Response<List<OperatorDto>> findAllOperators() {
		Response<OperatorDto> response=new Response<>();
		 try {
			    
			 List<OperatorEntity> entities= operatorDao.findAll();
			List<Operator> operators= new ArrayList<>();
			 if(entities != null) {
				 for(OperatorEntity   entity: entities) {
				 OperatorEntity newOperator= new OperatorEntity();
					
					newOperator.setOperatorId(entity.getOperatorId());
					newOperator.setFirstName(entity.getFirstName());
					newOperator.setLastName(entity.getLastName());
					newOperator.setEmail(entity.getEmail());
					newOperator.setMobile(entity.getMobile());
					newOperator.setCity(entity.getCity());
					operators.add(null);
				 }
				 
			 }
			response.setData(department);	
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_GETTING_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		
		
		return null;
	
	}

}

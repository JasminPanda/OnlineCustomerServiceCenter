package com.capgemini.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import org.hibernate.hql.internal.ast.util.ASTIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Operator;
import org.springframework.stereotype.Service;


import com.capgemini.model.dao.AdminDao;
import com.capgemini.model.dao.OperatorDao;
import com.capgemini.model.dto.AppError;
import com.capgemini.model.dto.DepartmentDto;
import com.capgemini.model.dto.OperatorDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.entity.Department;
import com.capgemini.model.entity.OperatorEntity;
import com.capgemini.model.service.AdminService;

import com.capgemini.model.service.dao.DepartmentDao;
>>>>>>> branch 'main' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
@Service
public class AdminServiceImpl implements AdminService {
<<<<<<< HEAD

	
=======
    @Autowired
    private DepartmentDao deparmentDao;
	private Department department;
    
>>>>>>> branch 'main' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
	@Override
<<<<<<< HEAD
	public boolean addDepartment(DepartmentDto dept) {

		return false;
=======
	public Response<Department> addDepartment(Department department) {
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
		return response;
>>>>>>> branch 'main' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
	}

	@Override
	public Response<DepartmentDto> removeDepartment(int deptId) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		Response<OperatorDto> response=new Response<>();	

		 try {
	    OperatorEntity entity=new  OperatorEntity();
	     entity.setOperatorID(operator.getOperatorId);
	     entity.setFirstName(operator.getFirstName);
	     entity.setLastName(operator.getLastName);
	     entity.setEmail(operator.getEmail);
	     entity.setMobile(operator.getMobile);
	     entity.setCity(operator.getCity);
	     
			OperatorDto.save(entity);
			 OperatorEntity newOperator= new OperatorEntity();
			
			((OperatorEntity) newOperator).setOperatorID(entity.getOperatorId());
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
		// TODO Auto-generated method stub
		Response<OperatorDto> response=new Response<>();	

		 try {
	    OperatorEntity entity=new  OperatorEntity();
	     entity.setOperatorID(operator.getOperatorId);
	     entity.setFirstName(operator.getFirstName);
	     entity.setLastName(ASTIterator.getLastName);
	     entity.setEmail(operator.getEmail);
	     entity.setMobile(operator.getMobile);
	     entity.setCity(operator.getCity);
	     
			OperatorDto.save(entity);
			 OperatorEntity newOperator= new OperatorEntity();
			
			((OperatorEntity) newOperator).setOperatorID(entity.getOperatorId());
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
	public Response<OperatorDto> modifyOperator(OperatorDto operator) {
		// TODO Auto-generated method stub
		Response<OperatorDto> response=new Response<>();	
		
		 try {
	    OperatorEntity entity=new  OperatorEntity();
	     entity.setOperatorID(operator.getOperatorId);
	     entity.setFirstName(operator.getFirstName);
	     entity.setLastName(operator.getLastName);
	     entity.setEmail(operator.getEmail);
	     entity.setMobile(operator.getMobile);
	     entity.setCity(operator.getCity);
	     
			OperatorDto.save(entity);
			 OperatorEntity newOperator= new OperatorEntity();
			newOperator.setOperatorID(entity.getOperatorId());
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
		// TODO Auto-generated method stub
		Response<OperatorDto> response=new Response<>();	
		
		 try {
	    
			 List<OperatorEntity> entities= Operator.findAll();
			List<Operator> operators= new ArrayList<>();
			 if(entities != null) {
				 for(OperatorEntity   entity: entities) {
				 OperatorEntity newOperator= new OperatorEntity();
					
					newOperator.setOperatorID(entity.getOperatorId());
					newOperator.setFirstName(entity.getFirstName());
					newOperator.setLastName(entity.getLastName());
					newOperator.setEmail(entity.getEmail());
					newOperator.setMobile(entity.getMobile());
					newOperator.setCity(entity.getCity());
					operators.add(null);
				 }
				 
			 }
			 response.setData(operators);	
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_GETTING_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		
		
		return null;
	}

	@Override
	public Response<List<OperatorDto>> findAllOperators() {
		// TODO Auto-generated method stub
		 try {
			    
			 List<OperatorEntity> entities= Operator.findAll();
			List<Operator> operators= new ArrayList<>();
			 if(entities != null) {
				 for(OperatorEntity   entity: entities) {
				 OperatorEntity newOperator= new OperatorEntity();
					
					newOperator.setOperatorID(entity.getOperatorId());
					newOperator.setFirstName(entity.getFirstName());
					newOperator.setLastName(entity.getLastName());
					newOperator.setEmail(entity.getEmail());
					newOperator.setMobile(entity.getMobile());
					newOperator.setCity(entity.getCity());
					operators.add(null);
				 }
				 
			 }
			 response.setData(operators);	
		 } catch(Exception e) {
			 AppError error = new AppError();
				error.setCode("ERR_GETTING_DEPARTMENT");
				error.setMessage(e.getMessage());
			 
		 }
		
		
		return null;
	
	}

	@Override
	public Response<DepartmentDto> addDepartment(DepartmentDto dept) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

package com.capgemini.model.dto;

import com.capgemini.model.entity.Department;

import lombok.Data;

@Data
public class Response<T> {
	private T data;
	private String status="Sucess";
	private AppError error;
	public void setData(Department department) {
		// TODO Auto-generated method stub
		
	}
	public void setData(OperatorDto operator) {
		// TODO Auto-generated method stub
		
	}
}

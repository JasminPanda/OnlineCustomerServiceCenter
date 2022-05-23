package com.capgemini.model.dto;

import lombok.Data;

@Data
public class Response<T> {
	private T data;
	private String status="Sucess";
	private AppError error;
}

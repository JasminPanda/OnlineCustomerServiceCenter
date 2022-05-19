package com.capgemini.customerservice.dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Issue {
	@Id
	private String issueId;
	private String issueType;
	private String description;
	private String issueStatus;
	
    
}
	
	
	
	





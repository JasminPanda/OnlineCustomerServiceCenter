package com.capgemini.model.dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class IssueDto {
	@Id
	private String issueId;
	private String issueType;
	private String description;
	private String issueStatus;
	
    
}
	
	
	
	





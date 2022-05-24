package com.capgemini.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class IssueDto {
	
	
	
	public IssueDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public IssueDto(String issueId, String issueType, String description, String issueStatus) {
		super();
		this.issueId = issueId;
		this.issueType = issueType;
		this.description = description;
		this.issueStatus = issueStatus;
	}


	@Override
	public String toString() {
		return "IssueDto [issueId=" + issueId + ", issueType=" + issueType + ", description=" + description
				+ ", issueStatus=" + issueStatus + "]";
	}
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIssueStatus() {
		return issueStatus;
	}
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}
	private String issueId;
	private String issueType;
	private String description;
	private String issueStatus;
	
    
}
	
	
	
	





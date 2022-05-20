package com.capgemini.model.dto;



import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
public class Issue {
	@Id
	@Column
	private String issueId;
	@Column
	private String issueType;
	@Column
	private String description;
	@Column
	private String issueStatus;
	
	
	
		
		public Issue() {
			super();
		}
		
		public Issue( String issueId, String issueType, String description, String issueStatus) {
			super();
			this.issueId= issueId;
			this.issueType=issueType ;
			this.description= description;
			this.issueStatus=issueStatus ;
		}
		
		@Override
		public String toString() {
			return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", description=" + description + ", issueStatus="
					+ issueStatus + "]";
		}
		
		public String getIssueId(){
			return  issueId;
		}
		public void setIssueId(String issueId) {
			this.issueId = issueId;
		}
		
		public String getIssueType(){
			return issueType;
		}
		public void setIssueType(String issueType ) {
			this.issueType =issueType ;
		}
		
		public String getDescription(){
			return description;
		}
		public void setDescription(String description ) {
			this.description = description;
		}
		
		public String getIssueStatus(){
			return issueStatus;
		}
		public void setIssueStatus(String issueStatus) {
			this. issueStatus=issueStatus ;
		}
	
    
}
	
	
	
	





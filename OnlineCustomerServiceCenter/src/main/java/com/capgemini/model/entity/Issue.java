package com.capgemini.model.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Issue {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column
		private String issueId;
		@Column
		private String issueType;
		@Column
		private String description;
		@Column
		private String issueStatus;
		
}

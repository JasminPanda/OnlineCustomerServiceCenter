package com.capgemini.model.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class CallEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
     private int callId;
	@Column
     private Date callDate;
	@Column
     private double callDuration;
	@Column
     private String phoneNumber;
	
	public CallEntity() {
		super();
	}
}

package com.capgemini.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Call {
	@Id
	private int callid;
	private Date callDate;
	private double callDuration;
	private String phoneNumber;
}	

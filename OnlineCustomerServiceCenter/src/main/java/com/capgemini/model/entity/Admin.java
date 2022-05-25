package com.capgemini.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin {
		@Id
		private int adminId;
		private String adminName;
}

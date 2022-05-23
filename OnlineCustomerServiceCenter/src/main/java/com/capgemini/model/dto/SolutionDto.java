package com.capgemini.model.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class SolutionDto {
		private int solutionId;
		private String solutionDescription;
		private Date solutionDate;
}

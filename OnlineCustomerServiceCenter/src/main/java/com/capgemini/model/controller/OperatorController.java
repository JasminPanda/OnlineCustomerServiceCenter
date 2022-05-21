package com.capgemini.model.controller;

import java.awt.PageAttributes.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.dto.OperatorDto;
import com.capgemini.model.dto.Response;

@RestController
@RequestMapping("/operator")
public class OperatorController {

		@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
		public Response<OperatorDto> addOperatorDto(@RequestBody OperatorDto operator){
			
		}
}

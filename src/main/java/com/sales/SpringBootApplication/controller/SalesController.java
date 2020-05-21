package com.sales.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.SpringBootApplication.model.SalesDetails;
import com.sales.SpringBootApplication.service.SalesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class SalesController {
	
	  @Autowired
	  SalesService salseService;
	  
	  @ApiOperation(value = "Get list of Sales in the System ", response = Iterable.class, tags = "sales")
		@ApiResponses(value = { 
				@ApiResponse(code = 200, message = "Suceess|OK"),
				@ApiResponse(code = 401, message = "not authorized!"), 
				@ApiResponse(code = 403, message = "forbidden!!!"),
				@ApiResponse(code = 404, message = "not found!!!") })

	  @GetMapping(value="/sales")
	  private List<SalesDetails> getAllStudent() 
	  {
	  return salseService.getAllSales();
	  }

}

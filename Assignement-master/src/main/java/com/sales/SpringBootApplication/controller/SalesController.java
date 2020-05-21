package com.sales.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sales.SpringBootApplication.service.SalesService;


@RestController
public class SalesController {
	
	  @Autowired
	  SalesService salseService;
	  
	  @RequestMapping(value="/sales")
	  private List<SalesService> getAllStudent() 
	  {
	  return salseService.getAllSales();
	  }

}

package com.sales.SpringBootApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sales.SpringBootApplication.repository.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepository salesRepository;

	public List<SalesService> getAllSales() {
		List<SalesService> saless = new ArrayList<SalesService>();
		salesRepository.findAll().forEach(SalesService -> saless.add(SalesService));
		return saless;
	}
	
	
	
	

}

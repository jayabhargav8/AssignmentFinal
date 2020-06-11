package com.sales.SpringBootApplication.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sales.SpringBootApplication.helper.ExcelHelper;
import com.sales.SpringBootApplication.model.SalesDetails;
import com.sales.SpringBootApplication.repository.ExcelRepository;


@Service
public class ExcelService {
	
	@Autowired
	private static ExcelRepository excelRepository;
	
	  public  void savefile(MultipartFile file) {
		    try {
		      List<SalesDetails> sales = ExcelHelper.excelToSales(file.getInputStream());
		      excelRepository.saveAll(sales);
		    } catch (IOException e) {
		      throw new RuntimeException("fail to store excel data: " + e.getMessage());
		    }
		  }	
	  
	  public List<SalesDetails> getAllExcelSales() {
			 return excelRepository.findAll();
		}
}

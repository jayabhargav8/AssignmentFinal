package com.sales.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sales.SpringBootApplication.model.SalesDetails;
import com.sales.SpringBootApplication.service.PageService;
import com.sales.SpringBootApplication.service.SalesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController", description = "REST Apis related to sales Entity!!!!")
@RestController
public class SalesController {

	@Autowired
	SalesService salseService;
	
	@Autowired
	PageService pageService;

	@ApiOperation(value = "Get list of Sales in the System ", response = Iterable.class, tags = "sales")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	
	@GetMapping(value="/")
	private String onLoading()
	{
		return "welcome to sales";
	}
	
	@GetMapping(value = "/sales")
	private List<SalesDetails> getAllSales() {
		return salseService.getAllSales();
	}

	@GetMapping(value = "/sales/{id}")
	private SalesDetails getSales(@PathVariable("id") int id) {
		return salseService.getSalesById(id);
	}

	@DeleteMapping(value = "/sales/{id}")
	private void deleteSales(@PathVariable int id) {
		salseService.delete(id);
	}

	@PostMapping("/sales")
	private int saveSales(@RequestBody SalesDetails sales) {
		salseService.saveOrUpdate(sales);
		return sales.getId();
	}

	@GetMapping("/sales/{pageNo}/{pageSize}")
	public List<SalesDetails> getPaginatedSales(@PathVariable int pageNo, @PathVariable int pageSize) {

		return pageService.findPaginated(pageNo, pageSize);
	}

}

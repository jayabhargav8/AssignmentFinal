package com.sales.SpringBootApplication.service;

import java.util.List;

import com.sales.SpringBootApplication.model.SalesDetails;

public interface IPageService {

    List<SalesDetails> findPaginated(int pageNo, int pageSize);
}


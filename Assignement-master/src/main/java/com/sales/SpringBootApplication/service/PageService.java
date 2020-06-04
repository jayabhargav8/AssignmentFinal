package com.sales.SpringBootApplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sales.SpringBootApplication.model.SalesDetails;
import com.sales.SpringBootApplication.repository.PageRepository;

@Service
public class PageService implements IPageService {

    @Autowired
    private PageRepository pageRepository;

    @Override
    public List<SalesDetails> findPaginated(int pageNo, int pageSize) {

        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<SalesDetails> pagedResult = pageRepository.findAll(paging);

        return pagedResult.toList();
    }
}
    

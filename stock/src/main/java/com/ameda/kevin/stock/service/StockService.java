package com.ameda.kevin.stock.service;

import com.ameda.kevin.stock.entity.Stock;
import com.ameda.kevin.stock.repository.StockRepository;
import com.ameda.kevin.stock.vo.Customer;
import com.ameda.kevin.stock.vo.RestTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Stock registerStock(Stock stock) {
        log.info("inside register stock method of the service:{}");
        return stockRepository.save(stock);
    }
    public RestTemplateVo getCustomerWithStock(Long  stockId) {
        RestTemplateVo vo=new RestTemplateVo();
        Stock stock=stockRepository.findStockByStockId(stockId);
        Customer customer=restTemplate.getForObject("http://CUSTOMER/api/customers/"+
                stock.getCustomerId(),Customer.class);
        vo.setStock(stock);
        vo.setCustomer(customer);
        return vo;
    }
}

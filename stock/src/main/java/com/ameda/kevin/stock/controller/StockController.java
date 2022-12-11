package com.ameda.kevin.stock.controller;

import com.ameda.kevin.stock.entity.Stock;
import com.ameda.kevin.stock.service.StockService;
import com.ameda.kevin.stock.vo.RestTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock")
@Slf4j
public class StockController {

    @Autowired
    private StockService stockService;
    @PostMapping("/register")
    public Stock registerStock(@RequestBody Stock stock){
        log.info("inside the register stock method of the controller:{}");
        return  stockService.registerStock(stock);
    }

    @GetMapping("/{stockId}")
    public RestTemplateVo getCustomerWithStock(@PathVariable("stockId")Long stockId){
        log.info("inside the getCustomerWithStock of the controller class:{}");
        return  stockService.getCustomerWithStock(stockId);
    }
}

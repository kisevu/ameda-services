package com.ameda.kevin.stock.vo;

import com.ameda.kevin.stock.entity.Stock;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVo {
    private Customer customer;
    private Stock stock;
}

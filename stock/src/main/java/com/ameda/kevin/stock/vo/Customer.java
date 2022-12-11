package com.ameda.kevin.stock.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
}

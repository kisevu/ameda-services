package com.ameda.kevin.stock.repository;

import com.ameda.kevin.stock.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
    Stock findStockByStockId(Long stockId);
}

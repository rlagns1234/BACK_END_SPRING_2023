package com.test.SpringBootApi.service;

import com.test.SpringBootApi.dto.StoreRequestDto;
import com.test.SpringBootApi.dto.StoreReturnDto;

public interface StockInfoService {
    public StoreReturnDto save(StoreRequestDto StoreRequestDto);

    public StoreReturnDto findById(Long id);

    void delete(Long id);
}
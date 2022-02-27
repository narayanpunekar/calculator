package com.narayanpunekar.calculator;

import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

/**
 *
 * @author 
 */
@Service
public class Calculator {
    //branch_220222_1: Spring Cache
    @Cacheable("sum")
    public int sum(int a, int b) {
        return a+b;
    }
}

package com.narayanpunekar.calculator;

import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

/**
 *
 * @author 
 */
@Service
public class Calculator {
    @Cacheable("sum")
    public int sum(int a, int b) {
        return a+b;
    }
}

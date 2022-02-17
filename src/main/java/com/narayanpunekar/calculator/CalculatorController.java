package com.narayanpunekar.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 
 */
@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;
    
    @RequestMapping("/add")
    String sum(@RequestParam("a") Integer a, 
                @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}

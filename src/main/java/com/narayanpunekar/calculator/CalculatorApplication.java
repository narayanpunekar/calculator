package com.narayanpunekar.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.out;
import java.text.NumberFormat;

/**
 *
 * @author 
 */
@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

                final long MB = 1024*1024;
                Runtime runtime = Runtime.getRuntime();
                out.println("Free memory: " + NumberFormat.getInstance().format(runtime.freeMemory()/MB));
                out.println("Allocated memory: " + NumberFormat.getInstance().format(runtime.totalMemory()/MB));
                out.println("Max memory: " + NumberFormat.getInstance().format(runtime.maxMemory()/MB));
                out.println("Total free memory :" + NumberFormat.getInstance().format((runtime.freeMemory() + (runtime.maxMemory()-runtime.totalMemory()))/MB));
	}
}

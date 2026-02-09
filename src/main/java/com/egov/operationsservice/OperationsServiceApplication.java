package com.egov.operationsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class OperationsServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(OperationsServiceApplication.class, args);
    }

}

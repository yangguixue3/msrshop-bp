package com.msr.msrshop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/msr/msrshop/product/dao")
@SpringBootApplication
public class MsrshopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsrshopProductApplication.class, args);
    }

}

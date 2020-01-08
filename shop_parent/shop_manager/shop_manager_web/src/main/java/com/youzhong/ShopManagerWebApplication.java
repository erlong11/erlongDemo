package com.youzhong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.youzhong.shop.dao")
public class ShopManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopManagerWebApplication.class, args);
	}

}

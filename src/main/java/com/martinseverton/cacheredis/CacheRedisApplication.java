package com.martinseverton.cacheredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
//@EnableScheduling
@EnableFeignClients
public class CacheRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheRedisApplication.class, args);
	}

}

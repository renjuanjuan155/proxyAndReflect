package com.example.aopzhujie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
@MapperScan
public class AopzhujieApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopzhujieApplication.class, args);
	}

}

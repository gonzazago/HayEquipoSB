package com.gonzazago.HayEquipo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.gonzazago.HayEquipo.controller")
public class HayEquipoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(HayEquipoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HayEquipoApplication.class, args);
	}
}

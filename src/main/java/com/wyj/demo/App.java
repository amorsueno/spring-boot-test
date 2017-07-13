package com.wyj.demo;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
	@Bean
	public ServletRegistrationBean jerseyServlet(){
		ServletRegistrationBean registerBean = new ServletRegistrationBean(new ServletContainer(),"/rest/*");
		//our rest resouces will be avaliable in the path /rest/*
		registerBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
		return registerBean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

package com.SpringBoot.Middlewares.Interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ProductInterceptorConfig extends WebMvcConfigurationSupport{
	
	@Autowired
	private ProductInterceptor productInterceptor;

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(productInterceptor);
	}
	
}

package com.SpringBoot.Middlewares.filters;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	
	
	@Bean
	public FilterRegistrationBean<ProductFilterTwo> registrationBeanProduct() {
		FilterRegistrationBean<ProductFilterTwo> registrationBeanProduct = new FilterRegistrationBean<>();
		registrationBeanProduct.setFilter(new ProductFilterTwo());
		registrationBeanProduct.addUrlPatterns("/addProduct/*");
		return registrationBeanProduct;
	}
	@Bean
	public FilterRegistrationBean<UserFilter> registrationBean() {
		FilterRegistrationBean<UserFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new UserFilter());
		registrationBean.addUrlPatterns("/users/*");
		return registrationBean;
	}

}

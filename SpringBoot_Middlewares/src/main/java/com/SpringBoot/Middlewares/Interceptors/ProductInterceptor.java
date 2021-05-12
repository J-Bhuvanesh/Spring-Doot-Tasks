package com.SpringBoot.Middlewares.Interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class ProductInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("prehandler is called ......");
		String method = request.getMethod();
		int contentLength =request.getContentLength();
		if(method.equalsIgnoreCase("post") || method.equalsIgnoreCase("put")) {
			String contentType = request.getContentType();
			if(contentType != null && !contentType.equalsIgnoreCase("application/json")) {
				   response.getWriter().write("enter the details properly");	
			       int someErrorCode=400;
				response.setStatus(someErrorCode);
			       return false;
	   
			} 
			else if(contentLength <= 2) {
				   response.getWriter().write("enter the details properly");	
			       int someErrorCode=400;
				response.setStatus(someErrorCode);
			       return false;
				
		}
		}
		
	 
	    return true;
		
	
		
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	

}

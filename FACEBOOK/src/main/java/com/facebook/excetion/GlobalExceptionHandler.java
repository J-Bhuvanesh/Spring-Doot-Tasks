package com.facebook.excetion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.facebook.common.ResponseWrapper;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> validationError(MethodArgumentNotValidException exception,WebRequest request){
	ErrorDetail errorDerail=new ErrorDetail("validation error",
	    		exception.getBindingResult().getFieldError().getDefaultMessage(),request.getDescription(false),"enter the details correctly");
	    ResponseWrapper responseWrapper =new ResponseWrapper();
	    responseWrapper.setStatus(400);
	    responseWrapper.setError(errorDerail);
	    return new ResponseEntity<>(responseWrapper,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handelGlobalNotFoundException
	(Exception exception,WebRequest request){
		return setErrorResponse(exception,request);		
	}
	@ExceptionHandler(NoSuchIdFountException.class)
	public ResponseEntity<Object> handelNoSuchIdFountException
	(NoSuchIdFountException exception,WebRequest request){
		return setStatusAndMessage(HttpStatus.INTERNAL_SERVER_ERROR, exception,request);
		
	}
	@ExceptionHandler(NoSuchNameNotFoundException.class)
	public ResponseEntity<Object> handelNoSuchNameNotFoundException
	(NoSuchNameNotFoundException exception,WebRequest request){
		return setStatusAndMessageForNameException(HttpStatus.INTERNAL_SERVER_ERROR, exception,request);
		
	}
	   private ResponseEntity<Object> setStatusAndMessageForNameException(HttpStatus internalServerError,
			Exception ex, WebRequest request) {

	        ErrorDetail errorDetail = new ErrorDetail(ex.getMessage(),"the name is not in db",request.getDescription(false),"enter the name which is in db");
		  	ResponseWrapper responseWrapper =new ResponseWrapper();
		  	responseWrapper.setError(errorDetail);
		  	responseWrapper.setStatus(500);
	        return new ResponseEntity<>(responseWrapper, internalServerError);
	}
	private ResponseEntity<Object> setStatusAndMessage(HttpStatus status, Exception ex,WebRequest request) {
		   
	        ErrorDetail errorDetail = new ErrorDetail(ex.getMessage(),"the id is not in db",request.getDescription(false),"enter the id which is in db");
		  	ResponseWrapper responseWrapper =new ResponseWrapper();
		  	responseWrapper.setError(errorDetail);
		  	responseWrapper.setStatus(500);
	        return new ResponseEntity<>(responseWrapper, status);
	    }
	   
	   private ResponseEntity<?> setErrorResponse(Exception exception,WebRequest request){
		   ErrorDetail errorDerail=new ErrorDetail(exception.getMessage(),"enter correct method",
	    			request.getDescription(false),exception.toString());
		  	ResponseWrapper responseWrapper =new ResponseWrapper();
	    	responseWrapper.setStatus(400);
	    	responseWrapper.setError(errorDerail);
			return new ResponseEntity(responseWrapper,HttpStatus.INTERNAL_SERVER_ERROR);
		   
	   }
	   
	   

}

package com.example.Validation.exception;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;




@ControllerAdvice
public class ValidationError {
	
	
    @ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> validationError(MethodArgumentNotValidException exception){
    	ErrorDetails errorDerails=new ErrorDetails(new Date(),"validation error",
    			exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(errorDerails,HttpStatus.BAD_REQUEST);}

}

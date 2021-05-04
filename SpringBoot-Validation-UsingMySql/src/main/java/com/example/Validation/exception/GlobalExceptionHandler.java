package com.example.Validation.exception;

import java.util.Date;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
//	Throw(()-> new ResourceNotFoundException("user not foung with given id"))
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<?> handelNullPointerException
	(NullPointerException exception,WebRequest request){
		ErrorDetails errorDerails=new ErrorDetails(new Date()
				,exception.getMessage(),
    			request.getDescription(false));
		return new ResponseEntity(errorDerails,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(APIException.class)
	public ResponseEntity<?> handelAPIException
	(APIException exception,WebRequest request){
		ErrorDetails errorDerails=new ErrorDetails(new Date()
				,exception.getMessage(),
    			request.getDescription(false));
		return new ResponseEntity(errorDerails,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handelEmptyInputException
	(EmptyInputException exception){
		return new ResponseEntity<String>("the input field name is empty",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(NoSuchIdFountException.class)
	public ResponseEntity<String> handelNoSuchIdFountException
	(NoSuchIdFountException exception){
		return new ResponseEntity<String>("the input field id is empty",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handelGlobalNotFoundException
	(Exception exception,WebRequest request){
		ErrorDetails errorDerails=new ErrorDetails(new Date()
				,exception.getMessage(),
    			request.getDescription(false));
		return new ResponseEntity(errorDerails,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}


}

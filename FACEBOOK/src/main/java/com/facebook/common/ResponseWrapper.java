package com.facebook.common;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.facebook.model.User;
@Component
public class ResponseWrapper{
	  private Integer status;
	    private Object data;
	    private Object error;
	   
	    public ResponseWrapper() {
	        this.status = HttpStatus.OK.value();
	        this.data = data;
	        this.error = error;
	    }

	    public Integer getStatus() {
	        return status;
	    }

	    public void setStatus(Integer status) {
	        this.status = status;
	    }

	    public Object getData() {
	        return data;
	    }

	    public void setData(Object data) {
	        this.data = data;
	    }

	    public Object getError() {
	        return error;
	    }

	    public void setError(Object error) {
	        this.error = error;
	    }

	

}

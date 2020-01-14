/**
 * 
 */
package com.jspring.techguy.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.jspring.techguy.requests.ExceptionResponse;

/**
 * @Author : Vimukthi G. R.
 * @Date : Dec 05, 2018
 * @Description : This class handles global exceptions
 */
@ControllerAdvice
public class ExceptionHandlerController {
	
	@ExceptionHandler({MethodArgumentNotValidException.class, NumberFormatException.class})
	public ResponseEntity<?> handleMethodArgumentNotValidException(Exception ex, WebRequest request){
		return new ResponseEntity<>(new ExceptionResponse("test", ex.getMessage()), HttpStatus.BAD_REQUEST);
	}
}

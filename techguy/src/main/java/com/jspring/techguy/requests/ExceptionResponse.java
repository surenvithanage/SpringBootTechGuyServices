/**
 * 
 */
package com.jspring.techguy.requests;

/**
 * @Author : Vimukthi G. R.
 * @Date : Dec 05, 2018
 * @Description :This class handles exception responses
 */
public class ExceptionResponse {
	String errorcode;
	String errormessage;
	/**
	 * @param errorcode
	 * @param errormessage
	 */
	public ExceptionResponse(String errorcode, String errormessage) {
		super();
		this.errorcode = errorcode;
		this.errormessage = errormessage;
	}
	
}

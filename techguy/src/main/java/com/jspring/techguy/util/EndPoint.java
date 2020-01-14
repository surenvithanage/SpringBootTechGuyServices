/**
 * 
 */
package com.jspring.techguy.util;

/**
 * @author vimukthi_r
 * @Date Nov 30, 2018
 * @Description This class contains requests end point URIs.
 * @Version v1.0
 */
public class EndPoint {
	private EndPoint() {
		throw new IllegalStateException("EndPoint class");
	}
	
	public static final String USER_SIGN_UP = "/v1/user_signup"; 
	public static final String USER_SIGN_UP_STORE = "/v1/user_signup2"; 
	public static final String USER_SIGN_IN = "/v1/user_signin";
	public static final String USER_UPDATE = "/v1/user_update";
	
	public static final String COMPANIES = "/companies";
	public static final String REVIEWS = "/reviews";
	
	public static final String ID = "/{id:\\d+}";
	
}

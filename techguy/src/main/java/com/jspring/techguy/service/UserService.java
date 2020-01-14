/**
 * 
 */
package com.jspring.techguy.service;

import com.jspring.techguy.mapping.TemporyUser;
import com.jspring.techguy.mapping.User;

/**
 * @author vimukthi_r
 * @Date Nov 30, 2018
 * @Description 
 * @Version V1.0
 */
public interface UserService {
	public User registerUser(User user) throws Exception;
	public User getUserByEmailAndPassword(String email, String password) throws Exception;
	TemporyUser registerTemporyUser(TemporyUser user) throws Exception;
	TemporyUser getUserByconfirmation_token(String confirmationToken) throws Exception;
}

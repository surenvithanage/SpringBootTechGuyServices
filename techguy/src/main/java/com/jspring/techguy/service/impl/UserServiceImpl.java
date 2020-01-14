/**
 * 
 */
package com.jspring.techguy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspring.techguy.mapping.TemporyUser;
import com.jspring.techguy.mapping.User;
import com.jspring.techguy.repository.TemporyUserRepository;
import com.jspring.techguy.repository.UserRepository;
import com.jspring.techguy.service.UserService;

/**
 * @author vimukthi_r
 * @Date Nov 30, 2018
 * @Description This class implements UserService interface and generate it's
 *              methods
 * @Version V1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	TemporyUserRepository temporyUserRepository;
	@Override
	public User registerUser(User user) throws Exception{
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@Override
	public TemporyUser registerTemporyUser(TemporyUser user) throws Exception{
		try {
		//	return userRepository.save(user);
			return temporyUserRepository.save(user);
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	@Override
	public TemporyUser getUserByconfirmation_token(String confirmationToken) throws Exception {
		try {
		//	return userRepository.getUserByConfirmationToken(confirmationToken);
			return temporyUserRepository.getUserByConfirmationToken(confirmationToken);
		} catch (Exception e) {
			throw e;
		}
	}

	

	@Override
	public User getUserByEmailAndPassword(String email, String password) throws Exception {
		try {
			return userRepository.getUserByEmailAndPassword(email, password);
		} catch (Exception e) {
			throw e;
		}
	}

}

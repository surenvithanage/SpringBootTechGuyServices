/**
 * 
 */
package com.jspring.techguy.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspring.techguy.mapping.User;

/**
 * @author vimukthi_r
 * @Date Nov 30, 2018
 * @Description
 * @Version
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	@Query(value = "SELECT * FROM USER u WHERE u.email = ?1 AND u.password = ?2", nativeQuery = true)
	public User getUserByEmailAndPassword(String email, String password);
	
	
	@Query(value = "SELECT * FROM USER u WHERE u.confirmation_token = ?1 ", nativeQuery = true)
	public User getUserByConfirmationToken(String confirmationToken);
}

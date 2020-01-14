package com.jspring.techguy.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspring.techguy.mapping.TemporyUser;
import com.jspring.techguy.mapping.User;


@Repository
public interface TemporyUserRepository extends CrudRepository<TemporyUser, Integer> {
	@Query(value = "SELECT * FROM tempory_user u WHERE u.confirmation_token = ?1 ", nativeQuery = true)
	public TemporyUser getUserByConfirmationToken(String confirmationToken);
	
	
}

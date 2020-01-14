/**
 * 
 */
package com.jspring.techguy.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspring.techguy.mapping.Role;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description
 * @Version
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	public Optional<Role> findByName(String name);
}

/**
 * 
 */
package com.jspring.techguy.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspring.techguy.mapping.Company;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description
 * @Version
 */
@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
	public Optional<Company> findByName(String name);
}

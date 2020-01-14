/**
 * 
 */
package com.jspring.techguy.service;

import java.util.List;

import com.jspring.techguy.mapping.Company;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description 
 * @Version V1.0
 */
public interface CompanyService {
	public List<Company> findAllCompanies() throws Exception;
	public Company findCompanyByName(String companyName) throws Exception;
}

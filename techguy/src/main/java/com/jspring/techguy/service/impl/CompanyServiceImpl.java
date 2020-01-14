/**
 * 
 */
package com.jspring.techguy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspring.techguy.mapping.Company;
import com.jspring.techguy.repository.CompanyRepository;
import com.jspring.techguy.service.CompanyService;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description This class implements CompanyService interface and generate it's
 *              methods
 * @Version V1.0
 */
@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;

	@Override
	public List<Company> findAllCompanies() throws Exception {
		List<Company> companyList = new ArrayList<>();
		try {
			companyRepository.findAll().forEach(companyList::add);
		} catch (Exception e) {
			throw e;
		}
		return companyList;
	}

	@Override
	public Company findCompanyByName(String companyName) throws Exception {
		try {
			return companyRepository.findByName(companyName).orElse(new Company());
		} catch (Exception e) {
			throw e;
		}
	}

}

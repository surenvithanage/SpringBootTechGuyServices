/**
 * 
 */
package com.jspring.techguy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspring.techguy.mapping.Page;
import com.jspring.techguy.repository.PageRepository;
import com.jspring.techguy.service.PageService;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description This class implements CommonService interface and generate it's
 *              methods
 * @Version V1.0
 */
@Service
public class PageServiceImpl implements PageService {

	@Autowired
	PageRepository pageRepository;

	@Override
	public List<Page> findAllPages() throws Exception {
		List<Page> pageList = new ArrayList<>();
		try {
			pageRepository.findAll().forEach(pageList::add);
		} catch (Exception e) {
			throw e;
		}
		return pageList;
	}

	@Override
	public List<Page> findPageByRoleName(String roleName) throws Exception {
		List<Page> pageList = new ArrayList<>();
		try {
			pageRepository.findPageByRoleName(roleName).forEach(pageList::add);
		} catch (Exception e) {
			throw e;
		}
		return pageList;
	}
	
}

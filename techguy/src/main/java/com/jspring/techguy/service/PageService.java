/**
 * 
 */
package com.jspring.techguy.service;

import java.util.List;

import com.jspring.techguy.mapping.Page;

/**
 * @author vimukthi_r
 * @Date Jan 15, 2019
 * @Description 
 * @Version V1.0
 */
public interface PageService {
	public List<Page> findAllPages() throws Exception;
	public List<Page> findPageByRoleName(String roleName) throws Exception;
}

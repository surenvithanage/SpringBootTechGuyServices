/**
 * 
 */
package com.jspring.techguy.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspring.techguy.mapping.Page;

/**
 * @author vimukthi_r
 * @Date Jan 14, 2019
 * @Description
 * @Version
 */
@Repository
public interface PageRepository extends CrudRepository<Page, Integer> {
	@Query("SELECT pa FROM Page pa, PageFunction pf, Privilege pr, Role ro WHERE ro.roleid=pr.role.roleid AND pr.pageFunction.pageFuncId=pf.pageFuncId AND pf.page.pageId=pa.pageId AND ro.name = ?1")
	public Iterable<Page> findPageByRoleName(String name);
}

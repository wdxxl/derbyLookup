package com.wdxxl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wdxxl.dao.IDerbyLookupDao;
import com.wdxxl.model.Derbylookup;
import com.wdxxl.service.IDerbyLookupService;

@Service("derbyLookupService")
@Transactional
public class DerbyLookupServiceImpl implements IDerbyLookupService {
	@Autowired
	private IDerbyLookupDao derbyLookupDao;

	public Derbylookup getDerbyLookupById() {
		return derbyLookupDao.getDerbyLookupById();
	}
	
}

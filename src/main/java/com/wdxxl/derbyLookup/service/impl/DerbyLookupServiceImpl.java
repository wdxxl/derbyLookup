package com.wdxxl.derbyLookup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wdxxl.derbyLookup.dao.IDerbyLookupDao;
import com.wdxxl.derbyLookup.model.Derbylookup;
import com.wdxxl.derbyLookup.service.IDerbyLookupService;

@Service("derbyLookupService")
@Transactional
public class DerbyLookupServiceImpl implements IDerbyLookupService {
	@Autowired
	private IDerbyLookupDao derbyLookupDao;

	public Derbylookup getDerbyLookupById() {
		return derbyLookupDao.getDerbyLookupById();
	}
	
}

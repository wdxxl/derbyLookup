package com.wdxxl.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wdxxl.dao.IDerbyLookupDao;
import com.wdxxl.model.Derbylookup;

@Repository("derbyLookupDao")
public class DerbyLookupDaoImpl implements IDerbyLookupDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public Derbylookup getDerbyLookupById() {
		Session session = sessionFactory.openSession();
		
		List<Derbylookup> derbyLookupList = session.createQuery("from Derbylookup").list();
		Derbylookup derbylookup = derbyLookupList.get(0);
		
		session.close();//session need to be closed, returned to connection pool.
		/*
		 * if not closed, may get this kind of error 
		 *  1.TNS:listener could not hand off client connection.
		 *  2.query still running, and no feedback result.
		 */
		return derbylookup;
	}
	
}

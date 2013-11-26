package com.wdxxl.derbyLookup.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.wdxxl.derbyLookup.util.SpringTransactionalTestCase;

@ContextConfiguration(locations = { "/spring-mvc-servlet.xml" })
public class DerbyLookupControllerTestCase extends SpringTransactionalTestCase {

//	private final MockHttpServletRequest request = new MockHttpServletRequest();
//	private final MockHttpServletResponse response = new MockHttpServletResponse();
	
	@Autowired
	private DerbyLookupController derbyLookupController;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetDerbyLookup() {
		System.out.println(derbyLookupController.getDerbyLookup().getId());
	}

}

package com.wdxxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wdxxl.model.Derbylookup;
import com.wdxxl.service.IDerbyLookupService;


@Controller
public class DerbyLookupController 
{
	@Autowired
	private IDerbyLookupService derbyLookupService;
	
	@RequestMapping(method = RequestMethod.GET, value="/getDerbyLookup")
	public @ResponseBody Derbylookup getDerbyLookup(){
		return derbyLookupService.getDerbyLookupById();
	}
}

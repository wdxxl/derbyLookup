package com.wdxxl.derbyLooku.xml;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DerbyLookupXML {
	private String city;
	private String county;
	private String description;
	private String id;
	private String line;
	private String lookup;
	private String rating;
	private String revision;
	private String stateCode;
	private String stateNum;
	private String zipCode;
	
}

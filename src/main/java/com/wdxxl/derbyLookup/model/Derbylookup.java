package com.wdxxl.derbyLookup.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DERBYLOOKUP database table.
 * 
 */
@Entity
public class Derbylookup implements Serializable {
	private static final long serialVersionUID = 1L;

	private String city;

	private String county;

	private String description;

	@Id
	private String id;

	private String line;

	private String lookup;

	private String rating;

	private String revision;

	@Column(name="STATE_CODE")
	private String stateCode;

	@Column(name="STATE_NUM")
	private String stateNum;

	@Column(name="ZIP_CODE")
	private String zipCode;

	public Derbylookup() {
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLine() {
		return this.line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getLookup() {
		return this.lookup;
	}

	public void setLookup(String lookup) {
		this.lookup = lookup;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRevision() {
		return this.revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateNum() {
		return this.stateNum;
	}

	public void setStateNum(String stateNum) {
		this.stateNum = stateNum;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
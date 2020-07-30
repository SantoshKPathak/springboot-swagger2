/**
 * 
 */
package com.santoshpathak.learnings.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author santoshpathak
 *
 */
@ApiModel(description = "Details about the Contact")
public class Contact {
	
	@ApiModelProperty(notes = "unique ID of a contact")
	private String id;
	@ApiModelProperty(notes = "name of a contact")
	private String name;
	
	@ApiModelProperty(notes = "phone of a contact")
	private String phone;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}

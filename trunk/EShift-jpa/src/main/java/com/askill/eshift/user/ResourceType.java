package com.askill.eshift.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( schema = "eshift" )
public class ResourceType implements Serializable {

	private static final long serialVersionUID = -2949074225643277465L;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="resource_type_desc")
	private String resourceTypeDesc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResourceTypeDesc() {
		return resourceTypeDesc;
	}
	public void setResourceTypeDesc(String resourceTypeDesc) {
		this.resourceTypeDesc = resourceTypeDesc;
	}
	
	
	
}

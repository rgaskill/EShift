package com.askill.eshift.shift;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.askill.eshift.user.ResourceType;

@Entity
@Table( schema = "eshift" )
public class ShiftTemplateGroup implements Serializable {

	
	
	private static final long serialVersionUID = -7344417423422993968L;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@OneToMany
	@JoinTable(schema="eshift")
	private Set<ShiftTemplate> templates;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<ShiftTemplate> getTemplates() {
		return templates;
	}
	public void setTemplates(Set<ShiftTemplate> templates) {
		this.templates = templates;
	}
	
	
	
}

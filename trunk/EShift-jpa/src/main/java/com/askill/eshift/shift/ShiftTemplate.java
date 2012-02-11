package com.askill.eshift.shift;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.askill.eshift.user.ResourceType;

@Entity
@Table( schema = "eshift" )
public class ShiftTemplate {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="day_of_week")
	private Integer dayOfWeek;
	@Column(name="resource_count")
	private Integer resourceCount;
	@OneToOne
	@JoinColumn(name="resource_type")
	private ResourceType resourceType;
	@Column(name="start_time")
	private Date startTime;
	@Column(name="end_time")
	private Date endtTime;
	@ManyToOne
	private ShiftTemplateGroup group;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public Integer getResourceCount() {
		return resourceCount;
	}
	public void setResourceCount(Integer resourceCount) {
		this.resourceCount = resourceCount;
	}
	public ResourceType getResourceType() {
		return resourceType;
	}
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndtTime() {
		return endtTime;
	}
	public void setEndtTime(Date endtTime) {
		this.endtTime = endtTime;
	}
	public ShiftTemplateGroup getGroup() {
		return group;
	}
	public void setGroup(ShiftTemplateGroup group) {
		this.group = group;
	}
	
	
	
	
}

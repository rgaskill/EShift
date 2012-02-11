package org.askil.eshift.shift;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( schema = "eshift" )
public class Shift implements Serializable {

	private static final long serialVersionUID = 8446010687797315387L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="start_time")
	private Date startTime;
	@Column(name="end_time")
	private Date endtTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

}

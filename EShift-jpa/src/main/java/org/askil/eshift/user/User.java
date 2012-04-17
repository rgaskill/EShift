package org.askil.eshift.user;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table( schema = "eshift" )
public class User implements Serializable {
	
	
	
	private static final long serialVersionUID = -2675161053959815923L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name="first_name",length=25, nullable = false)
	private String firstName;
	@Column(name="last_name",length=25, nullable = false)
	private String lastName;
	@Column(name="email", length=75, unique = true, nullable = false)
	private String email;
	@Column(name="password", length=75, nullable = false)
	private String password;
	
	@Column(name="ctrl_user", length=50)
	private String ctrlUser;
	@Column(name="ctrl_date")
	private Date ctrlDate;
	
	@ManyToMany
	@JoinTable(schema="eshift")
	private Set<UserRole> userRoles = new HashSet<UserRole>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last_name) {
		this.lastName = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCtrlUser() {
		return ctrlUser;
	}
	public void setCtrlUser(String ctrlUser) {
		this.ctrlUser = ctrlUser;
	}
	public Date getCtrlDate() {
		return ctrlDate;
	}
	public void setCtrlDate(Date ctrlDate) {
		this.ctrlDate = ctrlDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	@Transient
	public boolean isAdmin() {
		for (UserRole role : userRoles) {
			UserRoleEnum roleEnum = UserRoleEnum.valueOf(role.getUserRole());
			if ( roleEnum == UserRoleEnum.admin ){
				return true;
			}
		}
		return false;
	}

}

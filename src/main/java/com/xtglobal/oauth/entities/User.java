package com.xtglobal.oauth.entities;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User 
{
	@Id
	private Integer id;
	private String name;
	public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}
private String password;
	public String getPassword() {
		return password;
	}

public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRoles() {
		return roles;
	}
public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
@ManyToMany(fetch=FetchType.EAGER)
@JoinTable(name="user_role", joinColumns = {@JoinColumn(name= "user_id")},inverseJoinColumns = {
@JoinColumn(name="role_id")})
	private Set<Role> roles;


	

}

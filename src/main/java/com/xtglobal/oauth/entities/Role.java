package com.xtglobal.oauth.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
@Entity
public class Role implements GrantedAuthority

{
	@Id
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@ManyToMany(mappedBy="roles")
	private Set<User> users;
    
	@Override
	public String getAuthority()
	{
		return name;
		
	}

}

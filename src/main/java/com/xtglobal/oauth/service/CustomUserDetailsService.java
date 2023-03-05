package com.xtglobal.oauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.xtglobal.oauth.entities.User;
import com.xtglobal.oauth.repos.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username)
	{
		User user = repository.findByName(username);
		return new org.springframework.security.core.userdetails.User(user.getName(),user.getPassword(),user.getRoles());
}

}

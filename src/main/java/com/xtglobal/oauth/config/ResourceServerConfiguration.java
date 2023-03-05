package com.xtglobal.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter
{
	private static final String RESOURCE_ID = "myrestservice";

	@Override
	public void configure(ResourceServerSecurityConfigurer resource) throws Exception
	{
		resource.resourceId(RESOURCE_ID);
		
	}
	@Override
	public void configure(HttpSecurity http) throws Exception
	{
//		http.authorizeHttpRequests().antMatchers("/admin/*").hasRole("ADMIN")
//									.antMatchers("/hello/*").authenticated();
//		
		
		http.authorizeRequests()
		.antMatchers("/admin/*").permitAll()
		.antMatchers("/hello/*").permitAll()
		.anyRequest().authenticated().and()
		.csrf().disable();
		
		
	}
	
	
}

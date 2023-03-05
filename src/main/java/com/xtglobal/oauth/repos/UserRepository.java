package com.xtglobal.oauth.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

import com.xtglobal.oauth.entities.User;

@Component
public interface UserRepository extends CrudRepository<User, Integer>
{

	User findByName(String username);

}

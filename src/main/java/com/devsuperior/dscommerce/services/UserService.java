package com.devsuperior.dscommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;
import com.devsuperior.dscommerce.projections.UserDetailsProjection;
import com.devsuperior.dscommerce.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<UserDetailsProjection> user = repository.searchUserAndRolesByEmail(username);
		if(user.size() == 0) {
			throw new UsernameNotFoundException("User not found");
		}
		User user1 = new User();
		user1.setEmail(username);
		user1.setPassword(user.get(0).getPassword());
		
		for(UserDetailsProjection projection : user) {
			user1.addRole(new Role(projection.getRoleId(), projection.getAuthority()));		
		}
		return user1;
	}
}

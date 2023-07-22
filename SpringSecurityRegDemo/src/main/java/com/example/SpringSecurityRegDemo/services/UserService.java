package com.example.SpringSecurityRegDemo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.SpringSecurityRegDemo.security.UserDTO;
import com.example.SpringSecurityRegDemo.model.User;

public interface UserService extends UserDetailsService {
   public UserDetails loadUserByUsername(String userName);
   public void create(UserDTO userDTO);
   public User findUserByEmail(String email);
   public User findUserByName(String name);
}
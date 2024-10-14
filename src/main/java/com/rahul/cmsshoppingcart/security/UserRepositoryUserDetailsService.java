package com.rahul.cmsshoppingcart.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rahul.cmsshoppingcart.models.AdminRepository;
import com.rahul.cmsshoppingcart.models.data.Admin;
import com.rahul.cmsshoppingcart.models.data.User;
import com.rahul.cmsshoppingcart.models.data.UserRepository;

@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private AdminRepository adminRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);
        Admin admin = adminRepo.findByUsername(username);

        if (user != null) {
            return user;
        }
        if (admin != null) {
            return admin;
        }
        throw new UsernameNotFoundException("User: " + username + "not found!");
    }

}

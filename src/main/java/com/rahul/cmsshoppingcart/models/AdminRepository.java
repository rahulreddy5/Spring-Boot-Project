package com.rahul.cmsshoppingcart.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.cmsshoppingcart.models.data.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findByUsername(String username);
}

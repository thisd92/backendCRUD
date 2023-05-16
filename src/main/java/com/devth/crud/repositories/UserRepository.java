package com.devth.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devth.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

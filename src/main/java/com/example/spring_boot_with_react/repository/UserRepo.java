package com.example.spring_boot_with_react.repository;

import com.example.spring_boot_with_react.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}

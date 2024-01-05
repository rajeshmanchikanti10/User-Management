package com.rajesh.validation_Exception.respository;

import com.rajesh.validation_Exception.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}

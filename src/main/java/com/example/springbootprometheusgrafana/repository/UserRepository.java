package com.example.springbootprometheusgrafana.repository;

import com.example.springbootprometheusgrafana.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

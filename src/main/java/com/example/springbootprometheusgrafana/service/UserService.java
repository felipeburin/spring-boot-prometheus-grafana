package com.example.springbootprometheusgrafana.service;

import com.example.springbootprometheusgrafana.controller.dto.UserRequest;
import com.example.springbootprometheusgrafana.controller.dto.UserResponse;
import com.example.springbootprometheusgrafana.entity.UserEntity;
import com.example.springbootprometheusgrafana.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserResponse save(final UserRequest request) {
        final var entity = new UserEntity(request.email(), request.name());
        final var savedEntity = repository.save(entity);
        return new UserResponse(savedEntity.getId(), savedEntity.getEmail(), savedEntity.getName());
    }

    public UserResponse get(final Long id) {
        final var savedEntity = repository.findById(id).orElseThrow();
        return new UserResponse(savedEntity.getId(), savedEntity.getEmail(), savedEntity.getName());
    }
}

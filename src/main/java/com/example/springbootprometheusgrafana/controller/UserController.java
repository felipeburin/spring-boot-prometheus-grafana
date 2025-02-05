package com.example.springbootprometheusgrafana.controller;

import com.example.springbootprometheusgrafana.controller.dto.UserRequest;
import com.example.springbootprometheusgrafana.controller.dto.UserResponse;
import com.example.springbootprometheusgrafana.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/v1/users"})
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(final UserService service) {
        this.service = service;
    }

    @GetMapping(
            path = "/{id}",
            produces = "application/json")
    public ResponseEntity<UserResponse> get(@PathVariable final Long id) {
        final var result = service.get(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity<UserResponse> save(@RequestBody final UserRequest request) {
        final var result = service.save(request);
        return ResponseEntity.ok(result);
    }
}

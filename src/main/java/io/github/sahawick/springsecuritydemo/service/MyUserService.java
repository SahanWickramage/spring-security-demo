package io.github.sahawick.springsecuritydemo.service;

import io.github.sahawick.springsecuritydemo.entity.MyUser;

import java.util.Optional;

public interface MyUserService {

    Optional<MyUser> getMyUserByUsername(String username);
}

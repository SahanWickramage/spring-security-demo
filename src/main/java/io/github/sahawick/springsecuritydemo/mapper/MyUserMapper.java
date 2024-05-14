package io.github.sahawick.springsecuritydemo.mapper;

import io.github.sahawick.springsecuritydemo.entity.MyUser;
import org.springframework.security.core.userdetails.User;

public interface MyUserMapper {
    User toDto(MyUser model);
}

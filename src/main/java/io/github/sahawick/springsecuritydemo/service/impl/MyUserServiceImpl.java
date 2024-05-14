package io.github.sahawick.springsecuritydemo.service.impl;

import io.github.sahawick.springsecuritydemo.entity.MyUser;
import io.github.sahawick.springsecuritydemo.repo.MyUserRepo;
import io.github.sahawick.springsecuritydemo.service.MyUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MyUserServiceImpl implements MyUserService {

    private final MyUserRepo myUserRepo;

    @Override
    public Optional<MyUser> getMyUserByUsername(String username) {
        return myUserRepo.findByUsername(username);
    }
}

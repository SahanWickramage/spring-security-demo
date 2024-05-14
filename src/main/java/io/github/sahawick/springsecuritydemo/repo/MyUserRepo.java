package io.github.sahawick.springsecuritydemo.repo;

import io.github.sahawick.springsecuritydemo.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepo extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUsername(String user);
}

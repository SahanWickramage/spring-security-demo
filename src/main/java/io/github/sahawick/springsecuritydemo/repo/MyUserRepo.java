package io.github.sahawick.springsecuritydemo.repo;

import io.github.sahawick.springsecuritydemo.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepo extends JpaRepository<MyUser, Long> {
}

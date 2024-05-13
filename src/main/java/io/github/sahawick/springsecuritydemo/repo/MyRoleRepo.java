package io.github.sahawick.springsecuritydemo.repo;

import io.github.sahawick.springsecuritydemo.entity.MyRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRoleRepo extends JpaRepository<MyRole, Long> {
}

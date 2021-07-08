package com.biat.springsecurityAngular.springbootsecurityjwtmysql.repository;

import com.biat.springsecurityAngular.springbootsecurityjwtmysql.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}

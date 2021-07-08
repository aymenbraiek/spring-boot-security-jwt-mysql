package com.biat.springsecurityAngular.springbootsecurityjwtmysql.repository;

import com.biat.springsecurityAngular.springbootsecurityjwtmysql.domain.Role;
import com.biat.springsecurityAngular.springbootsecurityjwtmysql.domain.enumeration.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}

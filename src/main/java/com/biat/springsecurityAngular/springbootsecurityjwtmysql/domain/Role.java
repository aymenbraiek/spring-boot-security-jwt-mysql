package com.biat.springsecurityAngular.springbootsecurityjwtmysql.domain;

import com.biat.springsecurityAngular.springbootsecurityjwtmysql.domain.enumeration.ERole;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;
}

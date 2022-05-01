package com.example.demo.configuration.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username ;
    private String password ;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Set<AppRole> roles = new HashSet<>();
}

package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public class UserCredentials {

    private String email;
    private String password;
    private List<RolesDTO> roles;

    public  UserCredentials(){
    }

    public UserCredentials(String email, String password, List<RolesDTO> roles) {
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public UserCredentials(User entity) {
        this.email = entity.getEmail();
        this.password = entity.getPassword();

        this.roles = entity.getAuthorities().stream()
                .map(RolesDTO::new)
                .collect(Collectors.toList());
    }

}

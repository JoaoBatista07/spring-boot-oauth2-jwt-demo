package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Role;
import com.devsuperior.demo.entities.User;
import org.springframework.security.core.GrantedAuthority;

public class RolesDTO {

    private Long id;
    private String authority;

    public RolesDTO(){
    }

    public RolesDTO(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public RolesDTO(Role entity){
        this.id = entity.getId();
        this.authority = entity.getAuthority();
    }

    public RolesDTO(GrantedAuthority grantedAuthority) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}

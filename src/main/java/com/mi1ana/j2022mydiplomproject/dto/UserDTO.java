package com.mi1ana.j2022mydiplomproject.dto;

import com.mi1ana.j2022mydiplomproject.model.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Collection<RoleEntity> roles;
}

package com.mi1ana.j2022mydiplomproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private String contactPhone;

    private String email;

    private Collection<RoleDto> roles;
}

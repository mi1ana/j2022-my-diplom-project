package com.mi1ana.j2022mydiplomproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CustomersDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String contactPhone;
    private String email;
    private String address;
}

package com.mi1ana.j2022mydiplomproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ProductDTO {
    private Long id;
    private String name;
    private Integer quantity;
    private Double price;
}

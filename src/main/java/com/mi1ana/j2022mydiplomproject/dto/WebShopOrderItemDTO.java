package com.mi1ana.j2022mydiplomproject.dto;

import com.mi1ana.j2022mydiplomproject.model.ProductEntity;
import com.mi1ana.j2022mydiplomproject.model.WebShopOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class WebShopOrderItemDTO {
    private Long id;
    private WebShopOrderEntity parent;
    private ProductEntity product;
    private Integer quantity;
    private Double price;
    private Double cost;
}

package com.mi1ana.j2022mydiplomproject.dto;

import com.mi1ana.j2022mydiplomproject.model.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class WebShopOrderDTO {
    private Long id;
    private CustomersEntity customer;
    private Date createdAt;
    private StoreWorkersEntity updateBy;
    private Date updatedAt;
    private StatusOrderEntity status;
    private DeliveryAreaEntity delivery;
    private ProductEntity pickupPoint;
    private Set<WebShopOrderItemEntity> items;
}

package com.mi1ana.j2022mydiplomproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class DeliveryAreaDTO {
    private Long id;
    private String deliveryName;
    private boolean pickup;
    private Double deliveryCost;
    private boolean byDefault;
}

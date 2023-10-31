package com.mi1ana.j2022mydiplomproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "delivery_area")
@Entity
public class DeliveryAreaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "delivery_name")
    private String deliveryName;
    @Column(name = "is_pickup")
    private boolean pickup;
    @Column(name = "delivery_cost")
    private Double deliveryCost;
    @Column(name = "is_default")
    private boolean byDefault;
}

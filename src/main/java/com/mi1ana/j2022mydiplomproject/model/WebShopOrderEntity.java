package com.mi1ana.j2022mydiplomproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ws_orders")
@Entity
public class WebShopOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name= "customer_id")
    private CustomersEntity customer;

    @Column(name="create_date")
    private Date createdAt;
    @OneToOne
    @JoinColumn(name = "worker_id")
    private StoreWorkersEntity updateBy;
    @Column(name="update_date")
    private Date updatedAt;
    @OneToOne
    @JoinColumn(name = "status_id")
    private StatusOrderEntity status;

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private DeliveryAreaEntity delivery;

    @OneToOne
    @JoinColumn(name = "pickup_id")
    private ProductEntity pickupPoint;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "parent")
    private Set<WebShopOrderItemEntity> items;
}

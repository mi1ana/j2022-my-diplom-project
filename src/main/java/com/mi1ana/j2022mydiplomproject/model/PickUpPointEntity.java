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
@Table(name = "pickup_points")
@Entity
public class PickUpPointEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "sap_code")
    private String sapCode;
    @OneToOne
    @JoinColumn(name= "region_id")
    private RegionEntity region;
    @Column(name = "adress")
    private String adress;


}

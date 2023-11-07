package com.mi1ana.j2022mydiplomproject.dto;

import com.mi1ana.j2022mydiplomproject.model.RegionEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PickUpPointDTO {
    private Long id;
    private String sapCode;
    private RegionEntity region;
    private String address;
}

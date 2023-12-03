package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.RoleDto;
import com.mi1ana.j2022mydiplomproject.model.RoleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = RoleMapper.class)
public interface RoleMapperList {

    List<RoleDto> mapToDtos (List<RoleEntity> entities);

    List<RoleEntity> mapToEntities (List<RoleDto> dtos);
}

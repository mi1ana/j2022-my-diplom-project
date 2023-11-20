package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.RoleDto;
import com.mi1ana.j2022mydiplomproject.model.RoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDto map(RoleEntity entity);

    RoleEntity map(RoleDto dto);
}

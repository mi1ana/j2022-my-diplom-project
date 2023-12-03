package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.UserDto;
import com.mi1ana.j2022mydiplomproject.model.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = RoleMapperList.class)
public interface UserMapper {

    UserDto map(UserEntity entity);


    UserEntity map(UserDto dto);
}

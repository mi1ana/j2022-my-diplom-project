package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.UserDto;
import com.mi1ana.j2022mydiplomproject.model.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto map(UserEntity entity);

    @InheritInverseConfiguration
    UserEntity map(UserDto dto);
}

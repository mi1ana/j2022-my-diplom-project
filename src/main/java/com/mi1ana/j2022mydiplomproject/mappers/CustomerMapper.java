package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Customer;
import com.mi1ana.j2022mydiplomproject.model.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer map(UserEntity entity);

    @InheritInverseConfiguration
    UserEntity map(Customer dto);
}

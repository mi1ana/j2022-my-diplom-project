package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Complexity;
import com.mi1ana.j2022mydiplomproject.model.ComplexityEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComplexityMapper {

    Complexity map(ComplexityEntity entity);

    ComplexityEntity map(Complexity dto);
}

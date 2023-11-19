package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Result;
import com.mi1ana.j2022mydiplomproject.model.ResultEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResultMapper {

    Result map(ResultEntity entity);

    ResultEntity map(Result dto);
}

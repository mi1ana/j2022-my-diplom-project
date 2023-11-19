package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Question;
import com.mi1ana.j2022mydiplomproject.model.QuestionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    Question map(QuestionEntity entity);

    QuestionEntity map(Question dto);
}

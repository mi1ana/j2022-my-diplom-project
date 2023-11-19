package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Answer;
import com.mi1ana.j2022mydiplomproject.model.AnswersEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnswerMapper {

   Answer map(AnswersEntity entity);

   AnswersEntity map(Answer dto);
}

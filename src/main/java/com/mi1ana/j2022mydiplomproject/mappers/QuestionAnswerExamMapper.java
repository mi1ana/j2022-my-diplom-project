package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.QuestionAnswerExam;
import com.mi1ana.j2022mydiplomproject.model.QuestionAnswerExamEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionAnswerExamMapper {

    QuestionAnswerExam map(QuestionAnswerExamEntity entity);

    QuestionAnswerExamEntity map(QuestionAnswerExam dto);

}

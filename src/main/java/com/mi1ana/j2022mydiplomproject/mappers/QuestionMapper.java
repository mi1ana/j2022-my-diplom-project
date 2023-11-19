package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Question;
import com.mi1ana.j2022mydiplomproject.model.QuestionsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    Question map(QuestionsEntity entity);

    QuestionsEntity map(Question dto);
}

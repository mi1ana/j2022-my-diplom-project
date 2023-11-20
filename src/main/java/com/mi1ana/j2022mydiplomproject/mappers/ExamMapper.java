package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Exam;
import com.mi1ana.j2022mydiplomproject.model.ExamEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExamMapper {

    Exam map(ExamEntity entity);

    ExamEntity map(Exam dto);
}

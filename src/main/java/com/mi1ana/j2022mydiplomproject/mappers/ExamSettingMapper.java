package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.ExamSetting;
import com.mi1ana.j2022mydiplomproject.model.ExamSettingEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExamSettingMapper {

    ExamSetting map(ExamSettingEntity entity);

    ExamSettingEntity map(ExamSetting dto);
}

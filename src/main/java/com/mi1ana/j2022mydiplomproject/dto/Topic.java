package com.mi1ana.j2022mydiplomproject.dto;


import com.mi1ana.j2022mydiplomproject.model.ExamSettingEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

    private Long id;

    private String nameTopic;

    private List<Question> questions;

    private List<ExamSetting> settings;
}

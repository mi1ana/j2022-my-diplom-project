package com.mi1ana.j2022mydiplomproject.view;


import com.mi1ana.j2022mydiplomproject.dto.Complexity;
import com.mi1ana.j2022mydiplomproject.dto.ExamSetting;
import com.mi1ana.j2022mydiplomproject.dto.Topic;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ExamSettingsView {

    private Topic topic;

    private List<ExamSetting> examSettings;


}

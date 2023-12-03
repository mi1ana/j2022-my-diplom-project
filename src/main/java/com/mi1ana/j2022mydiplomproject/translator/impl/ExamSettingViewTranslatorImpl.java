package com.mi1ana.j2022mydiplomproject.translator.impl;


import com.mi1ana.j2022mydiplomproject.dto.ExamSetting;
import com.mi1ana.j2022mydiplomproject.dto.Topic;
import com.mi1ana.j2022mydiplomproject.translator.ExamSettingViewTranslator;
import com.mi1ana.j2022mydiplomproject.view.ExamSettingsView;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExamSettingViewTranslatorImpl implements ExamSettingViewTranslator {


    @Override
    public ExamSettingsView fromDtoToView(List<ExamSetting> settingList, Topic topic) {
        return ExamSettingsView.builder()
                .topic(topic)
                .examSettings(settingList)
                .build();
    }
}

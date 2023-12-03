package com.mi1ana.j2022mydiplomproject.service;


import com.mi1ana.j2022mydiplomproject.dto.ExamSetting;
import com.mi1ana.j2022mydiplomproject.dto.Topic;
import com.mi1ana.j2022mydiplomproject.view.ExamSettingsView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExamSettingService {

    ExamSettingsView loadSettingsByTopic(Topic topic);

    ExamSettingsView addedSetting(ExamSettingsView view, ExamSetting setting);

    ExamSettingsView deleteSetting(ExamSettingsView view, ExamSetting setting);

    ExamSettingsView changeSetting(ExamSettingsView view, ExamSetting setting);

}

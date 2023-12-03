package com.mi1ana.j2022mydiplomproject.translator;


import com.mi1ana.j2022mydiplomproject.dto.ExamSetting;
import com.mi1ana.j2022mydiplomproject.dto.Topic;
import com.mi1ana.j2022mydiplomproject.view.ExamSettingsView;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ExamSettingViewTranslator {

    ExamSettingsView fromDtoToView(List<ExamSetting> settingList, Topic topic);


}

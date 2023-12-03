package com.mi1ana.j2022mydiplomproject.service.impl;


import com.mi1ana.j2022mydiplomproject.dto.ExamSetting;
import com.mi1ana.j2022mydiplomproject.dto.Topic;
import com.mi1ana.j2022mydiplomproject.mappers.ExamMapper;
import com.mi1ana.j2022mydiplomproject.mappers.ExamSettingMapper;
import com.mi1ana.j2022mydiplomproject.mappers.TopicMapper;
import com.mi1ana.j2022mydiplomproject.repo.ExamSettingRepo;
import com.mi1ana.j2022mydiplomproject.service.ExamSettingService;
import com.mi1ana.j2022mydiplomproject.translator.ExamSettingViewTranslator;
import com.mi1ana.j2022mydiplomproject.view.ExamSettingsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExamSettingServiceImpl implements ExamSettingService {

    @Autowired
    private ExamSettingRepo examSettingRepo;

    @Autowired
    private TopicMapper topicMapper;

    @Autowired
    private ExamSettingMapper examSettingMapper;

    @Autowired
    private ExamSettingViewTranslator examSettingViewTranslator;

    @Override
    public ExamSettingsView loadSettingsByTopic(Topic topic) {
        List<ExamSetting> examSettings = examSettingMapper.map(examSettingRepo.findByTopicId(topic.getId()));
        return examSettingViewTranslator.fromDtoToView(examSettings, topic);
    }

    @Override
    public ExamSettingsView addedSetting(ExamSettingsView view, ExamSetting setting) {
        if(view.getExamSettings().stream().filter(examSetting ->examSetting.equals(setting) ).findFirst().isPresent()){
            examSettingRepo.save(examSettingMapper.map(setting));
        }
        return loadSettingsByTopic(view.getTopic());
    }

    @Override
    public ExamSettingsView deleteSetting(ExamSettingsView view, ExamSetting setting) {
        if(view.getExamSettings().stream().filter(examSetting ->examSetting.equals(setting) ).findFirst().isPresent()){
            examSettingRepo.delete(examSettingMapper.map(setting));
        }
        return loadSettingsByTopic(view.getTopic());
    }

    @Override
    public ExamSettingsView changeSetting(ExamSettingsView view, ExamSetting setting) {
        return addedSetting(view, setting);
    }
}

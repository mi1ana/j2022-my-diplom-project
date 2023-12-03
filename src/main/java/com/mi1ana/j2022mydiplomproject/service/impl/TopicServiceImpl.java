package com.mi1ana.j2022mydiplomproject.service.impl;


import com.mi1ana.j2022mydiplomproject.dto.Topic;
import com.mi1ana.j2022mydiplomproject.mappers.TopicMapper;
import com.mi1ana.j2022mydiplomproject.model.TopicEntity;
import com.mi1ana.j2022mydiplomproject.repo.TopicRepo;
import com.mi1ana.j2022mydiplomproject.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepo topicRepo;

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public List<Topic> loadAllTopics() {
          return ((List<TopicEntity>) topicRepo.findAll()).stream().map(entity -> topicMapper.map(entity)).toList();
    }

    @Override
    public List<Topic> changeTopic(Topic topic) {
        topicRepo.save(topicMapper.map(topic));
        return loadAllTopics();
    }

    @Override
    public List<Topic> deleteTopic(Topic topic) {
        topicRepo.delete(topicMapper.map(topic));
        return loadAllTopics();
    }
}

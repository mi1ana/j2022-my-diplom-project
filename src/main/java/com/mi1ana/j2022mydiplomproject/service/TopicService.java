package com.mi1ana.j2022mydiplomproject.service;


import com.mi1ana.j2022mydiplomproject.dto.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TopicService {

    List<Topic> loadAllTopics();

    List<Topic> changeTopic(Topic topic);

    List<Topic> deleteTopic(Topic topic);
}

package com.mi1ana.j2022mydiplomproject.repo;


import com.mi1ana.j2022mydiplomproject.model.ExamSettingEntity;
import com.mi1ana.j2022mydiplomproject.model.TopicEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface ExamSettingRepo extends CrudRepository<ExamSettingEntity, Long> {

    @Query(value = "SELECT es.* FROM exam_setting es WHERE es.topic_id = ?1", nativeQuery = true)
    List<ExamSettingEntity> findByTopicId(Long topicId);
}

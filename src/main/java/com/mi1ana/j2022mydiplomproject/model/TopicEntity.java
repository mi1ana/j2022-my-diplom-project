package com.mi1ana.j2022mydiplomproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "topics")
public class TopicEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameTopic;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_id")
    private List<QuestionEntity> questions;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_id")
    private List<ExamSettingEntity> settings;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "topic_id")
    private List<ExamEntity> exams;
}

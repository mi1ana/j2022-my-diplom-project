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
public class TopicsEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameTopic;

    @OneToMany
    @JoinColumn(name = "topic_id")
    private List<QuestionsEntity> questions;

    @OneToMany
    @JoinColumn(name = "topic_id")
    private List<ExamSettingEntity> settings;
}

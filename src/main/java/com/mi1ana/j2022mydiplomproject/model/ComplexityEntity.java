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
@Table(name = "complexity")
public class ComplexityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String complexity;

    private Integer pointAnswer;

    private boolean hasAnswer;

    @OneToMany
    @JoinColumn(name = "complexity_id")
    private List<QuestionEntity> questions;

    @OneToMany
    @JoinColumn(name = "complexity_id")
    private List<ExamSettingEntity> examSettings;
}

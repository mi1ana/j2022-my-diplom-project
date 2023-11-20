package com.mi1ana.j2022mydiplomproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exam")
public class ExamEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


//    @ManyToMany
//    @JoinTable(name = "exam_questions",
//            joinColumns = @JoinColumn(name = "exam_id"),
//            inverseJoinColumns = @JoinColumn(name = "qestion_id"))
//    private Set<QuestionEntity> questions;

    @OneToMany
    @JoinColumn(name="answer_exam_id")
    private Set<QuestionAnswerExamEntity> answers;


    private Date dateExam;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "examiner_id")
    private UserEntity examiner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")
    private UserEntity subject;

    private Double result;

    private Date dateVerified;

    private boolean verified;
}

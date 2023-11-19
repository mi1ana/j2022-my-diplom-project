package com.mi1ana.j2022mydiplomproject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "result")
public class ResultEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id")
    private ExamEntity exam;

    private Date dateExam;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "examiner_id")
    private UserEntity examiner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")
    private UserEntity subject;

    private Double result;

    private boolean verified;
}

package com.mi1ana.j2022mydiplomproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Exam {

    private Long id;

    private Set<Question> questions;

    private Set<QuestionAnswerExam> answers;


    private Date dateExam;

    private Customer examiner;

    private Customer subject;

    private Double result;

    private Date dateVerified;

    private boolean verified;
}

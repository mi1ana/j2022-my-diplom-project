package com.mi1ana.j2022mydiplomproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAnswerExam {

    private Long id;

    private String question;

    private String answer;

    private boolean correct;

    private Integer resultAnswer;
}

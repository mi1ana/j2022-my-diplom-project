package com.mi1ana.j2022mydiplomproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private Long id;

    private Exam exam;

    private Date dateExam;

    private UserDto examiner;

    private UserDto subject;

    private Double result;

    private boolean verified;
}

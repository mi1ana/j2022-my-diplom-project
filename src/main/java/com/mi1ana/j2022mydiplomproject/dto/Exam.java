package com.mi1ana.j2022mydiplomproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Exam {

    private Long id;

    private String examTopic;

    private Set<Question> questions;
}

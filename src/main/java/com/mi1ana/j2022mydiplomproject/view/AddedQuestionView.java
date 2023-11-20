package com.mi1ana.j2022mydiplomproject.view;


import com.mi1ana.j2022mydiplomproject.dto.Complexity;
import com.mi1ana.j2022mydiplomproject.dto.Question;
import com.mi1ana.j2022mydiplomproject.dto.Topic;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AddedQuestionView {

    private Question question;

    private Topic topic;

    private Complexity complexity;
}

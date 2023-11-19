package com.mi1ana.j2022mydiplomproject.mappers;


import com.mi1ana.j2022mydiplomproject.dto.Topic;
import com.mi1ana.j2022mydiplomproject.model.TopicsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TopicMapper {

    Topic map(TopicsEntity entity);

    TopicsEntity map(Topic dto);
}

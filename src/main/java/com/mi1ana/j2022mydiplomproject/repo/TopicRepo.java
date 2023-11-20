package com.mi1ana.j2022mydiplomproject.repo;


import com.mi1ana.j2022mydiplomproject.model.TopicEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepo extends CrudRepository<TopicEntity, Long> {
}

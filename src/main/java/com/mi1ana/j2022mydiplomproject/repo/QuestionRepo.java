package com.mi1ana.j2022mydiplomproject.repo;


import com.mi1ana.j2022mydiplomproject.model.QuestionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<QuestionEntity, Long> {
}

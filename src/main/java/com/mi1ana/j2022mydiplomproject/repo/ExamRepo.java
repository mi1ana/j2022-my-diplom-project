package com.mi1ana.j2022mydiplomproject.repo;


import com.mi1ana.j2022mydiplomproject.model.ExamEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepo extends CrudRepository<ExamEntity, Long> {
}

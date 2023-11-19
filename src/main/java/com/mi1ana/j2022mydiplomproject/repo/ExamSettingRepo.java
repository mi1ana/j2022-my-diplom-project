package com.mi1ana.j2022mydiplomproject.repo;


import com.mi1ana.j2022mydiplomproject.model.ExamSettingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamSettingRepo extends CrudRepository<ExamSettingEntity, Long> {
}

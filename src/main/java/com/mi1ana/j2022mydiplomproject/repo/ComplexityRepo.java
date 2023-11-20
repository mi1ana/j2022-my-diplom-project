package com.mi1ana.j2022mydiplomproject.repo;

import com.mi1ana.j2022mydiplomproject.model.ComplexityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexityRepo extends CrudRepository<ComplexityEntity, Long> {
}

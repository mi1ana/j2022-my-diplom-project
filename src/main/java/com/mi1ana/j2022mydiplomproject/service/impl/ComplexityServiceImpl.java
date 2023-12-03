package com.mi1ana.j2022mydiplomproject.service.impl;

import com.mi1ana.j2022mydiplomproject.dto.Complexity;
import com.mi1ana.j2022mydiplomproject.mappers.ComplexityMapper;
import com.mi1ana.j2022mydiplomproject.model.ComplexityEntity;
import com.mi1ana.j2022mydiplomproject.repo.ComplexityRepo;
import com.mi1ana.j2022mydiplomproject.service.ComplexityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComplexityServiceImpl implements ComplexityService {

    @Autowired
    private ComplexityRepo complexityRepo;

    @Autowired
    private ComplexityMapper complexityMapper;

    @Override
    public List<Complexity> loadAllComplexity() {
        return ((List<ComplexityEntity>)complexityRepo.findAll()).stream()
                .map(entity -> complexityMapper.map(entity)).toList();
    }

    @Override
    public List<Complexity> changeComplexity(Complexity complexity) {
        complexityRepo.save(complexityMapper.map(complexity));
        return loadAllComplexity();
    }

    @Override
    public List<Complexity> deleteComplexity(Complexity complexity) {
        complexityRepo.delete(complexityMapper.map(complexity));
        return loadAllComplexity();
    }
}

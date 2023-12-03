package com.mi1ana.j2022mydiplomproject.service;


import com.mi1ana.j2022mydiplomproject.dto.Complexity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComplexityService {

    List<Complexity> loadAllComplexity();

    List<Complexity> changeComplexity(Complexity complexity);

    List<Complexity> deleteComplexity(Complexity complexity);
}

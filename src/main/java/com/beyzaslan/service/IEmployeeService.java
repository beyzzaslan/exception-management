package com.beyzaslan.service;

import com.beyzaslan.dto.DtoEmployee;
import com.beyzaslan.model.Employee;

public interface IEmployeeService {
    public DtoEmployee findEmployeeById(Long id);
}

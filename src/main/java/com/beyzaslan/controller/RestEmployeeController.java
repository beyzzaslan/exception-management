package com.beyzaslan.controller;

import com.beyzaslan.dto.DtoEmployee;
import com.beyzaslan.model.RootEntity;

public interface RestEmployeeController {
    public RootEntity<DtoEmployee>  findEmployeeById(Long id);
}

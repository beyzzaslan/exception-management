package com.beyzaslan.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DtoEmployee {
    public Long id;
    public String name;
    //buradaki yere departmenti de koymam laızm
    private DtoDepartment department;
}

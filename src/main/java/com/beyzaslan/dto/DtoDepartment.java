package com.beyzaslan.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DtoDepartment {
    public Long id;
    public String name;
    public String location;
}

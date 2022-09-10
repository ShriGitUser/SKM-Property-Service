package com.skm.property.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OwnerDto {
    private Integer ownerId;
    private PersonDto owner;
    private Double share=100.00;
}

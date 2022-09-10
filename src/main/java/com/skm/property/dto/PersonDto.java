package com.skm.property.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PersonDto {
    private Integer personId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String sex;
    private Double age;
}

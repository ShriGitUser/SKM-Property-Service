package com.skm.property.service;

import com.skm.property.dto.OwnerDto;
import com.skm.property.dto.PropertyDto;
import com.skm.property.enums.PropertyType;

import java.util.List;

public interface PropertyService {
    List<PropertyDto> getAllProperties();

    PropertyDto getPropertyById(Integer id);

    List<OwnerDto> getPropertyOwnersById(Integer id);

    PropertyDto addNewProperty(PropertyDto property);

    PropertyDto updateExistingPropertyWithNewPropertyValues(PropertyDto newProperty, Integer id);

    void deleteProperty(Integer id);

    List<PropertyDto> getAllProperties(PropertyType propertyType);
}

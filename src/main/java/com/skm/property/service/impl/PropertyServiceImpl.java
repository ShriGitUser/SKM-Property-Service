package com.skm.property.service.impl;

import com.skm.property.dto.OwnerDto;
import com.skm.property.dto.PropertyDto;
import com.skm.property.enums.PropertyType;
import com.skm.property.exception.RecordNotFoundException;
import com.skm.property.pattern.strategy.PropertyDetailsProviderContext;
import com.skm.property.pattern.strategy.PropertyDetailsProviderStrategy;
import com.skm.property.service.PropertyService;
import com.skm.property.utils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PropertyServiceImpl implements PropertyService {
    
    @Autowired
    PropertyDetailsProviderContext propertyDetailsProviderContext;

    @Override
    public List<PropertyDto> getAllProperties() {
        return PropertyUtils.getListOfDummyProperties();
    }

    @Override
    public List<PropertyDto> getAllProperties(PropertyType propertyType) {
        PropertyDetailsProviderStrategy propertyDetailsProviderStrategy = propertyDetailsProviderContext.getPropertyDetailsProviderStrategy(propertyType);
        return propertyDetailsProviderStrategy.getPropertyDetails();
    }

    @Override
    public PropertyDto getPropertyById(Integer id) {
        List<PropertyDto> properties = getAllProperties();
        return properties.stream().filter(one -> id.equals(one.getPropertyId())).findFirst().orElseThrow(()->new RecordNotFoundException("No property find with id-{}"+id));
    }

    @Override
    public List<OwnerDto> getPropertyOwnersById(Integer id) {
        return null;
    }

    @Override
    public PropertyDto addNewProperty(PropertyDto property) {
        return null;
    }

    @Override
    public PropertyDto updateExistingPropertyWithNewPropertyValues(PropertyDto newProperty, Integer id) {
        return null;
    }

    @Override
    public void deleteProperty(Integer id) {

    }


}

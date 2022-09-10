package com.skm.property.pattern.strategy.impl;

import com.skm.property.dto.PropertyDto;
import com.skm.property.enums.PropertyType;
import com.skm.property.pattern.strategy.PropertyDetailsProviderStrategy;
import com.skm.property.utils.PropertyUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LandPropertyDetailsProviderStrategy implements PropertyDetailsProviderStrategy {
    @Override
    public List<PropertyDto> getPropertyDetails() {
        System.out.println("LandPropertyDetailsProviderStrategy:getPropertyDetails called");
        List<PropertyDto> allProperties = PropertyUtils.getListOfDummyProperties();
        return allProperties.stream().filter(property -> PropertyType.LAND.equals(property.getPropertyType())).collect(Collectors.toList());
    }

    @Override
    public String getContextKey() {
        return PropertyType.LAND.name();
    }

}

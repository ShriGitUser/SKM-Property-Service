package com.skm.property.pattern.strategy;

import com.skm.property.dto.PropertyDto;

import java.util.List;

public interface PropertyDetailsProviderStrategy {
    List<PropertyDto> getPropertyDetails();

    String getContextKey();
}

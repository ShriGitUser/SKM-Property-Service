package com.skm.property.learning.comparator;

import com.skm.property.dto.PropertyDto;

import java.util.Comparator;

public class PropertyAddressComparator implements Comparator<PropertyDto> {
    @Override
    public int compare(PropertyDto o1, PropertyDto o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}

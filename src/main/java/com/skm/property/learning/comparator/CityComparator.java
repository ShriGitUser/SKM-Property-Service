package com.skm.property.learning.comparator;

import com.skm.property.dto.AddressDto;

import java.util.Comparator;

public class CityComparator implements Comparator<AddressDto> {
    @Override
    public int compare(AddressDto o1, AddressDto o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}

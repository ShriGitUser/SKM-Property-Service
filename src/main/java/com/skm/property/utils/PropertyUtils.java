package com.skm.property.utils;

import com.skm.property.dto.AddressDto;
import com.skm.property.dto.PropertyDto;
import com.skm.property.enums.PropertySubType;
import com.skm.property.enums.PropertyType;

import java.util.ArrayList;
import java.util.List;

public class PropertyUtils {
    public static List<PropertyDto> getListOfDummyProperties() {
        List<PropertyDto> propertyDtos = new ArrayList<>();
        PropertyDto property1 = new PropertyDto();
        property1.setPropertyId(1);
        property1.setPropertyType(PropertyType.HOME);
        property1.setPropertySubType(PropertySubType.HOME_APARTMENT);
        property1.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("11 South Dearborn")
                .build());
        propertyDtos.add(property1);

        PropertyDto property2 = new PropertyDto();
        property2.setPropertyId(2);
        property2.setPropertyType(PropertyType.HOME);
        property2.setPropertySubType(PropertySubType.HOME_APARTMENT);
        property2.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("12 South Dearborn")
                .build());
        propertyDtos.add(property2);

        PropertyDto property3 = new PropertyDto();
        property3.setPropertyId(3);
        property3.setPropertyType(PropertyType.HOME);
        property3.setPropertySubType(PropertySubType.HOME_APARTMENT);
        property3.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("13 South Dearborn")
                .build());
        propertyDtos.add(property3);

        PropertyDto property4 = new PropertyDto();
        property4.setPropertyId(4);
        property4.setPropertyType(PropertyType.HOME);
        property4.setPropertySubType(PropertySubType.HOME_APARTMENT);
        property4.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("14 South Dearborn")
                .build());
        propertyDtos.add(property4);

        PropertyDto property5 = new PropertyDto();
        property5.setPropertyId(5);
        property5.setPropertyType(PropertyType.HOME);
        property5.setPropertySubType(PropertySubType.HOME_APARTMENT);
        property5.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .addressField1("15 South Dearborn")
                .build());
        propertyDtos.add(property5);



        PropertyDto property11 = new PropertyDto();
        property11.setPropertyId(11);
        property11.setPropertyType(PropertyType.LAND);
        property11.setPropertySubType(PropertySubType.LAND_FARM);
        property11.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("111 South Dearborn")
                .build());
        propertyDtos.add(property11);

        PropertyDto property12 = new PropertyDto();
        property12.setPropertyId(12);
        property12.setPropertyType(PropertyType.LAND);
        property12.setPropertySubType(PropertySubType.LAND_FARM);
        property12.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("112 South Dearborn")
                .build());
        propertyDtos.add(property12);

        PropertyDto property13 = new PropertyDto();
        property13.setPropertyId(13);
        property13.setPropertyType(PropertyType.LAND);
        property13.setPropertySubType(PropertySubType.LAND_PLOT);
        property13.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("131 South Dearborn")
                .build());
        propertyDtos.add(property13);

        PropertyDto property14 = new PropertyDto();
        property14.setPropertyId(14);
        property14.setPropertyType(PropertyType.LAND);
        property14.setPropertySubType(PropertySubType.LAND_PLOT);
        property14.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .state("IL")
                .addressField1("14 South Dearborn")
                .build());
        propertyDtos.add(property14);

        PropertyDto property15 = new PropertyDto();
        property15.setPropertyId(5);
        property15.setPropertyType(PropertyType.HOME);
        property15.setPropertySubType(PropertySubType.HOME_CONDO);
        property15.setAddress(AddressDto.builder()
                .city("Chicago")
                .country("USA")
                .zipCode("12345")
                .addressField1("155 South Dearborn")
                .build());
        propertyDtos.add(property15);

        return propertyDtos;
    }
}

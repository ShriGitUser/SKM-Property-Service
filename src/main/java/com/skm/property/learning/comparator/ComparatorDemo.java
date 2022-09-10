package com.skm.property.learning.comparator;

import com.skm.property.dto.AddressDto;
import com.skm.property.dto.PropertyDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main (String args[]){
        List<AddressDto> listAddress = new ArrayList<>();
        List<PropertyDto> listProperties = new ArrayList<>();

        AddressDto one = AddressDto.builder().zipCode("12345").city("NewYork").build();
        AddressDto two = AddressDto.builder().zipCode("999").city("Paris").build();
        AddressDto three = AddressDto.builder().zipCode("123425").city("Agartala").build();
        AddressDto four = AddressDto.builder().zipCode("19456").city("Dongargarh").build();
        AddressDto five = AddressDto.builder().zipCode("9999").city("Agra").build();

        listAddress.add(one);
        listAddress.add(two);
        listAddress.add(three);
        listAddress.add(four);
        listAddress.add(five);
        Collections.sort(listAddress);

        //listAddress.stream().forEach(addr -> System.out.println(addr));

        Collections.sort(listAddress, new CityComparator());

       // listAddress.stream().forEach(addr -> System.out.println(addr));

        PropertyDto propertyOne = new PropertyDto();
        propertyOne.setAddress(one);
        listProperties.add(propertyOne);

        PropertyDto propertyTwo = new PropertyDto();
        propertyTwo.setAddress(two);
        listProperties.add(propertyTwo);

        PropertyDto propertyThree = new PropertyDto();
        propertyThree.setAddress(three);
        listProperties.add(propertyThree);

        PropertyDto propertyFour= new PropertyDto();
        propertyFour.setAddress(four);
        listProperties.add(propertyFour);

        PropertyDto propertyFive = new PropertyDto();
        propertyFive.setAddress(five);
        listProperties.add(propertyFive);

        Collections.sort(listProperties, new PropertyAddressComparator());
        //By Address Zipcode
        listProperties.stream().forEach(prop -> System.out.println(prop));


    }

}

package com.skm.property.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class AddressDto implements Serializable , Comparable<AddressDto>{

    private static final long serialVersionUID = -3848581633345300290L;

    private String city;
    private String state;
    private String zipCode;
    private String addressField1;
    private String addressField2;
    private String addressField3;
    private String landmark;
    private String country;

    @Override
    public int compareTo(AddressDto other) {
        //-Ve this is smaller then other
        //+Ve this is bigger then other
        //0 this is same as other
        return this.zipCode.compareTo(other.zipCode);
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", addressField1='" + addressField1 + '\'' +
                ", addressField2='" + addressField2 + '\'' +
                ", addressField3='" + addressField3 + '\'' +
                ", landmark='" + landmark + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

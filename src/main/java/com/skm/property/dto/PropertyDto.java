package com.skm.property.dto;

import com.skm.property.enums.PropertySubType;
import com.skm.property.enums.PropertyType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PropertyDto implements Serializable {

    private static final long serialVersionUID = -8450128761154860029L;
    int propertyId;
    PropertyType propertyType;
    PropertySubType propertySubType;
    AddressDto address;
    List<OwnerDto> owners;
    OwnerDto primaryOwner;
}

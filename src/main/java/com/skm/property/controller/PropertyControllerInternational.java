package com.skm.property.controller;

import com.skm.property.dto.OwnerDto;
import com.skm.property.dto.PropertyDto;
import com.skm.property.enums.PropertyType;
import com.skm.property.service.PropertyService;
import com.skm.property.utils.PropertyURIConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v2", name = "used for International sites")
public class PropertyControllerInternational {

    @Autowired
    PropertyService propertyService;

    @GetMapping(value = PropertyURIConstants.GET_ALL_THE_PROPERTIES)
    public ResponseEntity<List<PropertyDto>> getProperties(){
        List<PropertyDto> properties = propertyService.getAllProperties();
        return new ResponseEntity<List<PropertyDto>>(properties, HttpStatus.OK);
    }

    @GetMapping(value = PropertyURIConstants.GET_ALL_THE_PROPERTIES + "/byType/{propertyType}")
    public ResponseEntity<List<PropertyDto>> getPropertiesByPropertyType(@PathVariable PropertyType propertyType){
        List<PropertyDto> properties = propertyService.getAllProperties(propertyType);
        return new ResponseEntity<List<PropertyDto>>(properties, HttpStatus.OK);
    }

    @GetMapping(value = PropertyURIConstants.GET_ONE_OF_THE_PROPERTY)
    public ResponseEntity<PropertyDto> getPropertyById(@PathVariable Integer id ){
        PropertyDto property = propertyService.getPropertyById(id);
        return new ResponseEntity<PropertyDto>(property, HttpStatus.OK);
    }

    @GetMapping(value = PropertyURIConstants.GET_ALL_PROPERTY_OWNERS)
    public ResponseEntity<List<OwnerDto>> getPropertyOwnersByPropertyId(@PathVariable Integer id ){
        List<OwnerDto> owners = propertyService.getPropertyOwnersById(id);
        return new ResponseEntity<List<OwnerDto>>(owners, HttpStatus.OK);
    }

    @PostMapping(value = PropertyURIConstants.POST_CREATE_PROPERTY)
    public ResponseEntity<PropertyDto> createProperty(@RequestBody PropertyDto newProperty){
        PropertyDto savedProperty = propertyService.addNewProperty(newProperty);
        return new ResponseEntity<PropertyDto>(savedProperty, HttpStatus.OK);
    }

    @PutMapping(value = PropertyURIConstants.PUT_UPDATE_ONE_PROPERTY)
    public ResponseEntity<PropertyDto> updateProperty(@RequestBody PropertyDto newProperty, @PathVariable Integer id){
        PropertyDto savedProperty = propertyService.updateExistingPropertyWithNewPropertyValues(newProperty, id);
        return new ResponseEntity<PropertyDto>(savedProperty, HttpStatus.OK);
    }

    @DeleteMapping(value = PropertyURIConstants.DELETE_DELETE_ONE_PROPERTY)
    public ResponseEntity deleteProperty(@PathVariable Integer id){
        propertyService.deleteProperty(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}

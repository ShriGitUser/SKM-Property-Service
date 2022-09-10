package com.skm.property.controller;

import com.skm.property.dto.PropertyDto;
import com.skm.property.service.PropertyService;
import com.skm.property.utils.PropertyURIConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1", name = "used for Indian sites")
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @GetMapping(value = PropertyURIConstants.GET_ALL_PROPERTIES)
    public ResponseEntity<List<PropertyDto>> getProperties(){
        List<PropertyDto> properties = propertyService.getAllProperties();
        return new ResponseEntity<List<PropertyDto>>(properties, HttpStatus.OK);
    }

    @GetMapping(value = PropertyURIConstants.GET_PROPERTY)
    public ResponseEntity<PropertyDto> getPropertyById(@PathVariable Integer id ){
        PropertyDto property = propertyService.getPropertyById(id);
        return new ResponseEntity<PropertyDto>(property, HttpStatus.OK);
    }



}

package com.skm.property.controller;

import com.skm.property.utils.PropertyURIConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class HealthCheckController {
    @RequestMapping(value = PropertyURIConstants.HEALTH_CHECK, method = RequestMethod.GET)
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<String>("Application is healthy", HttpStatus.OK);
    }
}

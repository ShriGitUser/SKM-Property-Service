package com.skm.property.pattern.strategy;

import com.skm.property.enums.PropertyType;
import com.skm.property.exception.PropertyTypeUnsupportedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service("propertyDetailsProviderContext")
public class PropertyDetailsProviderContext {
    private PropertyDetailsProviderStrategy propertyDetailsProviderStrategy;
    private Map<String,PropertyDetailsProviderStrategy> propertyDetailsProviderStrategies;

    @Autowired
    public void setPropertyDetailsProviderStrategies(Set<PropertyDetailsProviderStrategy> pdpStrategySet){
        this.propertyDetailsProviderStrategies = new HashMap<>();
        pdpStrategySet.stream().forEach(pdpStrategy -> this.propertyDetailsProviderStrategies.put(pdpStrategy.getContextKey(),pdpStrategy));
    }
    public void setPropertyDetailsProviderStrategy(PropertyDetailsProviderStrategy pdpStrategy){
        this.propertyDetailsProviderStrategy = pdpStrategy;
    }


    public void executeStrategy(){
        propertyDetailsProviderStrategy.getPropertyDetails();
    }



    public PropertyDetailsProviderStrategy getPropertyDetailsProviderStrategy(PropertyType propertyType){
        PropertyDetailsProviderStrategy propertyDetailsProviderStrategy =  propertyDetailsProviderStrategies.get(propertyType.name());
        if(propertyDetailsProviderStrategy == null){
            throw new PropertyTypeUnsupportedException("No Service available to get property details for property of type"+ propertyType);
        }
        return propertyDetailsProviderStrategy;
    }
}

package com.skm.property.learning.beanscope;

import com.skm.property.dto.AddressDto;
import com.skm.property.dto.PropertyDto;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SampleBeansConfiguration {
    @Bean( "single")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public PropertyDto getSingletonProperty(){
        return new PropertyDto();
    }

    @Bean("proto")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PropertyDto getPrototypeProperty(){
        return new PropertyDto();
    }
}

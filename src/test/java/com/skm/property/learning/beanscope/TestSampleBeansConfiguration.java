package com.skm.property.learning.beanscope;

import com.skm.property.dto.PropertyDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class TestSampleBeansConfiguration {

    @Autowired
    @Qualifier("single")
    PropertyDto singletonProperty1;

    @Autowired
    @Qualifier("single")
    PropertyDto singletonProperty2;


    @Autowired
    @Qualifier("proto")
    PropertyDto prototypeProperty1;

    @Autowired
    @Qualifier("proto")
    PropertyDto prototypeProperty2;

    @Test
    public void testSampleBeansSingleton(){
        singletonProperty1.setPropertyId(9999);
        singletonProperty2.setPropertyId(4444);
        System.out.println(singletonProperty1.getPropertyId());
        System.out.println(singletonProperty2.getPropertyId());
        assert(singletonProperty1.equals(singletonProperty2));
    }


    @Test
    public void testSampleBeansPrototype(){
        prototypeProperty1.setPropertyId(22222);
        prototypeProperty2.setPropertyId(77777);
        System.out.println(prototypeProperty1.getPropertyId());
        System.out.println(prototypeProperty2.getPropertyId());
        assert(!prototypeProperty1.equals(prototypeProperty2));
    }

}

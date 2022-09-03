package com.genspark.student.config;

import com.genspark.student.model.Address;
import com.genspark.student.model.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentPropertiesConfig {
    @Bean("addressFromJavaConfig")
    public Address address() {
        return new Address();
    }

    @Bean("phonesFromJavaConfig")
    public List<Phone> phones() {
        return new ArrayList<Phone>();
    }
}

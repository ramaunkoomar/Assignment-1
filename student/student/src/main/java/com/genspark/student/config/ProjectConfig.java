package com.genspark.student.config;

import com.genspark.student.model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import java.util.*;

@Configuration
public class ProjectConfig {

    @Autowired
    @Qualifier("addressFromJavaConfig")
    private Address address;

    @Autowired
    @Qualifier("phonesFromJavaConfig")
    private List<Phone> phones;

    @Bean(name = "studentFromJavaConfig")
    public Student student() {
        Student student = new Student();
        student.setAdd(address);
        student.setPh(phones);
        return student;
    }
}

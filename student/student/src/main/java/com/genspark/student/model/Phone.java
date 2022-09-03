package com.genspark.student.model;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}

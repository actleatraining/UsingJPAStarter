package com.example.SpringBootIntroductionDemo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Owner {

    private Long id;
    private String name;

    public Owner() {
    }

    public Owner(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

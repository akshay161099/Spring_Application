package com.example.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    private String name;
    private String age;
    private String country;
    @Id
    private String id;

    public Person() {
    }
    public Person(String name, String age, String country,String id) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

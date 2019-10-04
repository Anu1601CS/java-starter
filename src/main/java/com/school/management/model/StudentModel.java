package com.school.management.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {

    @Id
    private String id;
    private String name;
    private String roll;
    private int age;

    public StudentModel() {

    }

    public StudentModel(String id, String name, String roll, int age) {
        super();
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.age = age;
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

    public String getRoll() {
        return roll;
    }

    public void setRollNumber(String roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

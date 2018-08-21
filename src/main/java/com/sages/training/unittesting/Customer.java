package com.sages.training.unittesting;

import org.apache.commons.lang3.StringUtils;

public class Customer {

    private int age;

    private String firstName;

    private String lastName;

    public Customer(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;

        if(StringUtils.isEmpty(firstName)){
            throw new IllegalArgumentException("firstName null");
        }

        if(StringUtils.isEmpty(lastName)) {
            throw new IllegalArgumentException("lastName null");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

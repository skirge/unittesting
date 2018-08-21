package com.sages.training.unittesting;

public class AdultValidator {

    public static boolean isAdult(Customer c) {
        return c.getAge() >= 18;
    }
}

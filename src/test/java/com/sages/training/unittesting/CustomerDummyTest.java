package com.sages.training.unittesting;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CustomerDummyTest {

    @Rule
    public ExpectedException exceptions = ExpectedException.none();

    @Test
    public void testFirstNameNullException() {
        exceptions.expect(IllegalArgumentException.class);
        exceptions.expectMessage("firstName null");

        Customer c = new Customer(21,null, "");
    }
}

package com.sages.training.unittesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AdultValidatorStubTest {

    @Mock
    Customer c;

    @Test
    public void testValidAdult() {

        when(c.getAge()).thenReturn(21);

        Assert.assertTrue(AdultValidator.isAdult(c));
    }

    @Test
    public void testInvalidAdult() {

        when(c.getAge()).thenReturn(17);

        Assert.assertFalse(AdultValidator.isAdult(c));
    }
}
